package di;

import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class v0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int f9853a;
    public final g1 f9854b;

    public v0(g1 g1Var, int i7) {
        this.f9853a = i7;
        this.f9854b = g1Var;
    }

    @Override
    public void run(int i7, String str) {
        g1 g1Var = this.f9854b;
        g1Var.K = i7;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z9 = !g1Var.f9002n;
        joingroupcall.muted = z9;
        joingroupcall.video_stopped = z9;
        joingroupcall.call = g1Var.f9001f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i10 = g1Var.f9000e;
        tL_inputPeerUser.user_id = p10.i(org.telegram.messenger.c.a(i10).f21765a).e();
        ConnectionsManager.getInstance(i10).sendRequest(joingroupcall, new bi.j2(g1Var, i7, 2));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        if (tL_error == null) {
            g1 g1Var = this.f9854b;
            if (g1Var.E == null || g1Var.f9006x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i7 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.h3(new x0(g1Var, 8));
            }
            if (g1Var.G == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                g1Var.G = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = qp.s1(g1Var.f9000e).z1(g1Var.f8998b);
                g1Var.G.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i7 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                    i7++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                g1Var.G.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = g1Var.G;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = g1Var.E;
                NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo);
                g1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, g1Var.H, org.telegram.messenger.m5.o(g1Var.G.peer));
            }
        }
    }

    @Override
    public void run(long j3, int[] iArr) {
        g1 g1Var = this.f9854b;
        if (g1Var.E == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = g1Var.f9001f;
        getgroupparticipants.offset = "";
        int i7 = 0;
        while (i7 < iArr.length) {
            i7 = com.google.android.recaptcha.internal.a.f(iArr[i7], i7, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(g1Var.f9000e).sendRequest(getgroupparticipants, new bi.h3(g1Var, iArr, j3, 3));
    }

    @Override
    public void run(final long j3, final long j10, final int i7, final int i10) {
        String str;
        switch (this.f9853a) {
            case 3:
                final g1 g1Var = this.f9854b;
                if (g1Var.f9005w == null) {
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
                tL_inputGroupCallStream.call = g1Var.f9001f;
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
                org.telegram.messenger.g0.h3(new ai.e0(g1Var, str2, ConnectionsManager.getInstance(org.telegram.messenger.c.a(g1Var.f9000e).f21765a).sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j11) {
                        int i12;
                        String str3;
                        g1 g1Var2 = g1.this;
                        if (!g1Var2.f9006x && g1Var2.E != null) {
                            org.telegram.messenger.g0.h3(new z0(1, g1Var2, str2));
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
                                NativeInstance nativeInstance = g1Var2.E;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j13, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j11, i13, i14);
                            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                g1Var2.E.onStreamPartAvailable(j13, null, -1, j11, i13, i14);
                                org.telegram.messenger.g0.h3(new x0(g1Var2, 4));
                            } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                org.telegram.messenger.g0.h3(new x0(g1Var2, 6));
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
                                g1Var2.E.onStreamPartAvailable(j13, null, i15, j11, i13, i14);
                            }
                        }
                    }
                }, 2, 2, g1Var.h()), 6));
                return;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j3);
                sb3.append(j10 == 500 ? ", scale = 1" : "");
                sb3.append(i7 != 0 ? a8.p0.m(i7, i10, ", video_channel = ", ", video_quality = ") : "");
                org.telegram.messenger.a8.b(sb3.toString());
                org.telegram.messenger.g0.h3(new d1(i7, i10, 0, j3, this.f9854b));
                return;
        }
    }

    @Override
    public void run(long j3) {
        g1 g1Var = this.f9854b;
        int i7 = g1Var.f9000e;
        TLRPC.GroupCall groupCall = g1Var.f9005w;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = g1Var.f9001f;
            if (g1Var.f9005w == null || g1Var.E == null) {
                return;
            }
            ConnectionsManager.getInstance(i7).sendRequest(getgroupcallstreamchannels, new c1(g1Var, j3, 0), 65536, 2, g1Var.h());
            return;
        }
        NativeInstance nativeInstance = g1Var.E;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j3, ConnectionsManager.getInstance(i7).getCurrentTimeMillis());
        }
    }
}
