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
import org.telegram.ui.Components.n51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.gu0;
import org.telegram.ui.mr0;
import org.webrtc.GlGenericDrawer;
public final class m5 implements v5, c0.j, m4.d0, m4.g1, e2.j, m4.e1, d9.k, ne.d, r9.d, Vector.TLDeserializer, GlGenericDrawer.TextureCallback, org.telegram.ui.Components.voip.k1, org.telegram.ui.ActionBar.z1, qg.h0, t5.b, qg.s1 {
    public final int f13413a;
    public final Object f13414b;

    public m5(Object obj, int i10) {
        this.f13413a = i10;
        this.f13414b = obj;
    }

    @Override
    public Typeface a() {
        return qg.j0.a((Font) this.f13414b);
    }

    @Override
    public void accept(Object obj) {
        switch (this.f13413a) {
            case 5:
                ((m4.m1) obj).f((b2.a1) this.f13414b);
                return;
            default:
                ((n2.j) obj).a((oa.d) this.f13414b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f13413a) {
            case 8:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                i9.a aVar = (i9.a) ((m2.t) this.f13414b).f15111c;
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
                int i10 = ((c5.c0) this.f13414b).f4355b;
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
        m4.e0 e0Var = (m4.e0) this.f13414b;
        e0Var.f15165o.post(new v2(13, e0Var, iVar));
        return "onPlayRequested";
    }

    @Override
    public Object c(m4.e0 e0Var, m4.v vVar, int i10) {
        int i11 = this.f13413a;
        Object obj = this.f13414b;
        switch (i11) {
            case 4:
                return e0Var.l(vVar, (e9.n0) obj);
            default:
                m4.e1 e1Var = (m4.e1) obj;
                j9.w wVar = j9.w.f12949b;
                if (!e0Var.j()) {
                    e1Var.h(e0Var.f15170t, vVar);
                    m4.i1.P0(e0Var, vVar, i10, new m4.s1(0));
                }
                return j9.w.f12949b;
        }
    }

    @Override
    public void d(m4.u uVar, int i10) {
        uVar.c(i10, (b2.c1) this.f13414b);
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        TLRPC.PhotoSize lambda$readParams$0;
        TLRPC.PhotoSize lambda$readParams$02;
        switch (this.f13413a) {
            case 14:
                lambda$readParams$0 = ((TLRPC.TL_stickerSet) this.f13414b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$0;
            default:
                lambda$readParams$02 = ((TLRPC.TL_stickerSet_layer143) this.f13414b).lambda$readParams$0(inputSerializedData, i10, z10);
                return lambda$readParams$02;
        }
    }

    @Override
    public void e() {
        float f7;
        gu0 gu0Var = (gu0) this.f13414b;
        TextView textView = gu0Var.f44195y1;
        boolean a2 = gu0Var.F0.a();
        ImageView imageView = gu0Var.f44193w1;
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
    public Object f() {
        SQLiteDatabase a2;
        int i10 = this.f13413a;
        Object obj = this.f13414b;
        switch (i10) {
            case 23:
                s5.g gVar = (s5.g) ((s5.c) obj);
                gVar.getClass();
                int i11 = o5.a.e;
                com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(7, false);
                sVar.f6210c = null;
                sVar.d = new ArrayList();
                sVar.e = null;
                sVar.f6209b = "";
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
                long b10 = gVar2.f45025b.b() - gVar2.d.d;
                a2 = gVar2.a();
                a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(b10)};
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
                s5.g gVar3 = (s5.g) ((s5.c) ((ea.b) obj).f8671i);
                a2 = gVar3.a();
                a2.beginTransaction();
                try {
                    a2.compileStatement("DELETE FROM log_event_dropped").execute();
                    a2.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f45025b.b()).execute();
                    a2.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) obj;
                for (l5.i iVar : (Iterable) ((s5.g) ((s5.d) sVar2.f6210c)).c(new r0.s0(22))) {
                    ((m.h3) sVar2.d).U(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f13413a) {
            case 19:
                ((org.telegram.ui.web.b0) this.f13414b).run();
                return;
            default:
                ((mr0) this.f13414b).run();
                return;
        }
    }

    @Override
    public void h(m4.m1 m1Var, m4.v vVar) {
        ((e2.j) this.f13414b).accept(m1Var);
    }

    @Override
    public Object n2(com.google.android.gms.internal.cast.z5 z5Var) {
        switch (this.f13413a) {
            case 12:
                return new oa.c((Context) z5Var.a(Context.class), ((l9.h) z5Var.a(l9.h.class)).d(), z5Var.w(oa.d.class), z5Var.b(ya.b.class), (Executor) z5Var.d((r9.r) this.f13414b));
            default:
                return this.f13414b;
        }
    }

    @Override
    public void p(int i10, float f7, float f10, ne.e eVar) {
        ((Switch) this.f13414b).invalidate();
    }

    @Override
    public void run(Bitmap bitmap, int i10) {
        org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.f13414b;
        if (bitmap != null && bitmap.getPixel(0, 0) != 0) {
            Utilities.stackBlurBitmap(bitmap, Math.max(7, Math.max(bitmap.getWidth(), bitmap.getHeight()) / 180));
            AndroidUtilities.runOnUIThread(new n51(8, tVar, bitmap));
        }
    }

    public m5(p4.t0 t0Var, p4.r0 r0Var) {
        this.f13413a = 20;
        this.f13414b = t0Var;
    }

    @Override
    public void A(float f7, int i10) {
    }
}
