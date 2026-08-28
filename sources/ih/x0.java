package ih;

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
public final class x0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int f12312a;
    public final f1 f12313b;

    public x0(f1 f1Var, int i9) {
        this.f12312a = i9;
        this.f12313b = f1Var;
    }

    @Override
    public void run(int i9, String str) {
        f1 f1Var = this.f12313b;
        f1Var.G = i9;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z10 = !f1Var.f11403n;
        joingroupcall.muted = z10;
        joingroupcall.video_stopped = z10;
        joingroupcall.call = f1Var.f11402f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i10 = f1Var.f11401e;
        tL_inputPeerUser.user_id = AccountInstance.getInstance(i10).getUserConfig().getClientUserId();
        ConnectionsManager.getInstance(i10).sendRequest(joingroupcall, new y0(f1Var, 0));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        if (tL_error == null) {
            f1 f1Var = this.f12313b;
            if (f1Var.A == null || f1Var.f11406w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i9 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new a1(f1Var, 8));
            }
            if (f1Var.C == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                f1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(f1Var.f11401e).getPeer(f1Var.f11399b);
                f1Var.C.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i9 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i9);
                    i9++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                f1Var.C.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = f1Var.C;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = f1Var.A;
                NativeInstance.SsrcGroup[] d = f1.d(tL_groupCallParticipantVideo);
                f1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, f1Var.D, DialogObject.getPeerDialogId(f1Var.C.peer));
            }
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        f1 f1Var = this.f12313b;
        if (f1Var.A == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = f1Var.f11402f;
        getgroupparticipants.offset = "";
        int i9 = 0;
        while (i9 < iArr.length) {
            i9 = j3.r0.e(iArr[i9], i9, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(f1Var.f11401e).sendRequest(getgroupparticipants, new bg.f0(f1Var, iArr, j10));
    }

    @Override
    public void run(final long j10, final long j11, final int i9, final int i10) {
        String str;
        switch (this.f12312a) {
            case 3:
                final f1 f1Var = this.f12313b;
                if (f1Var.v == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                sb2.append(j10);
                int i11 = (j11 > 500L ? 1 : (j11 == 500L ? 0 : -1));
                sb2.append(i11 == 0 ? ", scale = 1" : "");
                sb2.append(", video_channel = ");
                sb2.append(i9);
                sb2.append(", video_quality = ");
                sb2.append(i10);
                FileLog.d(sb2.toString());
                final long currentTimeMillis = System.currentTimeMillis();
                TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                tL_upload_getFile.limit = 131072;
                TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                tL_inputGroupCallStream.call = f1Var.f11402f;
                tL_inputGroupCallStream.time_ms = j10;
                if (i11 == 0) {
                    tL_inputGroupCallStream.scale = 1;
                }
                if (i9 != 0) {
                    tL_inputGroupCallStream.flags |= 1;
                    tL_inputGroupCallStream.video_channel = i9;
                    tL_inputGroupCallStream.video_quality = i10;
                }
                tL_upload_getFile.location = tL_inputGroupCallStream;
                if (i9 == 0) {
                    str = aa.d.m(j10, "");
                } else {
                    str = i9 + "_" + j10 + "_" + i10;
                }
                final String str2 = str;
                AndroidUtilities.runOnUIThread(new d5.i(f1Var, str2, AccountInstance.getInstance(f1Var.f11401e).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                        int i12;
                        String str3;
                        f1 f1Var2 = f1.this;
                        if (!f1Var2.f11406w && f1Var2.A != null) {
                            AndroidUtilities.runOnUIThread(new h3.g0(11, f1Var2, str2));
                            long j13 = currentTimeMillis;
                            long j14 = j10;
                            long j15 = j11;
                            int i13 = i9;
                            int i14 = i10;
                            String str4 = "";
                            if (tLObject != null) {
                                TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                                StringBuilder sb3 = new StringBuilder("[LivePlayer] received in ");
                                sb3.append(System.currentTimeMillis() - j13);
                                sb3.append("ms getFile{time_ms=");
                                sb3.append(j14);
                                if (j15 == 500) {
                                    str4 = ", scale = 1";
                                }
                                sb3.append(str4);
                                sb3.append(", video_channel = ");
                                sb3.append(i13);
                                sb3.append(", video_quality = ");
                                sb3.append(i14);
                                sb3.append("}: ");
                                sb3.append(tL_upload_file.bytes.limit());
                                sb3.append(" bytes");
                                FileLog.d(sb3.toString());
                                NativeInstance nativeInstance = f1Var2.A;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j14, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j12, i13, i14);
                            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                f1Var2.A.onStreamPartAvailable(j14, null, -1, j12, i13, i14);
                                AndroidUtilities.runOnUIThread(new a1(f1Var2, 4));
                            } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                AndroidUtilities.runOnUIThread(new a1(f1Var2, 6));
                                StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                                sb4.append(System.currentTimeMillis() - j13);
                                sb4.append("ms getFile{time_ms=");
                                sb4.append(j14);
                                if (j15 == 500) {
                                    str4 = ", scale = 1";
                                }
                                sb4.append(str4);
                                sb4.append(", video_channel = ");
                                sb4.append(i13);
                                sb4.append(", video_quality = ");
                                sb4.append(i14);
                                sb4.append("}: ");
                                sb4.append(tL_error.text);
                                sb4.append(" => rejoining");
                                FileLog.d(sb4.toString());
                            } else {
                                if (!"TIME_TOO_BIG".equals(tL_error.text) && !tL_error.text.startsWith("FLOOD_WAIT")) {
                                    i12 = -1;
                                } else {
                                    i12 = 0;
                                }
                                StringBuilder sb5 = new StringBuilder("[LivePlayer] received in ");
                                sb5.append(System.currentTimeMillis() - j13);
                                sb5.append("ms getFile{time_ms=");
                                sb5.append(j14);
                                if (j15 != 500) {
                                    str3 = "";
                                } else {
                                    str3 = ", scale = 1";
                                }
                                sb5.append(str3);
                                sb5.append(", video_channel = ");
                                sb5.append(i13);
                                sb5.append(", video_quality = ");
                                sb5.append(i14);
                                sb5.append("}: ");
                                sb5.append(tL_error.text);
                                sb5.append(" => ");
                                sb5.append(i12);
                                FileLog.d(sb5.toString());
                                f1Var2.A.onStreamPartAvailable(j14, null, i12, j12, i13, i14);
                            }
                        }
                    }
                }, 2, 2, f1Var.h()), 8));
                return;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j10);
                sb3.append(j11 == 500 ? ", scale = 1" : "");
                sb3.append(i9 != 0 ? aa.d.k(i9, i10, ", video_channel = ", ", video_quality = ") : "");
                FileLog.d(sb3.toString());
                AndroidUtilities.runOnUIThread(new c1(i9, i10, 0, j10, this.f12313b));
                return;
        }
    }

    @Override
    public void run(long j10) {
        f1 f1Var = this.f12313b;
        int i9 = f1Var.f11401e;
        TLRPC.GroupCall groupCall = f1Var.v;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = f1Var.f11402f;
            if (f1Var.v == null || f1Var.A == null) {
                return;
            }
            ConnectionsManager.getInstance(i9).sendRequest(getgroupcallstreamchannels, new d3.e(f1Var, j10, 1), 65536, 2, f1Var.h());
            return;
        }
        NativeInstance nativeInstance = f1Var.A;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, ConnectionsManager.getInstance(i9).getCurrentTimeMillis());
        }
    }
}
