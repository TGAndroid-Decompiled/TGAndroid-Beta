package mg;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.p20;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.ik0;
import org.webrtc.GlGenericDrawer;
import rh.h8;
import rh.x6;
public final class l implements org.telegram.ui.ActionBar.u1, ik0, mh.a, e2.j, r9.d, Vector.TLDeserializer, r0.m, org.telegram.ui.ActionBar.i1, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.v0, a5.b, rf.l, org.telegram.messenger.t1, t5.b, p20 {
    public final int f13182a;
    public final Object f13183b;

    public l(Object obj, int i10) {
        this.f13182a = i10;
        this.f13183b = obj;
    }

    @Override
    public Object K(bh.d dVar) {
        switch (this.f13182a) {
            case 4:
                return new oa.c((Context) dVar.b(Context.class), ((l9.h) dVar.b(l9.h.class)).d(), dVar.J(oa.d.class), dVar.c(za.b.class), (Executor) dVar.d((r9.r) this.f13183b));
            default:
                return this.f13183b;
        }
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = this.f13182a;
        int i11 = 0;
        Object obj = this.f13183b;
        switch (i10) {
            case 8:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.f20067v1;
                i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
                i0.c I02 = org.telegram.messenger.i0.I0(j1Var, true);
                actionBarLayout.f20114t1 = I0;
                actionBarLayout.f20116u1 = I02;
                actionBarLayout.f20112s1 = j1Var;
                int childCount = actionBarLayout.getChildCount();
                while (i11 < childCount) {
                    actionBarLayout.o(actionBarLayout.getChildAt(i11), j1Var);
                    i11++;
                }
                return r0.j1.f46142b;
            case 12:
                q3 q3Var = (q3) obj;
                q3Var.f20678s = j1Var.f46143a.f(2).d;
                q3Var.invalidate();
                return r0.j1.f46142b;
            case 13:
                s3 s3Var = (s3) obj;
                s3Var.e = j1Var;
                i0.c I03 = org.telegram.messenger.i0.I0(j1Var, false);
                i0.c I04 = org.telegram.messenger.i0.I0(j1Var, true);
                if (!s3Var.f20772f.equals(I03) || !s3Var.h.equals(I04)) {
                    org.telegram.messenger.i0.f16166m = I03.f7767b;
                    org.telegram.messenger.i0.f16167n = I03.d;
                    s3Var.f20772f = I03;
                    s3Var.h = I04;
                    s3Var.requestLayout();
                }
                int childCount2 = s3Var.getChildCount();
                while (i11 < childCount2) {
                    View childAt = s3Var.getChildAt(i11);
                    if ((childAt instanceof ActionBarLayout) || childAt.getTag() == null) {
                        r0.h0.b(childAt, j1Var);
                    }
                    i11++;
                }
                s3Var.invalidate();
                return r0.j1.f46142b;
            default:
                ((ph.k0) obj).f45159n1.j(j1Var);
                return r0.j1.f46142b;
        }
    }

