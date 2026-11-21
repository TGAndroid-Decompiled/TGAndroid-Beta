package fi;

import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class u0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int f12645a;
    public final c1 f12646b;

    public u0(c1 c1Var, int i7) {
        this.f12645a = i7;
        this.f12646b = c1Var;
    }

    @Override
    public void run(int i7, String str) {
        c1 c1Var = this.f12646b;
        c1Var.L = i7;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z10 = !c1Var.f11838n;
        joingroupcall.muted = z10;
        joingroupcall.video_stopped = z10;
        joingroupcall.call = c1Var.f11837f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i10 = c1Var.f11836e;
        tL_inputPeerUser.user_id = j10.i(org.telegram.messenger.c.a(i10).f23246a).e();
        ConnectionsManager.getInstance(i10).sendRequest(joingroupcall, new di.w1(c1Var, i7, 2));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        if (tL_error == null) {
            c1 c1Var = this.f12646b;
            if (c1Var.F == null || c1Var.f11842x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i7 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.g3(new w0(c1Var, 8));
            }
            if (c1Var.H == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                c1Var.H = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = mp.u1(c1Var.f11836e).B1(c1Var.f11834b);
                c1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i7 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                    i7++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                c1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = c1Var.H;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = c1Var.F;
                NativeInstance.SsrcGroup[] d = c1.d(tL_groupCallParticipantVideo);
                c1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, c1Var.I, org.telegram.messenger.n5.o(c1Var.H.peer));
            }
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        c1 c1Var = this.f12646b;
        if (c1Var.F == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = c1Var.f11837f;
        getgroupparticipants.offset = "";
        int i7 = 0;
        while (i7 < iArr.length) {
            i7 = com.google.android.gms.internal.vision.e2.f(iArr[i7], i7, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(c1Var.f11836e).sendRequest(getgroupparticipants, new di.q2(c1Var, iArr, j3, 3));
    }

    @Override
    public void run(final long j3, final long j10, final int i7, final int i10) {
        String str;
        switch (this.f12645a) {
            case 3:
                final c1 c1Var = this.f12646b;
                if (c1Var.f11841w == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                sb2.append(j3);
                int i11 = (j10 > 500L ? 1 : (j10 == 500L ? 0 : -1));
                sb2.append(i11 == 0 ? ", scale = 1" : "");
                sb2.append(", video_channel = ");
                sb2.append(i7);
                sb2.append(", video_quality = ");
                sb2.append(i10);
                org.telegram.messenger.a8.b(sb2.toString());
                final long currentTimeMillis = System.currentTimeMillis();
                TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                tL_upload_getFile.limit = 131072;
                TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                tL_inputGroupCallStream.call = c1Var.f11837f;
                tL_inputGroupCallStream.time_ms = j3;
                if (i11 == 0) {
                    tL_inputGroupCallStream.scale = 1;
                }
                if (i7 != 0) {
                    tL_inputGroupCallStream.flags |= 1;
                    tL_inputGroupCallStream.video_channel = i7;
                    tL_inputGroupCallStream.video_quality = i10;
                }
                tL_upload_getFile.location = tL_inputGroupCallStream;
                if (i7 == 0) {
                    str = a8.p0.o(j3, "");
                } else {
                    str = i7 + "_" + j3 + "_" + i10;
                }
                final String str2 = str;
                org.telegram.messenger.g0.g3(new ai.c1(c1Var, str2, ConnectionsManager.getInstance(org.telegram.messenger.c.a(c1Var.f11836e).f23246a).sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
                        int i12;
                        String str3;
                        c1 c1Var2 = c1.this;
                        if (!c1Var2.f11842x && c1Var2.F != null) {
                            org.telegram.messenger.g0.g3(new di.f2(26, c1Var2, str2));
                            long j12 = currentTimeMillis;
                            long j13 = j3;
                            long j14 = j10;
                            int i13 = i7;
                            int i14 = i10;
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
                                sb3.append(i13);
                                sb3.append(", video_quality = ");
                                sb3.append(i14);
                                sb3.append("}: ");
                                sb3.append(tL_upload_file.bytes.limit());
                                sb3.append(" bytes");
                                org.telegram.messenger.a8.b(sb3.toString());
                                NativeInstance nativeInstance = c1Var2.F;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j13, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j11, i13, i14);
                            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                c1Var2.F.onStreamPartAvailable(j13, null, -1, j11, i13, i14);
                                org.telegram.messenger.g0.g3(new w0(c1Var2, 4));
                            } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                org.telegram.messenger.g0.g3(new w0(c1Var2, 6));
                                StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                                sb4.append(System.currentTimeMillis() - j12);
                                sb4.append("ms getFile{time_ms=");
                                sb4.append(j13);
                                if (j14 == 500) {
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
                                org.telegram.messenger.a8.b(sb4.toString());
                            } else {
                                if (!"TIME_TOO_BIG".equals(tL_error.text) && !tL_error.text.startsWith("FLOOD_WAIT")) {
                                    i12 = -1;
                                } else {
                                    i12 = 0;
                                }
                                int i15 = i12;
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
                                sb5.append(i13);
                                sb5.append(", video_quality = ");
                                sb5.append(i14);
                                sb5.append("}: ");
                                sb5.append(tL_error.text);
                                sb5.append(" => ");
                                sb5.append(i15);
                                org.telegram.messenger.a8.b(sb5.toString());
                                c1Var2.F.onStreamPartAvailable(j13, null, i15, j11, i13, i14);
                            }
                        }
                    }
                }, 2, 2, c1Var.h()), 10));
                return;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j3);
                sb3.append(j10 == 500 ? ", scale = 1" : "");
                sb3.append(i7 != 0 ? a8.p0.m(i7, i10, ", video_channel = ", ", video_quality = ") : "");
                org.telegram.messenger.a8.b(sb3.toString());
                org.telegram.messenger.g0.g3(new z0(i7, i10, 0, j3, this.f12646b));
                return;
        }
    }

    @Override
    public void run(long j3) {
        c1 c1Var = this.f12646b;
        int i7 = c1Var.f11836e;
        TLRPC.GroupCall groupCall = c1Var.f11841w;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = c1Var.f11837f;
            if (c1Var.f11841w == null || c1Var.F == null) {
                return;
            }
            ConnectionsManager.getInstance(i7).sendRequest(getgroupcallstreamchannels, new ai.d0(c1Var, j3, 1), 65536, 2, c1Var.h());
            return;
        }
        NativeInstance nativeInstance = c1Var.F;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j3, ConnectionsManager.getInstance(i7).getCurrentTimeMillis());
        }
    }
}
