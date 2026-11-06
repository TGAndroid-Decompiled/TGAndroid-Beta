package di;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.jc;
import org.telegram.messenger.lc;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.rd;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wr;
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.m11;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.h91;
import org.telegram.ui.hw;
import org.telegram.ui.ma0;
import org.telegram.ui.r40;
import org.telegram.ui.ww;
public final class c1 implements RequestDelegateTimestamp, wr, lc, org.telegram.ui.Components.t4, ma0, qr, j2.g, org.telegram.ui.ActionBar.r1, r40, p4.a1, v5.e {
    public final int f8862a;
    public final long f8863b;
    public final Object f8864c;

    public c1(long j3, o5.i iVar) {
        this.f8862a = 13;
        this.f8863b = j3;
        this.f8864c = iVar;
    }

    @Override
    public void L(int i7, int i10, boolean z9) {
        boolean u12;
        di diVar = (di) this.f8864c;
        vh vhVar = diVar.f32984s2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32924a2;
        long j3 = this.f8863b;
        if (vhVar != chatAttachAlertPhotoLayout && vhVar != diVar.f32944h2) {
            if (!vhVar.L(z9, i7, i10, j3, diVar.f1())) {
                diVar.f33006x4 = true;
                diVar.dismiss();
            }
            u12 = false;
        } else {
            u12 = diVar.u1(z9, i7, i10, j3, diVar.f1());
        }
        ue ueVar = diVar.Y1;
        if (ueVar != null) {
            ueVar.g(!u12);
            diVar.Y1 = null;
        }
    }

    @Override
    public void a(String str) {
        fi.n8 n8Var = (fi.n8) this.f8864c;
        qp.s1(n8Var.W.f28613a).P1().r(this.f8863b, str, new fi.e8(n8Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.f8864c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f8863b));
        String str = iVar.f20823a;
        l5.d dVar = iVar.f20825c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f20823a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public j2.h createDataSource() {
        return new o51(((t51) this.f8864c).h.createDataSource(), this.f8863b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        int i11 = this.f8862a;
        Object obj = this.f8864c;
        switch (i11) {
            case 4:
                float[] fArr = FragmentContextView.W0;
                gz.C(((rd) obj).h.I1).r0(ez.d(messageMedia, this.f8863b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.B1;
                gz.C(((int[]) obj)[0]).r0(ez.d(messageMedia, this.f8863b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void f(int i7, ArrayList arrayList) {
        h91 h91Var = (h91) this.f8864c;
        org.telegram.ui.ActionBar.f2 f2Var = h91Var.f46307b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            qp messagesController = f2Var.getMessagesController();
            ai.m0 m0Var = new ai.m0(22);
            long j3 = this.f8863b;
            messagesController.m(j3, (TLRPC.User) arrayList.get(i10), i7, null, f2Var, false, m0Var, null, new hi.f3(h91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ni.c cVar = (ni.c) this.f8864c;
        jc p10 = imageReceiver.p();
        if (z9 && p10 != null) {
            Bitmap bitmap = p10.f23516c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            cVar.onComplete(new Pair(Long.valueOf(this.f8863b), bitmap));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f8862a) {
            case 7:
                yl0 yl0Var = ((ww) this.f8864c).C0.f33591d0;
                a0.h hVar = yl0Var.f16764x0;
                long j3 = this.f8863b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    yl0Var.f16764x0.l(j3);
                    yl0Var.f16758t0.remove(g0Var);
                    yl0Var.f16760v0.remove(g0Var);
                    yl0Var.f16759u0.remove(g0Var);
                    yl0Var.f();
                    yr.a0(yl0Var.f16757s0).f26696a.c(new bi.r3(yl0Var, j3, 12));
                    return;
                }
                return;
            default:
                ((hw) this.f8864c).f46503a.getMediaDataController().N1(this.f8863b);
                return;
        }
    }

    @Override
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.f8864c), 0, this.f8863b);
    }

    @Override
    public void k(boolean z9) {
        an anVar = ((m11) this.f8864c).f35833s;
        if (com.google.android.recaptcha.internal.a.u(anVar)) {
            anVar.Qa(this.f8863b, false);
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        g1 g1Var = (g1) this.f8864c;
        long j10 = 0;
        if (tL_error == null) {
            if (g1Var.E != null && !g1Var.f9031x) {
                TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
                int i7 = 0;
                if (!groupcallstreamchannels.channels.isEmpty()) {
                    j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
                }
                if (groupcallstreamchannels.channels.isEmpty()) {
                    org.telegram.messenger.g0.h3(new x0(g1Var, 5));
                }
                if (g1Var.G == null && !groupcallstreamchannels.channels.isEmpty()) {
                    TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                    g1Var.G = tL_groupCallParticipant;
                    tL_groupCallParticipant.peer = qp.s1(g1Var.f9025e).z1(g1Var.f9023b);
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
            } else {
                return;
            }
        }
        NativeInstance nativeInstance2 = g1Var.E;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f8863b, j10);
        }
    }

    public c1(Object obj, long j3, int i7) {
        this.f8862a = i7;
        this.f8864c = obj;
        this.f8863b = j3;
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
