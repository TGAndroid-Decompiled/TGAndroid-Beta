package ei;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class x0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int f11197a;
    public final g1 f11198b;

    public x0(g1 g1Var, int i3) {
        this.f11197a = i3;
        this.f11198b = g1Var;
    }

    @Override
    public void run(int i3, String str) {
        g1 g1Var = this.f11198b;
        g1Var.L = i3;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z10 = !g1Var.f10301n;
        joingroupcall.muted = z10;
        joingroupcall.video_stopped = z10;
        joingroupcall.call = g1Var.f10300f;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i10 = g1Var.f10299e;
        tL_inputPeerUser.user_id = h10.i(org.telegram.messenger.c.a(i10).f21919a).e();
        ConnectionsManager.getInstance(i10).sendRequest(joingroupcall, new y0(g1Var, 0));
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        if (tL_error == null) {
            g1 g1Var = this.f11198b;
            if (g1Var.F == null || g1Var.f10305x) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i3 = 0;
            if (!groupcallstreamchannels.channels.isEmpty()) {
                long j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            }
            if (groupcallstreamchannels.channels.isEmpty()) {
                org.telegram.messenger.g0.h3(new a1(g1Var, 8));
            }
            if (g1Var.H == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                g1Var.H = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = hp.s1(g1Var.f10299e).z1(g1Var.f10297b);
                g1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                int size = arrayList.size();
                while (i3 < size) {
                    TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i3);
                    i3++;
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                }
                g1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = g1Var.H;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                NativeInstance nativeInstance = g1Var.F;
                NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo);
                g1Var.r(d);
                nativeInstance.addIncomingVideoOutput(2, "unified", d, g1Var.I, org.telegram.messenger.m5.o(g1Var.H.peer));
            }
        }
    }

    @Override
    public void run(long j10, int[] iArr) {
        g1 g1Var = this.f11198b;
        if (g1Var.F == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = g1Var.f10300f;
        getgroupparticipants.offset = "";
        int i3 = 0;
        while (i3 < iArr.length) {
            i3 = com.google.android.recaptcha.internal.a.f(iArr[i3], i3, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(g1Var.f10299e).sendRequest(getgroupparticipants, new ci.u2(g1Var, iArr, j10, 3));
    }

    @Override
    public void run(final long j10, final long j11, final int i3, final int i10) {
        String str;
        switch (this.f11197a) {
            case 3:
                final g1 g1Var = this.f11198b;
                if (g1Var.f10304w == null) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                sb2.append(j10);
                int i11 = (j11 > 500L ? 1 : (j11 == 500L ? 0 : -1));
                sb2.append(i11 == 0 ? ", scale = 1" : "");
                sb2.append(", video_channel = ");
                sb2.append(i3);
                sb2.append(", video_quality = ");
                sb2.append(i10);
                org.telegram.messenger.a8.b(sb2.toString());
                final long currentTimeMillis = System.currentTimeMillis();
                TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                tL_upload_getFile.limit = 131072;
                TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                tL_inputGroupCallStream.call = g1Var.f10300f;
                tL_inputGroupCallStream.time_ms = j10;
                if (i11 == 0) {
                    tL_inputGroupCallStream.scale = 1;
                }
                if (i3 != 0) {
                    tL_inputGroupCallStream.flags |= 1;
                    tL_inputGroupCallStream.video_channel = i3;
                    tL_inputGroupCallStream.video_quality = i10;
                }
                tL_upload_getFile.location = tL_inputGroupCallStream;
                if (i3 == 0) {
                    str = a1.g.p(j10, "");
                } else {
                    str = i3 + "_" + j10 + "_" + i10;
                }
                final String str2 = str;
                org.telegram.messenger.g0.h3(new ai.e3(g1Var, str2, ConnectionsManager.getInstance(org.telegram.messenger.c.a(g1Var.f10299e).f21919a).sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j12) {
                        int i12;
                        String str3;
                        g1 g1Var2 = g1.this;
                        if (!g1Var2.f10305x && g1Var2.F != null) {
                            org.telegram.messenger.g0.h3(new b0(4, g1Var2, str2));
                            long j13 = currentTimeMillis;
                            long j14 = j10;
                            long j15 = j11;
                            int i13 = i3;
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
                                org.telegram.messenger.a8.b(sb3.toString());
                                NativeInstance nativeInstance = g1Var2.F;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j14, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j12, i13, i14);
                            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                g1Var2.F.onStreamPartAvailable(j14, null, -1, j12, i13, i14);
                                org.telegram.messenger.g0.h3(new a1(g1Var2, 4));
                            } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                org.telegram.messenger.g0.h3(new a1(g1Var2, 6));
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
                                org.telegram.messenger.a8.b(sb4.toString());
                            } else {
                                if (!"TIME_TOO_BIG".equals(tL_error.text) && !tL_error.text.startsWith("FLOOD_WAIT")) {
                                    i12 = -1;
                                } else {
                                    i12 = 0;
                                }
                                int i15 = i12;
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
                                sb5.append(i15);
                                org.telegram.messenger.a8.b(sb5.toString());
                                g1Var2.F.onStreamPartAvailable(j14, null, i15, j12, i13, i14);
                            }
                        }
                    }
                }, 2, 2, g1Var.h()), 7));
                return;
            default:
                StringBuilder sb3 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb3.append(j10);
                sb3.append(j11 == 500 ? ", scale = 1" : "");
                sb3.append(i3 != 0 ? a1.g.n(i3, i10, ", video_channel = ", ", video_quality = ") : "");
                org.telegram.messenger.a8.b(sb3.toString());
                org.telegram.messenger.g0.h3(new d1(i3, i10, 0, j10, this.f11198b));
                return;
        }
    }

    @Override
    public void run(long j10) {
        g1 g1Var = this.f11198b;
        int i3 = g1Var.f10299e;
        TLRPC.GroupCall groupCall = g1Var.f10304w;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = g1Var.f10300f;
            if (g1Var.f10304w == null || g1Var.F == null) {
                return;
            }
            ConnectionsManager.getInstance(i3).sendRequest(getgroupcallstreamchannels, new c1(g1Var, j10, 0), 65536, 2, g1Var.h());
            return;
        }
        NativeInstance nativeInstance = g1Var.F;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j10, ConnectionsManager.getInstance(i3).getCurrentTimeMillis());
        }
    }
}
