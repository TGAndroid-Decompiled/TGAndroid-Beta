package jh;

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

public final class v0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {

    public final int f14036a;

    public final d1 f14037b;

    public v0(d1 d1Var, int i10) {
        this.f14036a = i10;
        this.f14037b = d1Var;
    }

    @Override
    public void run(int i10, String str) {
        d1 d1Var = this.f14037b;
        d1Var.G = i10;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z10 = !d1Var.f13179n;
        joingroupcall.muted = z10;
        joingroupcall.video_stopped = z10;
        joingroupcall.call = d1Var.f13178f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i11 = d1Var.f13177e;
        tL_inputPeerUser.user_id = AccountInstance.getInstance(i11).getUserConfig().getClientUserId();
        ConnectionsManager.getInstance(i11).sendRequest(joingroupcall, new w0(d1Var, 0));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        if (tL_error == null) {
            d1 d1Var = this.f14037b;
            if (d1Var.A == null || d1Var.f13182w) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i10 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new y0(d1Var, 8));
            }
            if (d1Var.C == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                d1Var.C = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(d1Var.f13177e).getPeer(d1Var.f13175b);
                d1Var.C.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i10 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i10);
                    i10++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                d1Var.C.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = d1Var.C;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = d1Var.A;
                NativeInstance.SsrcGroup[] ssrcGroupArrD = d1.d(tL_groupCallParticipantVideo);
                d1Var.r(ssrcGroupArrD);
                nativeInstance.addIncomingVideoOutput(2, "unified", ssrcGroupArrD, d1Var.D, DialogObject.getPeerDialogId(d1Var.C.peer));
            }
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        d1 d1Var = this.f14037b;
        if (d1Var.A == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = d1Var.f13178f;
        getgroupparticipants.offset = "";
        int iF = 0;
        while (iF < iArr.length) {
            iF = i0.a.f(iArr[iF], iF, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(d1Var.f13177e).sendRequest(getgroupparticipants, new cg.c0(d1Var, iArr, j10));
    }

    @Override
    public void run(final long j10, final long j11, final int i10, final int i11) {
        String strL;
        switch (this.f14036a) {
            case 3:
                final d1 d1Var = this.f14037b;
                if (d1Var.v != null) {
                    StringBuilder sb2 = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                    sb2.append(j10);
                    sb2.append(j11 == 500 ? ", scale = 1" : "");
                    sb2.append(", video_channel = ");
                    sb2.append(i10);
                    sb2.append(", video_quality = ");
                    sb2.append(i11);
                    FileLog.d(sb2.toString());
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                    tL_upload_getFile.limit = 131072;
                    TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                    tL_inputGroupCallStream.call = d1Var.f13178f;
                    tL_inputGroupCallStream.time_ms = j10;
                    if (j11 == 500) {
                        tL_inputGroupCallStream.scale = 1;
                    }
                    if (i10 != 0) {
                        tL_inputGroupCallStream.flags |= 1;
                        tL_inputGroupCallStream.video_channel = i10;
                        tL_inputGroupCallStream.video_quality = i11;
                    }
                    tL_upload_getFile.location = tL_inputGroupCallStream;
                    if (i10 == 0) {
                        strL = a9.p.l(j10, "");
                    } else {
                        strL = i10 + "_" + j10 + "_" + i11;
                    }
                    final String str = strL;
                    AndroidUtilities.runOnUIThread(new d5.i(d1Var, str, AccountInstance.getInstance(d1Var.f13177e).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                            d1 d1Var2 = d1Var;
                            if (d1Var2.f13182w || d1Var2.A == null) {
                                return;
                            }
                            AndroidUtilities.runOnUIThread(new hh.m5(20, d1Var2, str));
                            long j13 = jCurrentTimeMillis;
                            long j14 = j10;
                            long j15 = j11;
                            int i12 = i10;
                            int i13 = i11;
                            if (tLObject != null) {
                                TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                                StringBuilder sb3 = new StringBuilder("[LivePlayer] received in ");
                                sb3.append(System.currentTimeMillis() - j13);
                                sb3.append("ms getFile{time_ms=");
                                sb3.append(j14);
                                sb3.append(j15 == 500 ? ", scale = 1" : "");
                                sb3.append(", video_channel = ");
                                sb3.append(i12);
                                sb3.append(", video_quality = ");
                                sb3.append(i13);
                                sb3.append("}: ");
                                sb3.append(tL_upload_file.bytes.limit());
                                sb3.append(" bytes");
                                FileLog.d(sb3.toString());
                                NativeInstance nativeInstance = d1Var2.A;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j14, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j12, i12, i13);
                                return;
                            }
                            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                d1Var2.A.onStreamPartAvailable(j14, null, -1, j12, i12, i13);
                                AndroidUtilities.runOnUIThread(new y0(d1Var2, 4));
                                return;
                            }
                            if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                AndroidUtilities.runOnUIThread(new y0(d1Var2, 6));
                                StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                                sb4.append(System.currentTimeMillis() - j13);
                                sb4.append("ms getFile{time_ms=");
                                sb4.append(j14);
                                sb4.append(j15 == 500 ? ", scale = 1" : "");
                                sb4.append(", video_channel = ");
                                sb4.append(i12);
                                sb4.append(", video_quality = ");
                                sb4.append(i13);
                                sb4.append("}: ");
                                sb4.append(tL_error.text);
                                sb4.append(" => rejoining");
                                FileLog.d(sb4.toString());
                                return;
                            }
                            int i14 = ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1;
                            StringBuilder sb5 = new StringBuilder("[LivePlayer] received in ");
                            sb5.append(System.currentTimeMillis() - j13);
                            sb5.append("ms getFile{time_ms=");
                            sb5.append(j14);
                            sb5.append(j15 == 500 ? ", scale = 1" : "");
                            sb5.append(", video_channel = ");
                            sb5.append(i12);
                            sb5.append(", video_quality = ");
                            sb5.append(i13);
                            sb5.append("}: ");
                            sb5.append(tL_error.text);
                            sb5.append(" => ");
                            sb5.append(i14);
                            FileLog.d(sb5.toString());
                            d1Var2.A.onStreamPartAvailable(j14, null, i14, j12, i12, i13);
                        }
                    }, 2, 2, d1Var.h()), 8));
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j10);
                sb3.append(j11 == 500 ? ", scale = 1" : "");
                sb3.append(i10 != 0 ? a9.p.j(i10, i11, ", video_channel = ", ", video_quality = ") : "");
                FileLog.d(sb3.toString());
                AndroidUtilities.runOnUIThread(new a1(i10, i11, 0, j10, this.f14037b));
                break;
        }
    }

    @Override
    public void run(long j10) {
        d1 d1Var = this.f14037b;
        int i10 = d1Var.f13177e;
        TLRPC.GroupCall groupCall = d1Var.v;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = d1Var.f13178f;
            if (d1Var.v == null || d1Var.A == null) {
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(getgroupcallstreamchannels, new d3.e(d1Var, j10, 1), 65536, 2, d1Var.h());
            return;
        }
        NativeInstance nativeInstance = d1Var.A;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, ConnectionsManager.getInstance(i10).getCurrentTimeMillis());
        }
    }
}