    @Override
    public void a(c5.g gVar, List list) {
        int i10;
        ph.l1 l1Var = (ph.l1) this.f13183b;
        ArrayList arrayList = l1Var.f45208e2;
        Iterator it = list.iterator();
        long j10 = 0;
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            c5.m mVar = (c5.m) it.next();
            int size = arrayList.size();
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kg.m mVar2 = (kg.m) obj;
                    if (mVar2.h() != null && mVar2.h().equals(mVar.f3801c)) {
                        mVar2.h = mVar;
                        if (mVar2.f() > j10) {
                            j10 = mVar2.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ((kg.m) obj2).f11183g = j10;
        }
        org.telegram.messenger.i0.g3(new w5(l1Var, 26));
    }

    @Override
    public void accept(Object obj) {
        ((n2.j) obj).a((oa.d) this.f13183b);
    }

    @Override
    public void b(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: mg.l.b(float, float, int, android.view.View):void");
    }

    @Override
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, b5.h hVar) {
        String uri2;
        org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) this.f13183b;
        org.telegram.ui.web.z0 z0Var = v0Var.Q;
        if (webView == v0Var && z0Var != null) {
            if (webView == z0Var.f43059a && aVar.f281b == 0) {
                if (uri == null) {
                    uri2 = null;
                } else {
                    uri2 = uri.toString();
                }
                String k10 = org.telegram.ui.web.z0.k(uri2);
                if (z0Var.f43084t0 && (TextUtils.isEmpty(z0Var.G0) || !TextUtils.equals(z0Var.G0, k10) || !TextUtils.equals(z0Var.G0, z0Var.getOriginHost()))) {
                    z0Var.g("onBotWebMessage ignored: untrusted origin");
                    return;
                }
                org.telegram.ui.web.x0 f7 = z0Var.f();
                try {
                    aVar.h(0);
                    String str = (String) aVar.f282c;
                    if (str != null && str.length() <= 1048576) {
                        JSONObject jSONObject = new JSONObject(str);
                        String string = jSONObject.getString("eventType");
                        if (!string.isEmpty() && string.length() <= 128) {
                            org.telegram.messenger.i0.g3(new org.telegram.ui.web.x(z0Var, webView, f7, string, jSONObject.optString("eventData", null), 2));
                            return;
                        }
                        z0Var.g("onBotWebMessage ignored: invalid event type");
                        return;
                    }
                    z0Var.g("onBotWebMessage ignored: invalid payload length");
                    return;
                } catch (JSONException e) {
                    f8.g(e, true);
                    return;
                }
            }
            z0Var.g("onBotWebMessage ignored: invalid source or payload");
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f13182a) {
            case 6:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f13183b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f13183b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public Object g() {
        SQLiteDatabase a2;
        int i10 = this.f13182a;
        Object obj = this.f13183b;
        switch (i10) {
            case 23:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                ?? obj2 = new Object();
                obj2.f53573b = null;
                obj2.f53574c = new ArrayList();
                obj2.d = null;
                obj2.f53572a = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new q5.a(gVar, hashMap, (Object) obj2, 4));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 24:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long g10 = gVar2.f48086b.g() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(g10)};
                    Cursor rawQuery = a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i12 = rawQuery.getInt(0);
                        gVar2.e(i12, o5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a2.delete("events", "timestamp_ms < ?", strArr);
                    a2.setTransactionSuccessful();
                    a2.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 25:
                s5.g gVar3 = (s5.g) ((s5.c) ((ea.d) obj).f6471i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f48086b.g()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                ji.f fVar = (ji.f) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) fVar.f10443c)).c(new x6(15))) {
                    ((q5.d) fVar.d).x(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f13182a) {
            case 0:
                ((p1) this.f13183b).run();
                return;
            case 10:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) this.f13183b;
                DialogInterface.OnCancelListener onCancelListener = x1Var2.J;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(x1Var2);
                }
                x1Var2.dismiss();
                return;
            case 17:
                ((org.telegram.ui.web.x) this.f13183b).run();
                return;
            default:
                ((org.telegram.ui.Cells.e1) this.f13183b).run();
                return;
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        rh.h hVar = (rh.h) this.f13183b;
        b51 b51Var = (b51) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        rh.i iVar = hVar.f47005r;
        if (b51Var.G instanceof TL_stars.StarsTransaction) {
            h8.k1(hVar.getContext(), true, iVar.f47049b, rh.i.p0(iVar), (TL_stars.StarsTransaction) b51Var.G, rh.i.q0(iVar));
        } else if (hVar.h) {
            hVar.h = false;
            hVar.a();
        }
    }

    @Override
    public void l(long j10) {
        ((ph.d) this.f13183b).a(j10, true);
    }

    @Override
    public void p(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.k1 k1Var;
        org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) this.f13183b;
        t0Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (k1Var = t0Var.d) != null && k1Var.isShowing()) {
            t0Var.d.d(true);
        }
    }

    @Override
    public void r(Canvas canvas, int i10) {
        mh.j jVar = (mh.j) this.f13183b;
        jVar.getClass();
        canvas.save();
        RectF rectF = jVar.f13365r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.i0.L(30.0f));
        jVar.e(canvas, true, i10);
        canvas.restore();
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.f13183b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            org.telegram.messenger.i0.g3(new hi0(29, rVar, bitmap));
        }
    }

    public l(p4.t0 t0Var, p4.s0 s0Var) {
        this.f13182a = 18;
        this.f13183b = t0Var;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
