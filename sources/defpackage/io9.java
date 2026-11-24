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
public final class io9 implements jo9, b3c, ed, wi3, h8b, ll5, pic, sc7, xz0, OnSuccessListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public io9(nfa nfaVar, s1b s1bVar, ArrayList arrayList) {
        this.a = (byte) 4;
        this.b = nfaVar;
        this.d = s1bVar;
        this.c = arrayList;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        int i;
        anb anbVar = (anb) this.b;
        wd2 wd2Var = (wd2) this.c;
        TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) this.d;
        jl5 p = imageReceiver.p();
        if (z && p != null && (bitmap = p.c) != null) {
            Drawable drawable = wd2Var.b;
            if (drawable instanceof ye7) {
                ye7 ye7Var = (ye7) drawable;
                TLRPC.WallPaperSettings wallPaperSettings = wallPaper.settings;
                if (wallPaperSettings != null && wallPaperSettings.intensity < 0) {
                    i = -100;
                } else {
                    i = 100;
                }
                ye7Var.r(i, anb.e(bitmap));
                ye7Var.s(anbVar.M);
                anbVar.invalidate();
            }
        }
    }

    @Override
    public final boolean F() {
        return false;
    }

    @Override
    public final void a(qic qicVar) {
        String M0;
        hgc hgcVar = (hgc) this.b;
        VoIPService voIPService = (VoIPService) this.c;
        ric ricVar = (ric) this.d;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            gl.r(hgcVar.S0);
            hgcVar.R0 = false;
            if (hgcVar.w0.isTouchExplorationEnabled()) {
                if (voIPService.isFrontFaceCamera()) {
                    M0 = k96.M0(2131754730, null);
                } else {
                    M0 = k96.M0(2131754729, null);
                }
                qicVar.announceForAccessibility(M0);
            }
            ricVar.d(2, !voIPService.isFrontFaceCamera(), false);
            sharedInstance.switchCamera();
        }
    }

    @Override
    public final Object apply(Object obj) {
        int i;
        s24 s24Var;
        lo9 lo9Var;
        s24 s24Var2;
        byte b = this.a;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        int i6 = 1;
        int i7 = 2;
        Object obj2 = this.d;
        Object obj3 = this.c;
        lo9 lo9Var2 = (lo9) this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                ra0 ra0Var = (ra0) obj2;
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
                                s24Var2 = lo9.f;
                            } else {
                                s24Var2 = new s24(string2);
                            }
                            obj4.e = new o24(s24Var2, cursor.getBlob(5));
                            lo9Var = lo9Var2;
                        } else {
                            String string3 = cursor.getString(4);
                            if (string3 == null) {
                                s24Var = lo9.f;
                            } else {
                                s24Var = new s24(string3);
                            }
                            Cursor query = lo9Var2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
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
                                    lo9 lo9Var3 = lo9Var2;
                                    System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
                                    i10 += bArr2.length;
                                    i9++;
                                    lo9Var2 = lo9Var3;
                                }
                                lo9Var = lo9Var2;
                                query.close();
                                obj4.e = new o24(s24Var, bArr);
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
                        arrayList.add(new ea0(j, ra0Var, obj4.b()));
                        i5 = 3;
                        i6 = 1;
                        i7 = 2;
                        lo9Var2 = lo9Var;
                    } else {
                        fvc.f("Null transportName");
                        return null;
                    }
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                wtc wtcVar = (wtc) obj2;
                ArrayList arrayList3 = (ArrayList) wtcVar.b;
                Cursor cursor2 = (Cursor) obj;
                lo9Var2.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(0);
                    int i11 = cursor2.getInt(1);
                    xb6 xb6Var = xb6.REASON_UNKNOWN;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            xb6Var = xb6.MESSAGE_TOO_OLD;
                        } else if (i11 == 2) {
                            xb6Var = xb6.CACHE_FULL;
                        } else if (i11 == 3) {
                            xb6Var = xb6.PAYLOAD_TOO_BIG;
                        } else if (i11 == i4) {
                            xb6Var = xb6.MAX_RETRIES_REACHED;
                        } else if (i11 == i3) {
                            xb6Var = xb6.INVALID_PAYLOD;
                        } else if (i11 == i2) {
                            xb6Var = xb6.SERVER_ERROR;
                        } else {
                            xne.a(Integer.valueOf(i11), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                    }
                    long j2 = cursor2.getLong(2);
                    if (!hashMap.containsKey(string4)) {
                        hashMap.put(string4, new ArrayList());
                    }
                    ((List) hashMap.get(string4)).add(new yb6(j2, xb6Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int i12 = ac6.c;
                    arrayList3.add(new ac6((String) entry.getKey(), DesugarCollections.unmodifiableList((List) entry.getValue())));
                }
                long e = lo9Var2.b.e();
                SQLiteDatabase a = lo9Var2.a();
                a.beginTransaction();
                try {
                    Cursor rawQuery = a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    rawQuery.moveToNext();
                    vnb vnbVar = new vnb(rawQuery.getLong(0), e);
                    rawQuery.close();
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    wtcVar.a = vnbVar;
                    wtcVar.c = new vx4(new f1b(lo9Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * lo9Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), q90.f.a));
                    wtcVar.d = (String) lo9Var2.e.mo9get();
                    return new mi2((vnb) wtcVar.a, DesugarCollections.unmodifiableList(arrayList3), (vx4) wtcVar.c, (String) wtcVar.d);
                } catch (Throwable th2) {
                    a.endTransaction();
                    throw th2;
                }
        }
    }

    @Override
    public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((iy9) this.b).Y0((TLRPC.User) this.c, tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.d);
    }

    @Override
    public final void k(boolean z) {
        TLRPC.Chat chat = (TLRPC.Chat) this.b;
        d dVar = (d) this.c;
        rgc.l(chat, null, true, null, dVar.getParentActivity(), dVar, (j5) this.d);
    }

    @Override
    public final void o(Canvas canvas, RectF rectF, float f) {
        qfa qfaVar = (qfa) this.b;
        v29 v29Var = (v29) this.c;
        int[] iArr = (int[]) this.d;
        qfaVar.c(canvas, rectF, f);
        qfaVar.f(canvas, rectF, f);
        if (qfaVar.h) {
            qfaVar.b(canvas, rectF, f);
        } else {
            qfaVar.e(canvas, rectF, f);
        }
        if (v29Var != null && v29Var.b0 && v29Var.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            canvas.translate(iArr[0], iArr[1]);
            v29Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onRejoinRequested() {
        ((VoIPService) this.b).lambda$onBroadcastStateChanged$18((fc2) this.c, (NativeInstance) this.d);
    }

    @Override
    public final void onSuccess(Object obj) {
        wjb wjbVar;
        float f;
        gl2 gl2Var = (gl2) this.b;
        Integer num = (Integer) obj;
        fa4.b("wear-auth: /answer delivered to " + ((String) gl2Var.e));
        ((u41) this.c).setLoading(false);
        int i = ((int[]) this.d)[0];
        ArrayList arrayList = (ArrayList) gl2Var.d;
        if (arrayList != null && !arrayList.isEmpty()) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            if (context != null) {
                d S = LaunchActivity.S();
                if (S != null) {
                    wjbVar = S.getResourceProvider();
                } else {
                    wjbVar = null;
                }
                fx0 fx0Var = xrc.c;
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    xrc.c = null;
                }
                fx0 h = de9.h(1, wjbVar, context, false);
                FrameLayout frameLayout = new FrameLayout(context);
                h.O = frameLayout;
                LinearLayout j = de9.j(context, 1);
                frameLayout.addView(j, nme.e(-1, -1, 119));
                TextView b = hve.b(context, 20.0f, bkb.i5, true, wjbVar);
                de9.q(b, 17, null, 2131742684);
                j.addView(b, nme.s(-1, -2, 49, 32.0f, 24.0f, 32.0f, 9.66f));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ru3 f2 = vu3.f((String) arrayList.get(i2));
                    ImageView imageView = new ImageView(context);
                    imageView.setImageDrawable(f2);
                    kk7.i(imageView);
                    int L = gl.L(80.0f);
                    int i3 = bkb.Ei;
                    ShapeDrawable K = bkb.K(L, bkb.p1(0.15f, bkb.v0(i3, wjbVar)));
                    vkb K2 = zkb.K(0.15f, i3);
                    imageView.setBackground(K);
                    zkb.j(imageView, K, K2, null, wjbVar);
                    if (i2 == 0) {
                        f = 0.0f;
                    } else {
                        f = 5.0f;
                    }
                    linearLayout.addView(imageView, nme.k(f, 0.0f, 0.0f, 0.0f, 80, 80));
                }
                j.addView(linearLayout, nme.t(-2, -2, 49, 32, 12, 32, 12));
                u41 i4 = yjb.i(24, wjbVar, context, true);
                i4.setText(k96.M0(2131742683, null));
                j.addView(i4, nme.t(-1, 48, 7, 12, 12, 12, 8));
                int i5 = bkb.Z6;
                h.t0(i5);
                h.M(i5);
                xrc.c = h;
                h.show();
                i4.setOnClickListener(new wg(i4, i, h, (byte) 22));
            }
        }
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        long j;
        vqa vqaVar = (vqa) this.b;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.c;
        cj3 cj3Var2 = (cj3) this.d;
        if (arrayList.isEmpty()) {
            return false;
        }
        long j2 = ((zc7) arrayList.get(0)).a;
        Long l = (Long) je2.e(vqaVar.a).r.get(tL_starGiftUnique.slug);
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (j != 0 && j != j2) {
            ij.k0(vqaVar.getContext(), vqaVar.J0, vqaVar.a, tL_starGiftUnique, j, new mx8(vqaVar, j2, tL_starGiftUnique, cj3Var2, (byte) 4));
            return true;
        }
        je2.e(vqaVar.a).q(j2, new elb(null, tL_starGiftUnique.slug), null, true);
        cj3Var2.presentFragment(mu1.U9(j2), true);
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
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
                d7a d7aVar = (d7a) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                i2 = ((d) d7aVar.a).currentAccount;
                ConnectionsManager.getInstance(i2).sendRequest(resetauthorization, new hj7(d7aVar, tL_authorization, (byte) 22));
                ((m5a) obj3).d.dismiss();
                return;
            case 4:
                nfa nfaVar = (nfa) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                ((s1b) obj).F(arrayList);
                u21.b0(nfaVar.y1).Q(2131624052, 36, k96.G(arrayList.size(), "BotPreviewsDeleted", new Object[0])).j();
                nfaVar.E(false);
                return;
            case 7:
                ((y5b) obj3).G0((w5b) obj2, (Runnable) obj, true);
                return;
            case 8:
                d0 d0Var = (d0) obj3;
                if (bkb.j0(((e0) obj2).d, (zjb) obj, true)) {
                    bkb.r1(false, false);
                    akb akbVar = bkb.I;
                    if (d0Var.e.f == 1) {
                        z = true;
                    }
                    bkb.I1(akbVar, z, -1, null);
                    return;
                }
                return;
            case 13:
                toc tocVar = (toc) obj3;
                c cVar = (c) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    cVar.c.C();
                }
                if (tocVar.getParentLayout() != null && tocVar.getParentLayout().getFragmentStack().size() > 1) {
                    dVar = (d) tocVar.getParentLayout().getFragmentStack().get(tocVar.getParentLayout().getFragmentStack().size() - 2);
                } else {
                    dVar = null;
                }
                cy7.a(cVar.a, new pb((byte) 7), null, null, null, new qo0(cVar, new nu9(tocVar, dVar, (byte) 22), (byte) 4), false, true, new h24((iu4) null, (c05) null));
                return;
            case 14:
                c cVar2 = (c) obj2;
                c01 g = hdVar.g(i, true, true);
                g.d();
                qoc qocVar = new qoc((toc) obj3, g, (byte) 0);
                c.O("disable backup: getting phrase...");
                cVar2.E(false, true, false, new p(cVar2, qocVar, (v05) obj, (byte) 18));
                return;
            default:
                qpc qpcVar = (qpc) obj3;
                p32 p32Var = (p32) obj2;
                ag2 ag2Var = (ag2) obj;
                qpcVar.getClass();
                if (p32Var.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                    int i3 = -qpcVar.p0;
                    qpcVar.p0 = i3;
                    gl.B3(i3, p32Var, null);
                    return;
                }
                String trim = p32Var.getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str = trim;
                }
                qpcVar.h0 = str;
                qpcVar.i0 = !ag2Var.b();
                boolean isEmpty = TextUtils.isEmpty(qpcVar.h0);
                TextView textView = qpcVar.Q;
                if (isEmpty) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(qpcVar.h0);
                    qpcVar.Q.setVisibility(0);
                }
                qpcVar.D0();
                hdVar.dismiss();
                qpcVar.r0();
                return;
        }
    }

    public io9(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
