package m;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextPaint;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.fa;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class o3 {
    public Object f20161a;
    public Object f20162b;
    public Object f20163c;
    public Object d;
    public Object f20164e;
    public Object f20165f;
    public Object f20166g;

    public o3(Set set, a0.f fVar, String str, String str2, q8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f20161a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f20163c = fVar2;
        this.d = str;
        this.f20164e = str2;
        this.f20165f = aVar == null ? q8.a.f56068a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f20162b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static void a(FrameLayout frameLayout) {
        n6.d dVar = n6.d.f21431e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, n6.e.f21433a);
        String b10 = q6.s.b(context, d);
        String c10 = q6.s.c(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b10);
        linearLayout.addView(textView);
        Intent b11 = dVar.b(d, context, null);
        if (b11 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new a7.d(context, b11));
        }
    }

    public void b(a7.c cVar) {
        if (((h6.m) this.f20162b) != null) {
            cVar.b();
            return;
        }
        if (((LinkedList) this.f20163c) == null) {
            this.f20163c = new LinkedList();
        }
        ((LinkedList) this.f20163c).add(cVar);
        cb.c cVar2 = (cb.c) this.d;
        this.f20165f = cVar2;
        ArrayList arrayList = (ArrayList) this.f20166g;
        Context context = (Context) this.f20161a;
        if (cVar2 != null && ((h6.m) this.f20162b) == null) {
            try {
                synchronized (k8.b.class) {
                    k8.b.a(context);
                }
                l8.f y12 = c8.j1.a(context).y1(new a7.b(context));
                if (y12 != null) {
                    ((cb.c) this.f20165f).p(new h6.m((ai.k0) this.f20164e, y12));
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((h6.m) this.f20162b).y((fa) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (n6.f unused) {
            }
        }
    }

    public o3(String str, ga.d dVar, ba.e eVar) {
        this.d = new ab.q(this, false);
        this.f20164e = new ab.q(this, true);
        ?? obj = new Object();
        obj.f5144a = new ArrayList();
        obj.f5145b = 128;
        this.f20165f = obj;
        this.f20166g = new AtomicMarkableReference(null, false);
        this.f20163c = str;
        this.f20161a = new ca.h(dVar);
        this.f20162b = eVar;
    }

    public o3(Context context, i6 i6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f20161a = textPaint;
        Paint paint = new Paint();
        this.f20162b = paint;
        this.f20164e = new Paint();
        this.f20165f = new SparseArray();
        this.f20166g = new HashMap();
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getDrawable(2131232551).mutate();
        this.f20163c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231185).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(n6.w0(n6.Ci, i6Var));
    }
}
