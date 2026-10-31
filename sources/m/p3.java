package m;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.opengl.Matrix;
import android.os.RemoteException;
import android.text.TextPaint;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.q6;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.ia;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.z60;
import v7.z7;
import w7.b6;
public final class p3 implements n5.b {
    public Object f12518a;
    public Object f12519b;
    public Object f12520c;
    public Object d;
    public Object e;
    public Object f12521f;
    public Object h;

    public p3(Set set, a0.f fVar, String str, String str2, n8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f12518a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f12520c = fVar2;
        this.d = str;
        this.e = str2;
        this.f12521f = aVar == null ? n8.a.f13732a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f12519b = DesugarCollections.unmodifiableSet(hashSet);
            return;
        }
        throw a1.g.h(it);
    }

    public static void f(FrameLayout frameLayout) {
        k6.d dVar = k6.d.d;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, k6.e.f10935a);
        String c10 = n6.q.c(context, d);
        String b10 = n6.q.b(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent b11 = dVar.b(d, context, null);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new androidx.mediarouter.app.z(context, b11));
        }
    }

    public void a() {
        e(null);
        z60 z60Var = (z60) this.f12520c;
        if (z60Var != null) {
            z60Var.u();
            this.f12520c = null;
        }
        this.d = null;
        this.e = null;
        this.f12521f = null;
    }

    public void b(q6 q6Var, ArrayList arrayList) {
        p6 p6Var = (p6) this.f12519b;
        LinearLayout linearLayout = (LinearLayout) this.d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                bi.p0 p0Var = (bi.p0) obj;
                ag.k3 k3Var = new ag.k3(q6Var.getContext(), p0Var, p6Var);
                k3Var.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                k3Var.setBackground(t6.a0(t6.w0(t6.f21020i6, p6Var), 0, 0));
                k3Var.setOnClickListener(new ag.i(this, q6Var, p0Var, 3));
                ((LinearLayout) this.d).addView(k3Var, b6.o(-1, 48));
            }
        }
    }

    public void c(int i10, int i11, float f7, float f10, boolean z10, float[] fArr) {
        float f11;
        float[] fArr2 = (float[]) this.f12518a;
        float f12 = (i10 - i11) / 0.3902439f;
        if (f12 <= 0.0f || f12 > i10) {
            f12 = i10;
        }
        float f13 = 1.0f;
        Matrix.perspectiveM(fArr2, 0, (float) Math.toDegrees(Math.atan(Math.tan(Math.toRadians(5.199999809265137d)) * (i11 / Math.max(1.0f, f12 / 1.64f))) * 2.0d), i10 / Math.max(1, i11), 0.1f, 20.0f);
        Matrix.setLookAtM((float[]) this.f12519b, 0, 0.0f, 0.0f, 6.7f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        float[] fArr3 = (float[]) this.f12520c;
        Matrix.setIdentityM(fArr3, 0);
        Matrix.rotateM(fArr3, 0, -f7, 1.0f, 0.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, -f10, 0.0f, 1.0f, 0.0f);
        Matrix.rotateM(fArr3, 0, 90.0f, 0.0f, 1.0f, 0.0f);
        Matrix.translateM(fArr3, 0, -0.02f, 0.0f, 0.0f);
        Matrix.scaleM(fArr3, 0, 0.965f, 0.965f, 0.965f);
        Matrix.multiplyMM((float[]) this.d, 0, (float[]) this.f12519b, 0, (float[]) this.f12520c, 0);
        Matrix.multiplyMM((float[]) this.e, 0, (float[]) this.f12518a, 0, (float[]) this.d, 0);
        if (z10) {
            f11 = 0.0125f;
        } else {
            f11 = -0.0125f;
        }
        if (!z10) {
            f13 = -1.0f;
        }
        float f14 = f13;
        float f15 = -f14;
        d(f11, 0.618561f, f14, i10, i11, fArr, 0);
        d(f11, 0.618561f, f15, i10, i11, fArr, 2);
        d(f11, -0.593561f, f15, i10, i11, fArr, 4);
        d(f11, -0.593561f, f14, i10, i11, fArr, 6);
    }

    public float d(float f7, float f10, float f11, int i10, int i11, float[] fArr, int i12) {
        float[] fArr2 = (float[]) this.f12521f;
        fArr2[0] = f7;
        fArr2[1] = f10;
        fArr2[2] = f11;
        fArr2[3] = 1.0f;
        Matrix.multiplyMV((float[]) this.h, 0, (float[]) this.e, 0, fArr2, 0);
        float[] fArr3 = (float[]) this.h;
        float f12 = 1.0f / fArr3[3];
        fArr[i12] = c3.i0.u(fArr3[0], f12, 0.5f, 0.5f) * i10;
        fArr[i12 + 1] = org.telegram.ui.Cells.f1.x(fArr3[1], f12, 0.5f, 0.5f) * i11;
        return fArr3[2] * f12;
    }

    public void e(q6 q6Var) {
        q6 q6Var2 = (q6) this.h;
        if (q6Var2 != q6Var) {
            if (q6Var2 != null) {
                q6Var2.setShowCommandBackground(false);
            }
            this.h = q6Var;
            if (q6Var != null) {
                q6Var.setShowCommandBackground(true);
            }
        }
    }

    public void g(q6 q6Var, String str) {
        z60 z60Var;
        z60 z60Var2;
        if (str == null) {
            a();
            return;
        }
        ArrayList a2 = bi.p0.a(str);
        if (a2.isEmpty()) {
            a();
            return;
        }
        e(q6Var);
        if (((q6) this.f12521f) == q6Var && a2.equals((ArrayList) this.e) && (z60Var2 = (z60) this.f12520c) != null && z60Var2.D()) {
            return;
        }
        if (((q6) this.f12521f) == q6Var && (z60Var = (z60) this.f12520c) != null && z60Var.D() && ((LinearLayout) this.d) != null) {
            this.e = a2;
            b(q6Var, a2);
            ((z60) this.f12520c).O();
            return;
        }
        a();
        e(q6Var);
        this.f12521f = q6Var;
        this.e = a2;
        LinearLayout linearLayout = new LinearLayout(q6Var.getContext());
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        b(q6Var, a2);
        z60 a10 = ((bi.q0) this.f12518a).a(q6Var.getEditText());
        a10.Q = true;
        a10.f32941s = 0;
        a10.f32942t = false;
        a10.r((LinearLayout) this.d, b6.o(220, -2));
        a10.X = org.telegram.messenger.i0.L(240.0f);
        a10.f32923i = 3;
        a10.a0(-org.telegram.messenger.i0.L(12.0f), 0.0f);
        a10.f32936p = new a3.d(this, 21);
        a10.f32916d0 = true;
        if (a10.D()) {
            a10.C();
        }
        a10.Z();
        this.f12520c = a10;
    }

    @Override
    public Object get() {
        t7.u uVar = new t7.u(21);
        oa.d dVar = new oa.d(21);
        ?? obj = new Object();
        obj.f6466a = (Context) ((zc.a) this.f12518a).get();
        obj.f6467b = (m5.d) ((zc.a) this.f12519b).get();
        obj.f6468c = (s5.d) ((zc.a) this.f12520c).get();
        obj.d = (q5.d) ((q5.d) this.d).get();
        obj.e = (Executor) ((zc.a) this.e).get();
        obj.f6469f = (t5.c) ((zc.a) this.f12521f).get();
        obj.f6470g = uVar;
        obj.h = dVar;
        obj.f6471i = (s5.c) ((zc.a) this.h).get();
        return obj;
    }

    public void h(x6.c cVar) {
        if (((android.support.v4.media.session.a0) this.f12519b) != null) {
            cVar.b();
            return;
        }
        if (((LinkedList) this.f12520c) == null) {
            this.f12520c = new LinkedList();
        }
        ((LinkedList) this.f12520c).add(cVar);
        this.f12521f = (s9.g) this.d;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.f12518a;
        if (((android.support.v4.media.session.a0) this.f12519b) == null) {
            try {
                synchronized (h8.a.class) {
                    h8.a.b(context);
                }
                i8.g Y0 = z7.a(context).Y0(new x6.b(context));
                if (Y0 != null) {
                    ((s9.g) this.f12521f).o(new android.support.v4.media.session.a0((fg.i) this.e, Y0));
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((android.support.v4.media.session.a0) this.f12519b).q((ia) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            } catch (k6.f unused) {
            }
        }
    }

    public p3() {
        this.f12518a = new float[16];
        this.f12519b = new float[16];
        this.f12520c = new float[16];
        this.d = new float[16];
        this.e = new float[16];
        this.f12521f = new float[4];
        this.h = new float[4];
    }

    public p3(bi.q0 q0Var, p6 p6Var) {
        this.f12518a = q0Var;
        this.f12519b = p6Var;
    }

    public p3(String str, ca.c cVar, xa.n nVar) {
        this.d = new ac.a(this, false);
        this.e = new ac.a(this, true);
        this.f12521f = new c5.x(21, (short) 0);
        this.h = new AtomicMarkableReference(null, false);
        this.f12520c = str;
        this.f12518a = new y9.f(cVar);
        this.f12519b = nVar;
    }

    public p3(Context context, p6 p6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f12518a = textPaint;
        Paint paint = new Paint();
        this.f12519b = paint;
        this.e = new Paint();
        this.f12521f = new SparseArray();
        this.h = new HashMap();
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        Drawable mutate = context.getDrawable(2131232546).mutate();
        this.f12520c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231185).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(t6.w0(t6.zi, p6Var));
    }
}
