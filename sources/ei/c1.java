package ei;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cc;
import org.telegram.messenger.ec;
import org.telegram.messenger.hp;
import org.telegram.messenger.ir;
import org.telegram.messenger.kd;
import org.telegram.messenger.or;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.th;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ew;
import org.telegram.ui.ia0;
import org.telegram.ui.m40;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.y81;
public final class c1 implements RequestDelegateTimestamp, or, o4.f1, ec, org.telegram.ui.Components.r4, ia0, ir, i2.g, org.telegram.ui.ActionBar.p1, m40, u5.e {
    public final int f10143a;
    public final long f10144b;
    public final Object f10145c;

    public c1(long j10, n5.i iVar) {
        this.f10143a = 13;
        this.f10144b = j10;
        this.f10145c = iVar;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        boolean u12;
        bi biVar = (bi) this.f10145c;
        th thVar = biVar.f32275t2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
        long j10 = this.f10144b;
        if (thVar != chatAttachAlertPhotoLayout && thVar != biVar.f32235i2) {
            if (!thVar.L(z10, i3, i10, j10, biVar.f1())) {
                biVar.f32297y4 = true;
                biVar.dismiss();
            }
            u12 = false;
        } else {
            u12 = biVar.u1(z10, i3, i10, j10, biVar.f1());
        }
        se seVar = biVar.Z1;
        if (seVar != null) {
            seVar.g(!u12);
            biVar.Z1 = null;
        }
    }

    @Override
    public void a(String str) {
        gi.o8 o8Var = (gi.o8) this.f10145c;
        hp.s1(o8Var.f13340a0.f28583a).P1().r(this.f10144b, str, new gi.d8(o8Var, 2));
    }

    @Override
    public Object apply(Object obj) {
        n5.i iVar = (n5.i) this.f10145c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f10144b));
        String str = iVar.f20245a;
        k5.d dVar = iVar.f20247c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(x5.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f20245a);
            contentValues.put("priority", Integer.valueOf(x5.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public i2.h createDataSource() {
        return new i51(((m51) this.f10145c).h.createDataSource(), this.f10144b);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        int i11 = this.f10143a;
        Object obj = this.f10145c;
        switch (i11) {
            case 5:
                float[] fArr = FragmentContextView.X0;
                yy.C(((kd) obj).h.I1).r0(wy.d(messageMedia, this.f10144b, null, null, null, null, true, 0));
                return;
            default:
                String str = LaunchActivity.E1;
                yy.C(((int[]) obj)[0]).r0(wy.d(messageMedia, this.f10144b, null, null, null, null, true, 0));
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f10143a) {
            case 8:
                bm0 bm0Var = ((uw) this.f10145c).D0.f34751e0;
                a0.h hVar = bm0Var.f16988y0;
                long j10 = this.f10144b;
                kg.d0 d0Var = (kg.d0) hVar.f(j10);
                if (d0Var != null) {
                    bm0Var.f16988y0.l(j10);
                    bm0Var.f16981u0.remove(d0Var);
                    bm0Var.f16984w0.remove(d0Var);
                    bm0Var.f16982v0.remove(d0Var);
                    bm0Var.f();
                    qr.a0(bm0Var.f16980t0).f24934a.c(new ci.e3(bm0Var, j10, 12));
                    return;
                }
                return;
            default:
                ((ew) this.f10145c).f45056a.getMediaDataController().N1(this.f10144b);
                return;
        }
    }

    @Override
    public void h(int i3, ArrayList arrayList) {
        y81 y81Var = (y81) this.f10145c;
        org.telegram.ui.ActionBar.d2 d2Var = y81Var.f52227b;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        int i10 = 0;
        while (i10 < size) {
            hp messagesController = d2Var.getMessagesController();
            ai.y1 y1Var = new ai.y1(26);
            long j10 = this.f10144b;
            messagesController.m(j10, (TLRPC.User) arrayList.get(i10), i3, null, d2Var, false, y1Var, null, new ii.f3(y81Var, tL_messages_invitedUsers, iArr, size, arrayList, j10));
            i10++;
            size = size;
            iArr = iArr;
            tL_messages_invitedUsers = tL_messages_invitedUsers;
        }
    }

    @Override
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        return e0Var.q(vVar, g9.i0.u((d2.n0) this.f10145c), 0, this.f10144b);
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi.d4 d4Var = (mi.d4) this.f10145c;
        cc p10 = imageReceiver.p();
        if (z10 && p10 != null) {
            Bitmap bitmap = p10.f22007c;
            if (bitmap == null) {
                Drawable drawable = p10.d;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                }
            }
            d4Var.onComplete(new Pair(Long.valueOf(this.f10144b), bitmap));
        }
    }

    @Override
    public void o(boolean z10) {
        wm wmVar = ((g11) this.f10145c).f33937s;
        if (com.google.android.recaptcha.internal.a.u(wmVar)) {
            wmVar.Qa(this.f10144b, false);
        }
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j10) {
        g1 g1Var = (g1) this.f10145c;
        long j11 = 0;
        if (tL_error == null) {
            if (g1Var.F != null && !g1Var.f10305x) {
                TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
                int i3 = 0;
                if (!groupcallstreamchannels.channels.isEmpty()) {
                    j11 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
                }
                if (groupcallstreamchannels.channels.isEmpty()) {
                    org.telegram.messenger.g0.h3(new a1(g1Var, 5));
                }
                if (g1Var.H == null && !groupcallstreamchannels.channels.isEmpty()) {
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
            } else {
                return;
            }
        }
        NativeInstance nativeInstance2 = g1Var.F;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f10144b, j11);
        }
    }

    public c1(Object obj, long j10, int i3) {
        this.f10143a = i3;
        this.f10145c = obj;
        this.f10144b = j10;
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void e(TLRPC.User user) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
