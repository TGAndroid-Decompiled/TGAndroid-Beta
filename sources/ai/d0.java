package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import bi.w3;
import bi.y3;
import hi.c8;
import hi.l8;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.jc;
import org.telegram.messenger.lr;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.pd;
import org.telegram.messenger.rr;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.j91;
import org.telegram.ui.ma0;
import org.telegram.ui.mw;
import org.telegram.ui.u40;
public final class d0 implements f, RequestDelegateTimestamp, rr, jc, z4, ma0, lr, j2.g, org.telegram.ui.ActionBar.r1, u40, p4.c1, v5.e {
    public final int f1172a;
    public final long f1173b;
    public final Object f1174c;

    public d0(long j3, o5.i iVar) {
        this.f1172a = 14;
        this.f1173b = j3;
        this.f1174c = iVar;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        boolean v12;
        si siVar = (si) this.f1174c;
        ki kiVar = siVar.f39732w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar.f39670e2;
        long j3 = this.f1173b;
        if (kiVar != chatAttachAlertPhotoLayout && kiVar != siVar.f39690l2) {
            if (!kiVar.M(z10, i7, i10, j3, siVar.g1())) {
                siVar.B4 = true;
                siVar.dismiss();
            }
            v12 = false;
        } else {
            v12 = siVar.v1(z10, i7, i10, j3, siVar.g1());
        }
        df dfVar = siVar.f39665c2;
        if (dfVar != null) {
            dfVar.h(!v12);
            siVar.f39665c2 = null;
        }
    }

    @Override
    public void a(String str) {
        l8 l8Var = (l8) this.f1174c;
        mp.u1(l8Var.f14955a0.f30189a).R1().r(this.f1173b, str, new c8(l8Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.f1174c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1173b));
        String str = iVar.f21714a;
        l5.d dVar = iVar.f21716c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21714a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.f1172a;
        Object obj = this.f1174c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                zy.C(((pd) obj).h.K1).r0(xy.d(messageMedia, this.f1173b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                zy.C(((int[]) obj)[0]).r0(xy.d(messageMedia, this.f1173b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void c(TLRPC.TL_error tL_error, String str) {
        x10 x10Var = (x10) this.f1174c;
        if (str == null) {
            n0.E(tL_error);
        }
        org.telegram.messenger.g0.h3(new h0(x10Var, str), Math.max(0L, (this.f1173b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public j2.h createDataSource() {
        return new b61(((f61) this.f1174c).h.createDataSource(), this.f1173b);
    }

    @Override
    public void d(boolean z10) {
        bn bnVar = ((z11) this.f1174c).f42747s;
        if (com.google.android.gms.internal.vision.e2.s(bnVar)) {
            bnVar.Ta(this.f1173b, false);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f1172a) {
            case 8:
                km0 km0Var = ((cx) this.f1174c).D0.f39185e0;
                a0.h hVar = km0Var.f17501y0;
                long j3 = this.f1173b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    km0Var.f17501y0.l(j3);
                    km0Var.f17494u0.remove(g0Var);
                    km0Var.f17497w0.remove(g0Var);
                    km0Var.f17495v0.remove(g0Var);
                    km0Var.f();
                    tr.a0(km0Var.f17493t0).f27054a.c(new y3(km0Var, j3, 11));
                    return;
                }
                return;
            default:
                ((mw) this.f1174c).f49979a.getMediaDataController().S1(this.f1173b);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        j91 j91Var = (j91) this.f1174c;
        org.telegram.ui.ActionBar.h2 h2Var = j91Var.f48928b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            mp messagesController = h2Var.getMessagesController();
            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
            long j3 = this.f1173b;
            messagesController.m(j3, (TLRPC.User) arrayList.get(i10), i7, null, h2Var, false, j2Var, null, new w3(j91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.f1174c), 0, this.f1173b);
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi.e0 e0Var = (oi.e0) this.f1174c;
        hc p10 = imageReceiver.p();
        if (z10 && p10 != null) {
            Bitmap bitmap = p10.f24426c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            e0Var.onComplete(new Pair(Long.valueOf(this.f1173b), bitmap));
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.c1 c1Var = (fi.c1) this.f1174c;
        long j10 = 0;
        if (tL_error == null) {
            if (c1Var.F != null && !c1Var.f11802x) {
                TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
                int i7 = 0;
                if (!groupcallstreamchannels.channels.isEmpty()) {
                    j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
                }
                if (groupcallstreamchannels.channels.isEmpty()) {
                    org.telegram.messenger.g0.g3(new fi.w0(c1Var, 5));
                }
                if (c1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
                    TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                    c1Var.H = tL_groupCallParticipant;
                    tL_groupCallParticipant.peer = mp.u1(c1Var.f11796e).B1(c1Var.f11794b);
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
                    NativeInstance.SsrcGroup[] d = fi.c1.d(tL_groupCallParticipantVideo);
                    c1Var.r(d);
                    nativeInstance.addIncomingVideoOutput(2, "unified", d, c1Var.I, n5.o(c1Var.H.peer));
                }
            } else {
                return;
            }
        }
        NativeInstance nativeInstance2 = c1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f1173b, j10);
        }
    }

    public d0(n0 n0Var, long j3, x10 x10Var) {
        this.f1172a = 0;
        this.f1173b = j3;
        this.f1174c = x10Var;
    }

    public d0(Object obj, long j3, int i7) {
        this.f1172a = i7;
        this.f1174c = obj;
        this.f1173b = j3;
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
