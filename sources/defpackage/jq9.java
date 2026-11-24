package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.d0;
import org.telegram.ui.e0;
public final class jq9 implements kq9, c5c, ee, hk3, jab, ln5, pkc, ue7, e11, OnSuccessListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public jq9(nha nhaVar, t3b t3bVar, ArrayList arrayList) {
        this.a = (byte) 4;
        this.b = nhaVar;
        this.d = t3bVar;
        this.c = arrayList;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void a(qkc qkcVar) {
        String M0;
        iic iicVar = (iic) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        rkc rkcVar = (rkc) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            gm.r(iicVar.S0);
            iicVar.R0 = false;
            if (iicVar.w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    M0 = jb6.M0(2131754730, null);
                } else {
                    M0 = jb6.M0(2131754729, null);
                }
                qkcVar.announceForAccessibility(M0);
            }
            rkcVar.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public final Object apply(Object obj) {
        int i;
        d44 d44Var;
        mq9 mq9Var;
        d44 d44Var2;
        byte b = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        int i6 = 1;
        int i7 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        mq9 mq9Var2 = (mq9) this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                rb0 rb0Var = (rb0) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        i = i6;
                    } else {
                        i = 0;
                    }
                    ?? obj4 = new Object();
                    obj4.h = new HashMap();
                    String string = cursor.getString(i6);
                    if (string != null) {
                        obj4.a = string;
                        obj4.f = Long.valueOf(cursor.getLong(i7));
                        obj4.g = Long.valueOf(cursor.getLong(i5));
                        if (i != 0) {
                            String string2 = cursor.getString(4);
                            if (string2 == null) {
                                d44Var2 = mq9.f;
                            } else {
                                d44Var2 = new d44(string2);
                            }
                            obj4.e = new z34(d44Var2, cursor.getBlob(5));
                            mq9Var = mq9Var2;
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                d44Var = mq9.f;
                            } else {
                                d44Var = new d44(string3);
                            }
                            Cursor query = mq9Var2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                int i8 = 0;
                                while (query.moveToNext()) {
                                    byte[] blob = query.getBlob(0);
                                    arrayList2.add(blob);
                                    i8 += blob.length;
                                }
                                byte[] bArr = new byte[i8];
                                int i9 = 0;
                                int i10 = 0;
                                while (i9 < arrayList2.size()) {
                                    byte[] bArr2 = (byte[]) arrayList2.get(i9);
                                    mq9 mq9Var3 = mq9Var2;
                                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                                    i10 += bArr2.length;
                                    i9++;
                                    mq9Var2 = mq9Var3;
                                }
                                mq9Var = mq9Var2;
                                query.close();
                                obj4.e = new z34(d44Var, bArr);
                            } catch (Throwable th) {
                                query.close();
                                throw th;
                            }
                        }
                        if (!cursor.isNull(6)) {
                            obj4.c = Integer.valueOf(cursor.getInt(6));
                        }
                        if (!cursor.isNull(8)) {
                            obj4.d = Integer.valueOf(cursor.getInt(8));
                        }
                        if (!cursor.isNull(9)) {
                            obj4.b = cursor.getString(9);
                        }
                        if (!cursor.isNull(10)) {
                            obj4.i = cursor.getBlob(10);
                        }
                        if (!cursor.isNull(11)) {
                            obj4.j = cursor.getBlob(11);
                        }
                        arrayList.add(new eb0(j, rb0Var, obj4.b()));
                        i5 = 3;
                        i6 = 1;
                        i7 = 2;
                        mq9Var2 = mq9Var;
                    } else {
                        gxc.d("Null transportName");
                        return null;
                    }
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                xvc xvcVar = (xvc) obj2;
                ArrayList arrayList3 = (ArrayList) xvcVar.c;
                Cursor cursor2 = (Cursor) obj;
                mq9Var2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i11 = cursor2.getInt(1);
                    wd6 wd6Var = wd6.REASON_UNKNOWN;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            wd6Var = wd6.MESSAGE_TOO_OLD;
                        } else if (i11 == 2) {
                            wd6Var = wd6.CACHE_FULL;
                        } else if (i11 == 3) {
                            wd6Var = wd6.PAYLOAD_TOO_BIG;
                        } else if (i11 == i4) {
                            wd6Var = wd6.MAX_RETRIES_REACHED;
                        } else if (i11 == i3) {
                            wd6Var = wd6.INVALID_PAYLOD;
                        } else if (i11 == i2) {
                            wd6Var = wd6.SERVER_ERROR;
                        } else {
                            aqe.a(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j2 = cursor2.getLong(2);
                    if (!hashMap.containsKey(string4)) {
                        hashMap.put(string4, new ArrayList());
                    }
                    ((List) hashMap.get(string4)).add(new xd6(j2, wd6Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int i12 = zd6.c;
                    arrayList3.add(new zd6((String) entry.getKey(), DesugarCollections.unmodifiableList((List) entry.getValue())));
                }
                long a = mq9Var2.b.a();
                SQLiteDatabase a2 = mq9Var2.a();
                a2.beginTransaction();
                try {
                    Cursor rawQuery = a2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    rawQuery.moveToNext();
                    wpb wpbVar = new wpb(rawQuery.getLong(0), a);
                    rawQuery.close();
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    xvcVar.b = wpbVar;
                    xvcVar.d = new xz4(new h3b(mq9Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * mq9Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), qa0.f.a));
                    xvcVar.e = (String) mq9Var2.e.mo8get();
                    return new ak2((wpb) xvcVar.b, DesugarCollections.unmodifiableList(arrayList3), (xz4) xvcVar.d, (String) xvcVar.e);
                } catch (Throwable th2) {
                    a2.endTransaction();
                    throw th2;
                }
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        int i;
        bpb bpbVar = (bpb) this.b;
        hf2 hf2Var = (hf2) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        jn5 p = imageReceiver.p();
        if (z && p != null && (bitmap = p.c) != null) {
            Drawable drawable = hf2Var.b;
            if (drawable instanceof ah7) {
                ah7 ah7Var = (ah7) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i = -100;
                } else {
                    i = 100;
                }
                ah7Var.r(i, bpb.e(bitmap));
                ah7Var.s(bpbVar.M);
                bpbVar.invalidate();
            }
        }
    }

    @Override
    public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((k0a) this.b).Y0((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public final void l(Canvas canvas, RectF rectF, float f) {
        sha shaVar = (sha) this.b;
        y49 y49Var = (y49) this.c;
        int[] iArr = (int[]) this.d;
        shaVar.c(canvas, rectF, f);
        shaVar.f(canvas, rectF, f);
        if (shaVar.h) {
            shaVar.b(canvas, rectF, f);
        } else {
            shaVar.e(canvas, rectF, f);
        }
        if (y49Var != null && y49Var.b0 && y49Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            y49Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onRejoinRequested() {
        ((VoIPService) this.b).lambda$onBroadcastStateChanged$18((qd2) this.c, (NativeInstance) this.d);
    }

    @Override
    public final void onSuccess(Object obj) {
        ylb ylbVar;
        float f;
        sm2 sm2Var = (sm2) this.b;
        Integer num = (Integer) obj;
        fc4.b("wear-auth: /answer delivered to " + ((String) sm2Var.e));
        ((b61) this.c).setLoading(false);
        int i = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) sm2Var.d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            if (context != null) {
                d S = LaunchActivity.S();
                if (S != null) {
                    ylbVar = S.getResourceProvider();
                } else {
                    ylbVar = null;
                }
                my0 my0Var = auc.c;
                if (my0Var != null) {
                    my0Var.dismiss();
                    auc.c = null;
                }
                my0 h = hg9.h(1, ylbVar, context, false);
                FrameLayout frameLayout = new FrameLayout(context);
                h.O = frameLayout;
                LinearLayout i2 = hg9.i(context, 1);
                frameLayout.addView(i2, qoe.e(-1, -1, 119));
                TextView b = jxe.b(context, 20.0f, cmb.i5, true, ylbVar);
                hg9.p(b, 17, null, 2131742610);
                i2.addView(b, qoe.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    cw3 f2 = gw3.f((String) arrayList.get(i3));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f2);
                    nm7.i(imageView);
                    int L = gm.L(80.0f);
                    int i4 = cmb.Ei;
                    ShapeDrawable K = cmb.K(L, cmb.p1(0.15f, cmb.v0(i4, ylbVar)));
                    wmb K2 = anb.K(0.15f, i4);
                    imageView.setBackground(K);
                    anb.j(imageView, K, K2, null, ylbVar);
                    if (i3 == 0) {
                        f = 0.0f;
                    } else {
                        f = 5.0f;
                    }
                    linearLayout.addView(imageView, qoe.k(f, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                i2.addView(linearLayout, qoe.t(-2, -2, 49, 32, 12, 32, 12));
                b61 i5 = mlb.i(24, ylbVar, context, true);
                i5.setText(jb6.M0(2131742609, null));
                i2.addView(i5, qoe.t(-1, 48, 7, 12, 12, 12, 8));
                int i6 = cmb.Z6;
                h.t0(i6);
                h.L(i6);
                auc.c = h;
                h.show();
                i5.setOnClickListener(new wh(i5, i, h, (byte) 22));
            }
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        long j;
        wsa wsaVar = (wsa) this.b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
        nk3 nk3Var2 = (nk3) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        long j2 = ((bf7) arrayList.get(0)).a;
        Long l = (Long) uf2.e(wsaVar.a).r.get(tL_starGiftUnique.slug);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j != 0 && j != j2) {
            ik.k0(wsaVar.getContext(), wsaVar.J0, wsaVar.a, tL_starGiftUnique, j, new nz8(wsaVar, j2, tL_starGiftUnique, nk3Var2, (byte) 4));
            return true;
        }
        uf2.e(wsaVar.a).q(j2, new fnb(null, tL_starGiftUnique.slug), null, true);
        nk3Var2.presentFragment(yv1.ga(j2), true);
        return true;
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        d dVar;
        byte b = this.a;
        String str = null;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 3:
                e9a e9aVar = (e9a) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i2 = ((d) e9aVar.a).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new jl7(e9aVar, tL_authorization, (byte) 22));
                ((o7a) obj3).d.dismiss();
                return;
            case 4:
                nha nhaVar = (nha) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((t3b) obj).F(arrayList);
                c41.b0(nhaVar.y1).Q(2131624052, 36, jb6.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                nhaVar.E(false);
                return;
            case 7:
                ((a8b) obj3).G0((y7b) obj2, (Runnable) obj, true);
                return;
            case 8:
                d0 d0Var = (d0) obj3;
                if (cmb.j0(((e0) obj2).d, (amb) obj, true)) {
                    cmb.r1(false, false);
                    bmb bmbVar = cmb.I;
                    if (d0Var.e.f == 1) {
                        z = true;
                    }
                    cmb.I1(bmbVar, z, -1, null);
                    return;
                }
                return;
            case 13:
                vqc vqcVar = (vqc) obj3;
                c cVar = (c) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    cVar.c.C();
                }
                if (vqcVar.getParentLayout() != null && vqcVar.getParentLayout().getFragmentStack().size() > 1) {
                    dVar = (d) vqcVar.getParentLayout().getFragmentStack().get(vqcVar.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    dVar = null;
                }
                e08.a(cVar.a, new pb((byte) 7), null, null, null, new qp0(cVar, new ts9(vqcVar, dVar, (byte) 23), (byte) 4), false, true, new s34((qn4) null, (c25) null));
                return;
            case 14:
                c cVar2 = (c) obj2;
                k11 g = heVar.g(i, true, true);
                g.d();
                sqc sqcVar = new sqc((vqc) obj3, g, (byte) 0);
                c.O("disable backup: getting phrase...");
                cVar2.E(false, true, false, new p(cVar2, sqcVar, (v25) obj, (byte) 18));
                return;
            default:
                rrc rrcVar = (rrc) obj3;
                a52 a52Var = (a52) obj2;
                oh2 oh2Var = (oh2) obj;
                rrcVar.getClass();
                if (a52Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i3 = -rrcVar.p0;
                    rrcVar.p0 = i3;
                    gm.A3(i3, a52Var, null);
                    return;
                }
                String trim = a52Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                rrcVar.h0 = str;
                rrcVar.i0 = !oh2Var.b();
                boolean isEmpty = TextUtils.isEmpty(rrcVar.h0);
                TextView textView = rrcVar.Q;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(rrcVar.h0);
                    rrcVar.Q.setVisibility(0);
                }
                rrcVar.E0();
                heVar.dismiss();
                rrcVar.s0();
                return;
        }
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override
    public final void z(boolean z) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        d dVar = (d) this.c;
        sic.l(chat, null, true, null, dVar.getParentActivity(), dVar, (j5) this.d);
    }

    public jq9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }
}
