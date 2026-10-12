package ji;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.nz;
import org.telegram.ui.hu0;
import org.telegram.ui.or0;
import org.webrtc.GlGenericDrawer;
public final class m5 implements v5, c0.j, m4.e0, m4.h1, e2.j, m4.f1, d9.k, ne.d, r9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, org.telegram.ui.ActionBar.z1, qg.h0, t5.b, qg.s1 {
    public final int f13410a;
    public final Object f13411b;

    public m5(Object obj, int i10) {
        this.f13410a = i10;
        this.f13411b = obj;
    }

    @Override
    public Typeface a() {
        return qg.j0.a((Font) this.f13411b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13410a) {
            case 5:
                ((m4.n1) obj).f((b2.a1) this.f13411b);
                return;
            default:
                ((n2.k) obj).a((oa.d) this.f13411b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f13410a) {
            case 8:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                i9.a aVar = (i9.a) ((n4.s) this.f13411b).f16032c;
                if (aVar.a(Math.max(height, width))) {
                    if (aVar.a(height)) {
                        height--;
                    }
                    if (aVar.a(width)) {
                        width--;
                    }
                    return e0.f0.c(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i10 = ((c5.c0) this.f13411b).f4352b;
                if (width2 > i10 || bitmap2.getHeight() > i10) {
                    float f7 = i10;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f7 / width3, f7 / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return e0.f0.c(bitmap2);
        }
    }

    @Override
    public Object b(c0.i iVar) {
        m4.f0 f0Var = (m4.f0) this.f13411b;
        f0Var.f15435o.post(new v2(16, f0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        int i11 = this.f13410a;
        Object obj = this.f13411b;
        switch (i11) {
            case 4:
                return f0Var.l(wVar, (e9.n0) obj);
            default:
                m4.f1 f1Var = (m4.f1) obj;
                j9.w wVar2 = j9.w.f12945b;
                if (!f0Var.j()) {
                    f1Var.e(f0Var.f15440t, wVar);
                    m4.j1.P0(f0Var, wVar, i10, new m4.t1(0));
                }
                return j9.w.f12945b;
        }
    }

    @Override
    public void d(m4.v vVar, int i10) {
        vVar.c(i10, (b2.c1) this.f13411b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f13410a) {
            case 14:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f13411b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f13411b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e(m4.n1 n1Var, m4.w wVar) {
        ((e2.j) this.f13411b).accept(n1Var);
    }

    @Override
    public void f() {
        float f7;
        hu0 hu0Var = (hu0) this.f13411b;
        TextView textView = hu0Var.f44436y1;
        boolean a2 = hu0Var.F0.a();
        ImageView imageView = hu0Var.f44434w1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f13410a) {
            case 19:
                ((org.telegram.ui.web.a0) this.f13411b).run();
                return;
            default:
                ((or0) this.f13411b).run();
                return;
        }
    }

    @Override
    public Object h() {
        SQLiteDatabase a2;
        int i10 = this.f13410a;
        Object obj = this.f13411b;
        switch (i10) {
            case 23:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
                sVar.f6207c = null;
                sVar.d = new ArrayList();
                sVar.e = null;
                sVar.f6206b = "";
                HashMap hashMap = new HashMap();
                a2 = gVar.a();
                a2.beginTransaction();
                try {
                    o5.a aVar = (o5.a) s5.g.h(a2.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new nz(gVar, hashMap, sVar, 9));
                    a2.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 24:
                s5.g gVar2 = (s5.g) ((s5.d) obj);
                long d = gVar2.f45025b.d() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(d)};
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
                s5.g gVar3 = (s5.g) ((s5.c) ((ea.b) obj).f8668i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f45025b.d()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) sVar2.f6207c)).c(new r0.h(22))) {
                    ((li.k) sVar2.d).U(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        switch (this.f13410a) {
            case 12:
                return new oa.c((Context) z5Var.a(Context.class), ((l9.h) z5Var.a(l9.h.class)).d(), z5Var.v(oa.d.class), z5Var.b(ya.b.class), (Executor) z5Var.e((r9.r) this.f13411b));
            default:
                return this.f13411b;
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        ((Switch) this.f13411b).invalidate();
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f13411b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new k31(13, tVar, bitmap));
        }
    }

    public m5(p4.t0 t0Var, p4.s0 s0Var) {
        this.f13410a = 20;
        this.f13411b = t0Var;
    }

    @Override
    public void C(float f7, int i10) {
    }
}
