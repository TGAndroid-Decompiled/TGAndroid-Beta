package nh;

import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ai;
public final class w0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int f15997a;
    public final e1 f15998b;

    public w0(e1 e1Var, int i10) {
        this.f15997a = i10;
        this.f15998b = e1Var;
    }

    @Override
    public void run(int i10, String str) {
        e1 e1Var = this.f15998b;
        e1Var.H = i10;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z4 = !e1Var.f15276n;
        joingroupcall.muted = z4;
        joingroupcall.video_stopped = z4;
        joingroupcall.call = e1Var.f15275f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i11 = e1Var.e;
        tL_inputPeerUser.user_id = AccountInstance.getInstance(i11).getUserConfig().getClientUserId();
        ConnectionsManager.getInstance(i11).sendRequest(joingroupcall, new x0(e1Var, 0));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        if (tL_error == null) {
            e1 e1Var = this.f15998b;
            if (e1Var.B == null || e1Var.f15279w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new z0(e1Var, 8));
            }
            if (e1Var.D == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                e1Var.D = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(e1Var.e).getPeer(e1Var.f15273b);
                e1Var.D.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                e1Var.D.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = e1Var.D;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = e1Var.B;
                NativeInstance.SsrcGroup[] d = e1.d(tL_groupCallParticipantVideo);
                e1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, e1Var.E, DialogObject.getPeerDialogId(e1Var.D.peer));
            }
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        e1 e1Var = this.f15998b;
        if (e1Var.B == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = e1Var.f15275f;
        getgroupparticipants.offset = "";
        int i10 = 0;
        while (i10 < iArr.length) {
            i10 = ai.d(iArr[i10], i10, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(e1Var.e).sendRequest(getgroupparticipants, new gg.c0(e1Var, iArr, j10));
    }

    @Override
    public void run(final long j10, final long j11, final int i10, final int i11) {
        String str;
        switch (this.f15997a) {
            case 3:
                final e1 e1Var = this.f15998b;
                if (e1Var.v == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                sb.append(j10);
                int i12 = (j11 > 500L ? 1 : (j11 == 500L ? 0 : -1));
                sb.append(i12 == 0 ? ", scale = 1" : "");
                sb.append(", video_channel = ");
                sb.append(i10);
                sb.append(", video_quality = ");
                sb.append(i11);
                FileLog.d(sb.toString());
                final long currentTimeMillis = System.currentTimeMillis();
                TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                tL_upload_getFile.limit = 131072;
                TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                tL_inputGroupCallStream.call = e1Var.f15275f;
                tL_inputGroupCallStream.time_ms = j10;
                if (i12 == 0) {
                    tL_inputGroupCallStream.scale = 1;
                }
                if (i10 != 0) {
                    tL_inputGroupCallStream.flags |= 1;
                    tL_inputGroupCallStream.video_channel = i10;
                    tL_inputGroupCallStream.video_quality = i11;
                }
                tL_upload_getFile.location = tL_inputGroupCallStream;
                if (i10 == 0) {
                    str = android.support.v4.media.a.n(j10, "");
                } else {
                    str = i10 + "_" + j10 + "_" + i11;
                }
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new ah.a(e1Var, str2, AccountInstance.getInstance(e1Var.e).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                        int i13;
                        String str3;
                        e1 e1Var2 = e1.this;
                        if (!e1Var2.f15279w && e1Var2.B != null) {
                            AndroidUtilities.runOnUIThread(new lh.n2(26, e1Var2, str2));
                            long j13 = currentTimeMillis;
                            long j14 = j10;
                            long j15 = j11;
                            int i14 = i10;
                            int i15 = i11;
                            String str4 = "";
                            if (tLObject != null) {
                                TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                                StringBuilder sb2 = new StringBuilder("[LivePlayer] received in ");
                                sb2.append(System.currentTimeMillis() - j13);
                                sb2.append("ms getFile{time_ms=");
                                sb2.append(j14);
                                if (j15 == 500) {
                                    str4 = ", scale = 1";
                                }
                                sb2.append(str4);
                                sb2.append(", video_channel = ");
                                sb2.append(i14);
                                sb2.append(", video_quality = ");
                                sb2.append(i15);
                                sb2.append("}: ");
                                sb2.append(tL_upload_file.bytes.limit());
                                sb2.append(" bytes");
                                FileLog.d(sb2.toString());
                                NativeInstance nativeInstance = e1Var2.B;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j14, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j12, i14, i15);
                            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                e1Var2.B.onStreamPartAvailable(j14, null, -1, j12, i14, i15);
                                AndroidUtilities.runOnUIThread(new z0(e1Var2, 4));
                            } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                AndroidUtilities.runOnUIThread(new z0(e1Var2, 6));
                                StringBuilder sb3 = new StringBuilder("[LivePlayer] received in ");
                                sb3.append(System.currentTimeMillis() - j13);
                                sb3.append("ms getFile{time_ms=");
                                sb3.append(j14);
                                if (j15 == 500) {
                                    str4 = ", scale = 1";
                                }
                                sb3.append(str4);
                                sb3.append(", video_channel = ");
                                sb3.append(i14);
                                sb3.append(", video_quality = ");
                                sb3.append(i15);
                                sb3.append("}: ");
                                sb3.append(tL_error.text);
                                sb3.append(" => rejoining");
                                FileLog.d(sb3.toString());
                            } else {
                                if (!"TIME_TOO_BIG".equals(tL_error.text) && !tL_error.text.startsWith("FLOOD_WAIT")) {
                                    i13 = -1;
                                } else {
                                    i13 = 0;
                                }
                                StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                                sb4.append(System.currentTimeMillis() - j13);
                                sb4.append("ms getFile{time_ms=");
                                sb4.append(j14);
                                if (j15 != 500) {
                                    str3 = "";
                                } else {
                                    str3 = ", scale = 1";
                                }
                                sb4.append(str3);
                                sb4.append(", video_channel = ");
                                sb4.append(i14);
                                sb4.append(", video_quality = ");
                                sb4.append(i15);
                                sb4.append("}: ");
                                sb4.append(tL_error.text);
                                sb4.append(" => ");
                                sb4.append(i13);
                                FileLog.d(sb4.toString());
                                e1Var2.B.onStreamPartAvailable(j14, null, i13, j12, i14, i15);
                            }
                        }
                    }
                }, 2, 2, e1Var.h()), 12));
                return;
            default:
                StringBuilder sb2 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb2.append(j10);
                sb2.append(j11 == 500 ? ", scale = 1" : "");
                sb2.append(i10 != 0 ? android.support.v4.media.a.k(i10, i11, ", video_channel = ", ", video_quality = ") : "");
                FileLog.d(sb2.toString());
                AndroidUtilities.runOnUIThread(new b1(i10, i11, 0, j10, this.f15998b));
                return;
        }
    }

    @Override
    public void run(long j10) {
        e1 e1Var = this.f15998b;
        int i10 = e1Var.e;
        TLRPC.GroupCall groupCall = e1Var.v;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = e1Var.f15275f;
            if (e1Var.v == null || e1Var.B == null) {
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamchannels, new f3.e(e1Var, j10, 1), 65536, 2, e1Var.h());
            return;
        }
        NativeInstance nativeInstance = e1Var.B;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, ConnectionsManager.getInstance(i10).getCurrentTimeMillis());
        }
    }
}
