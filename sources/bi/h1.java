package bi;

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
public final class h1 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int f3047a;
    public final t1 f3048b;

    public h1(t1 t1Var, int i10) {
        this.f3047a = i10;
        this.f3048b = t1Var;
    }

    @Override
    public void run(int i10, String str) {
        t1 t1Var = this.f3048b;
        t1Var.K = i10;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z10 = !t1Var.f3720n;
        joingroupcall.muted = z10;
        joingroupcall.video_stopped = z10;
        joingroupcall.call = t1Var.f3719f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i11 = t1Var.f3718e;
        tL_inputPeerUser.user_id = AccountInstance.getInstance(i11).getUserConfig().getClientUserId();
        ConnectionsManager.getInstance(i11).sendRequest(joingroupcall, new i1(t1Var, 0));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        if (tL_error == null) {
            t1 t1Var = this.f3048b;
            if (t1Var.E == null || t1Var.f3723w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new k1(t1Var, 8));
            }
            if (t1Var.G == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                t1Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(t1Var.f3718e).getPeer(t1Var.f3716b);
                t1Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                t1Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = t1Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = t1Var.E;
                NativeInstance.SsrcGroup[] d = t1.d(tL_groupCallParticipantVideo);
                t1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, t1Var.H, DialogObject.getPeerDialogId(t1Var.G.peer));
            }
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        t1 t1Var = this.f3048b;
        if (t1Var.E == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = t1Var.f3719f;
        getgroupparticipants.offset = "";
        int i10 = 0;
        while (i10 < iArr.length) {
            i10 = com.google.android.gms.internal.vision.e2.e(iArr[i10], i10, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(t1Var.f3718e).sendRequest(getgroupparticipants, new l1(t1Var, iArr, j3, 0));
    }

    @Override
    public void run(final long j3, final long j10, final int i10, final int i11) {
        String str;
        switch (this.f3047a) {
            case 3:
                final t1 t1Var = this.f3048b;
                if (t1Var.v == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                sb2.append(j3);
                int i12 = (j10 > 500L ? 1 : (j10 == 500L ? 0 : -1));
                sb2.append(i12 == 0 ? ", scale = 1" : "");
                sb2.append(", video_channel = ");
                sb2.append(i10);
                sb2.append(", video_quality = ");
                sb2.append(i11);
                FileLog.d(sb2.toString());
                final long currentTimeMillis = System.currentTimeMillis();
                TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                tL_upload_getFile.limit = 131072;
                TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                tL_inputGroupCallStream.call = t1Var.f3719f;
                tL_inputGroupCallStream.time_ms = j3;
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
                    str = a4.a.o(j3, "");
                } else {
                    str = i10 + "_" + j3 + "_" + i11;
                }
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new ah.p(t1Var, str2, AccountInstance.getInstance(t1Var.f3718e).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
                        int i13;
                        String str3;
                        t1 t1Var2 = t1.this;
                        if (!t1Var2.f3723w && t1Var2.E != null) {
                            AndroidUtilities.runOnUIThread(new a1.e(18, t1Var2, str2));
                            long j12 = currentTimeMillis;
                            long j13 = j3;
                            long j14 = j10;
                            int i14 = i10;
                            int i15 = i11;
                            String str4 = "";
                            if (tLObject != null) {
                                TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                                StringBuilder sb3 = new StringBuilder("[LivePlayer] received in ");
                                sb3.append(System.currentTimeMillis() - j12);
                                sb3.append("ms getFile{time_ms=");
                                sb3.append(j13);
                                if (j14 == 500) {
                                    str4 = ", scale = 1";
                                }
                                sb3.append(str4);
                                sb3.append(", video_channel = ");
                                sb3.append(i14);
                                sb3.append(", video_quality = ");
                                sb3.append(i15);
                                sb3.append("}: ");
                                sb3.append(tL_upload_file.bytes.limit());
                                sb3.append(" bytes");
                                FileLog.d(sb3.toString());
                                NativeInstance nativeInstance = t1Var2.E;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j13, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j11, i14, i15);
                            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                t1Var2.E.onStreamPartAvailable(j13, null, -1, j11, i14, i15);
                                AndroidUtilities.runOnUIThread(new k1(t1Var2, 4));
                            } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                AndroidUtilities.runOnUIThread(new k1(t1Var2, 6));
                                StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                                sb4.append(System.currentTimeMillis() - j12);
                                sb4.append("ms getFile{time_ms=");
                                sb4.append(j13);
                                if (j14 == 500) {
                                    str4 = ", scale = 1";
                                }
                                sb4.append(str4);
                                sb4.append(", video_channel = ");
                                sb4.append(i14);
                                sb4.append(", video_quality = ");
                                sb4.append(i15);
                                sb4.append("}: ");
                                sb4.append(tL_error.text);
                                sb4.append(" => rejoining");
                                FileLog.d(sb4.toString());
                            } else {
                                if (!"TIME_TOO_BIG".equals(tL_error.text) && !tL_error.text.startsWith("FLOOD_WAIT")) {
                                    i13 = -1;
                                } else {
                                    i13 = 0;
                                }
                                StringBuilder sb5 = new StringBuilder("[LivePlayer] received in ");
                                sb5.append(System.currentTimeMillis() - j12);
                                sb5.append("ms getFile{time_ms=");
                                sb5.append(j13);
                                if (j14 != 500) {
                                    str3 = "";
                                } else {
                                    str3 = ", scale = 1";
                                }
                                sb5.append(str3);
                                sb5.append(", video_channel = ");
                                sb5.append(i14);
                                sb5.append(", video_quality = ");
                                sb5.append(i15);
                                sb5.append("}: ");
                                sb5.append(tL_error.text);
                                sb5.append(" => ");
                                sb5.append(i13);
                                FileLog.d(sb5.toString());
                                t1Var2.E.onStreamPartAvailable(j13, null, i13, j11, i14, i15);
                            }
                        }
                    }
                }, 2, 2, t1Var.h()), 1));
                return;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j3);
                sb3.append(j10 == 500 ? ", scale = 1" : "");
                sb3.append(i10 != 0 ? a4.a.l(i10, i11, ", video_channel = ", ", video_quality = ") : "");
                FileLog.d(sb3.toString());
                AndroidUtilities.runOnUIThread(new q1(i10, i11, 0, j3, this.f3048b));
                return;
        }
    }

    @Override
    public void run(long j3) {
        t1 t1Var = this.f3048b;
        int i10 = t1Var.f3718e;
        TLRPC.GroupCall groupCall = t1Var.v;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = t1Var.f3719f;
            if (t1Var.v == null || t1Var.E == null) {
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamchannels, new p1(t1Var, j3, 0), 65536, 2, t1Var.h());
            return;
        }
        NativeInstance nativeInstance = t1Var.E;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j3, ConnectionsManager.getInstance(i10).getCurrentTimeMillis());
        }
    }
}
