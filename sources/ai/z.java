package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import bi.c4;
import bi.e4;
import hi.f9;
import hi.w8;
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
import org.telegram.messenger.w10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z11;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.h91;
import org.telegram.ui.lw;
import org.telegram.ui.ma0;
import org.telegram.ui.t40;
public final class z implements b, RequestDelegateTimestamp, rr, jc, z4, ma0, lr, j2.g, org.telegram.ui.ActionBar.q1, t40, p4.b1, v5.e {
    public final int f1605a;
    public final long f1606b;
    public final Object f1607c;

    public z(long j3, o5.i iVar) {
        this.f1605a = 14;
        this.f1606b = j3;
        this.f1607c = iVar;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        boolean v12;
        ti tiVar = (ti) this.f1607c;
        li liVar = tiVar.f40029w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f39967e2;
        long j3 = this.f1606b;
        if (liVar != chatAttachAlertPhotoLayout && liVar != tiVar.f39987l2) {
            if (!liVar.M(z10, i7, i10, j3, tiVar.g1())) {
                tiVar.B4 = true;
                tiVar.dismiss();
            }
            v12 = false;
        } else {
            v12 = tiVar.v1(z10, i7, i10, j3, tiVar.g1());
        }
        ef efVar = tiVar.f39962c2;
        if (efVar != null) {
            efVar.h(!v12);
            tiVar.f39962c2 = null;
        }
    }

    @Override
    public void a(String str) {
        f9 f9Var = (f9) this.f1607c;
        mp.u1(f9Var.f14495a0.f30223a).R1().r(this.f1606b, str, new w8(f9Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.f1607c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1606b));
        String str = iVar.f21804a;
        l5.d dVar = iVar.f21806c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21804a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(TLRPC.TL_error tL_error, String str) {
        w10 w10Var = (w10) this.f1607c;
        if (str == null) {
            l0.E(tL_error);
        }
        org.telegram.messenger.g0.h3(new e0(w10Var, str), Math.max(0L, (this.f1606b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public j2.h createDataSource() {
        return new d61(((h61) this.f1607c).h.createDataSource(), this.f1606b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.f1605a;
        Object obj = this.f1607c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                zy.C(((pd) obj).h.K1).r0(xy.d(messageMedia, this.f1606b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                zy.C(((int[]) obj)[0]).r0(xy.d(messageMedia, this.f1606b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void g(int i7, ArrayList arrayList) {
        h91 h91Var = (h91) this.f1607c;
        org.telegram.ui.ActionBar.g2 g2Var = h91Var.f48513b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            mp messagesController = g2Var.getMessagesController();
            org.telegram.messenger.j2 j2Var = new org.telegram.messenger.j2(0);
            long j3 = this.f1606b;
            messagesController.m(j3, (TLRPC.User) arrayList.get(i10), i7, null, g2Var, false, j2Var, null, new c4(h91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f1605a) {
            case 8:
                mm0 mm0Var = ((bx) this.f1607c).D0.f40085e0;
                a0.h hVar = mm0Var.f17594y0;
                long j3 = this.f1606b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    mm0Var.f17594y0.l(j3);
                    mm0Var.f17587u0.remove(g0Var);
                    mm0Var.f17590w0.remove(g0Var);
                    mm0Var.f17588v0.remove(g0Var);
                    mm0Var.f();
                    tr.a0(mm0Var.f17586t0).f27149a.c(new e4(mm0Var, j3, 11));
                    return;
                }
                return;
            default:
                ((lw) this.f1607c).f49849a.getMediaDataController().S1(this.f1606b);
                return;
        }
    }

    @Override
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.f1607c), 0, this.f1606b);
    }

    @Override
    public void q(boolean z10) {
        bn bnVar = ((z11) this.f1607c).f42642s;
        if (com.google.android.gms.internal.vision.e2.s(bnVar)) {
            bnVar.Ta(this.f1606b, false);
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.c1 c1Var = (fi.c1) this.f1607c;
        long j10 = 0;
        if (tL_error == null) {
            if (c1Var.F != null && !c1Var.f11807x) {
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
                    tL_groupCallParticipant.peer = mp.u1(c1Var.f11801e).B1(c1Var.f11799b);
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
            nativeInstance2.onRequestTimeComplete(this.f1606b, j10);
        }
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oi.f0 f0Var = (oi.f0) this.f1607c;
        hc p10 = imageReceiver.p();
        if (z10 && p10 != null) {
            Bitmap bitmap = p10.f24522c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            f0Var.onComplete(new Pair(Long.valueOf(this.f1606b), bitmap));
        }
    }

    public z(l0 l0Var, long j3, w10 w10Var) {
        this.f1605a = 0;
        this.f1606b = j3;
        this.f1607c = w10Var;
    }

    public z(Object obj, long j3, int i7) {
        this.f1605a = i7;
        this.f1607c = obj;
        this.f1606b = j3;
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }
}
