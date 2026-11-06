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
import bi.x5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicMarkableReference;
import org.telegram.messenger.ha;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class q3 {
    public Object f19225a;
    public Object f19226b;
    public Object f19227c;
    public Object d;
    public Object f19228e;
    public Object f19229f;
    public Object f19230g;

    public q3(Set set, a0.f fVar, String str, String str2, q8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f19225a = unmodifiableSet;
        a0.f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.f19227c = fVar2;
        this.d = str;
        this.f19228e = str2;
        this.f19229f = aVar == null ? q8.a.f53953a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f19226b = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static void a(FrameLayout frameLayout) {
        n6.d dVar = n6.d.f20495e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, n6.e.f20497a);
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
        if (((h6.m) this.f19226b) != null) {
            cVar.b();
            return;
        }
        if (((LinkedList) this.f19227c) == null) {
            this.f19227c = new LinkedList();
        }
        ((LinkedList) this.f19227c).add(cVar);
        cb.c cVar2 = (cb.c) this.d;
        this.f19229f = cVar2;
        ArrayList arrayList = (ArrayList) this.f19230g;
        Context context = (Context) this.f19225a;
        if (cVar2 != null && ((h6.m) this.f19226b) == null) {
            try {
                synchronized (k8.b.class) {
                    k8.b.a(context);
                }
                l8.f Y0 = c8.d1.a(context).Y0(new a7.b(context));
                if (Y0 != null) {
                    ((cb.c) this.f19229f).v(new h6.m((x5) this.f19228e, Y0));
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((h6.m) this.f19226b).t((ha) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (n6.f unused) {
            }
        }
    }

    public q3(String str, ga.d dVar, ba.e eVar) {
        this.d = new ab.q(this, false);
        this.f19228e = new ab.q(this, true);
        this.f19229f = new f5.u(3, (short) 0);
        this.f19230g = new AtomicMarkableReference(null, false);
        this.f19227c = str;
        this.f19225a = new ca.h(dVar);
        this.f19226b = eVar;
    }

    public q3(Context context, f6 f6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f19225a = textPaint;
        Paint paint = new Paint();
        this.f19226b = paint;
        this.f19228e = new Paint();
        this.f19229f = new SparseArray();
        this.f19230g = new HashMap();
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getDrawable(2131232549).mutate();
        this.f19227c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231185).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(k6.w0(k6.zi, f6Var));
    }
}
