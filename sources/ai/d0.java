package ai;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import hi.c8;
import hi.l8;
import java.util.ArrayList;
import ki.c3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.ic;
import org.telegram.messenger.kc;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.qd;
import org.telegram.messenger.tr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ue;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.f91;
import org.telegram.ui.jw;
import org.telegram.ui.ma0;
import org.telegram.ui.r40;
import org.telegram.ui.yw;
public final class d0 implements g, RequestDelegateTimestamp, tr, kc, r4, ma0, nr, j2.g, org.telegram.ui.ActionBar.q1, r40, p4.a1, v5.e {
    public final int f1174a;
    public final long f1175b;
    public final Object f1176c;

    public d0(long j3, Object obj, int i7) {
        this.f1174a = i7;
        this.f1175b = j3;
        this.f1176c = obj;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        m2.d dVar = (m2.d) this.f1176c;
        ic p10 = imageReceiver.p();
        if (z10 && p10 != null) {
            Bitmap bitmap = p10.f24374c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            dVar.onComplete(new Pair(Long.valueOf(this.f1175b), bitmap));
        }
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        boolean u12;
        ki kiVar = (ki) this.f1176c;
        ci ciVar = kiVar.f36497w2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36435e2;
        long j3 = this.f1175b;
        if (ciVar != chatAttachAlertPhotoLayout && ciVar != kiVar.f36455l2) {
            if (!ciVar.M(z10, i7, i10, j3, kiVar.f1())) {
                kiVar.B4 = true;
                kiVar.dismiss();
            }
            u12 = false;
        } else {
            u12 = kiVar.u1(z10, i7, i10, j3, kiVar.f1());
        }
        ue ueVar = kiVar.f36430c2;
        if (ueVar != null) {
            ueVar.h(!u12);
            kiVar.f36430c2 = null;
        }
    }

    @Override
    public void a(String str) {
        l8 l8Var = (l8) this.f1176c;
        np.s1(l8Var.f14600a0.f29679a).P1().r(this.f1175b, str, new c8(l8Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        o5.i iVar = (o5.i) this.f1176c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f1175b));
        String str = iVar.f21347a;
        l5.d dVar = iVar.f21349c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(y5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f21347a);
            contentValues.put("priority", Integer.valueOf(y5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public j2.h createDataSource() {
        return new q51(((u51) this.f1176c).h.createDataSource(), this.f1175b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        int i11 = this.f1174a;
        Object obj = this.f1176c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                ez.C(((qd) obj).h.K1).r0(cz.d(messageMedia, this.f1175b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.C1;
                ez.C(((int[]) obj)[0]).r0(cz.d(messageMedia, this.f1175b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void g(String str) {
        org.telegram.messenger.g0.i3(new h0((z10) this.f1176c, str), Math.max(0L, (this.f1175b + 1200) - SystemClock.uptimeMillis()));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f1174a) {
            case 8:
                cm0 cm0Var = ((yw) this.f1176c).D0.f36040e0;
                a0.h hVar = cm0Var.f17115y0;
                long j3 = this.f1175b;
                jg.g0 g0Var = (jg.g0) hVar.f(j3);
                if (g0Var != null) {
                    cm0Var.f17115y0.l(j3);
                    cm0Var.f17108u0.remove(g0Var);
                    cm0Var.f17111w0.remove(g0Var);
                    cm0Var.f17109v0.remove(g0Var);
                    cm0Var.f();
                    vr.a0(cm0Var.f17107t0).f27219a.c(new di.x2(cm0Var, j3, 10));
                    return;
                }
                return;
            default:
                ((jw) this.f1176c).f48422a.getMediaDataController().N1(this.f1175b);
                return;
        }
    }

    @Override
    public void i(int i7, ArrayList arrayList) {
        f91 f91Var = (f91) this.f1176c;
        org.telegram.ui.ActionBar.e2 e2Var = f91Var.f47078b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            np messagesController = e2Var.getMessagesController();
            o oVar = new o(28);
            long j3 = this.f1175b;
            messagesController.m(j3, (TLRPC.User) arrayList.get(i10), i7, null, e2Var, false, oVar, null, new c3(f91Var, tL_messages_invitedUsers, iArr, size, arrayList, j3));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public void j(boolean z10) {
        an anVar = ((p11) this.f1176c).f38162s;
        if (com.google.android.gms.internal.vision.e2.s(anVar)) {
            anVar.Ta(this.f1175b, false);
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        return d0Var.q(vVar, h9.i0.u((e2.l0) this.f1176c), 0, this.f1175b);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
        fi.e1 e1Var = (fi.e1) this.f1176c;
        long j10 = 0;
        if (tL_error == null) {
            if (e1Var.F != null && !e1Var.f11662x) {
                TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
                int i7 = 0;
                if (!groupcallstreamchannels.channels.isEmpty()) {
                    j10 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
                }
                if (groupcallstreamchannels.channels.isEmpty()) {
                    org.telegram.messenger.g0.h3(new fi.x0(e1Var, 5));
                }
                if (e1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
                    TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                    e1Var.H = tL_groupCallParticipant;
                    tL_groupCallParticipant.peer = np.s1(e1Var.f11656e).z1(e1Var.f11654b);
                    e1Var.H.video = new TLRPC.TL_groupCallParticipantVideo();
                    TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                    tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                    ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
                    int size = arrayList.size();
                    while (i7 < size) {
                        TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i7);
                        i7++;
                        tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
                    }
                    e1Var.H.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                    TLRPC.GroupCallParticipant groupCallParticipant = e1Var.H;
                    TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                    tL_groupCallParticipantVideo.endpoint = "unified";
                    groupCallParticipant.videoEndpoint = "unified";
                    NativeInstance nativeInstance = e1Var.F;
                    NativeInstance.SsrcGroup[] d = fi.e1.d(tL_groupCallParticipantVideo);
                    e1Var.r(d);
                    nativeInstance.addIncomingVideoOutput(2, "unified", d, e1Var.I, m5.o(e1Var.H.peer));
                }
            } else {
                return;
            }
        }
        NativeInstance nativeInstance2 = e1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f1175b, j10);
        }
    }

    public d0(Object obj, long j3, int i7) {
        this.f1174a = i7;
        this.f1176c = obj;
        this.f1175b = j3;
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void f(TLRPC.User user) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
