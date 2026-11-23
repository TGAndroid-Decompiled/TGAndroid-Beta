package ga;

import a0.f;
import ai.h0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseArray;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.k1;
import gb.e0;
import gb.e1;
import gb.i1;
import gb.r0;
import gb.v0;
import h6.m;
import id.h;
import j$.util.DesugarCollections;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import jb.l;
import m1.g;
import n6.e;
import org.telegram.messenger.fa;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import q6.s;
public final class d implements ib.b {
    public Object f13270a;
    public Object f13271b;
    public Object f13272c;
    public Object d;
    public Object f13273e;
    public Object f13274f;
    public Object h;

    public d(Set set, f fVar, String str, String str2, q8.a aVar) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(set);
        this.f13271b = unmodifiableSet;
        f fVar2 = fVar == null ? Collections.EMPTY_MAP : fVar;
        this.d = fVar2;
        this.f13270a = str;
        this.f13273e = str2;
        this.f13274f = aVar == null ? q8.a.f56191a : aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = fVar2.values().iterator();
        if (!it.hasNext()) {
            this.f13272c = DesugarCollections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static synchronized void c(File file) {
        synchronized (d.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static List e(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public static void f(FrameLayout frameLayout) {
        n6.d dVar = n6.d.f21524e;
        Context context = frameLayout.getContext();
        int d = dVar.d(context, e.f21526a);
        String b10 = s.b(context, d);
        String c10 = s.c(context, d);
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

    public void a(String str) {
        File file = new File((File) this.f13271b, str);
        if (file.exists() && d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File b(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void g(a7.c cVar) {
        if (((m) this.f13270a) != null) {
            cVar.b();
            return;
        }
        if (((LinkedList) this.f13271b) == null) {
            this.f13271b = new LinkedList();
        }
        ((LinkedList) this.f13271b).add(cVar);
        cb.c cVar2 = (cb.c) this.f13272c;
        this.f13274f = cVar2;
        ArrayList arrayList = (ArrayList) this.h;
        Context context = (Context) this.f13273e;
        if (cVar2 != null && ((m) this.f13270a) == null) {
            try {
                synchronized (k8.a.class) {
                    k8.a.a(context);
                }
                l8.f y12 = k1.a(context).y1(new a7.b(context));
                if (y12 != null) {
                    ((cb.c) this.f13274f).q(new m((h0) this.d, y12));
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((m) this.f13270a).C((fa) obj);
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e10) {
                throw new RuntimeException(e10);
            } catch (n6.f unused) {
            }
        }
    }

    @Override
    public Object mo23get() {
        return new e1((l) ((ib.c) this.f13270a).mo23get(), (v0) ((ib.c) this.f13271b).mo23get(), (r0) ((ib.c) this.f13272c).mo23get(), (i1) ((ib.c) this.d).mo23get(), (g) ((ib.c) this.f13273e).mo23get(), (e0) ((ib.c) this.f13274f).mo23get(), (h) ((ib.c) this.h).mo23get());
    }

    public d(Context context, i6 i6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f13270a = textPaint;
        Paint paint = new Paint();
        this.f13271b = paint;
        this.f13273e = new Paint();
        this.f13274f = new SparseArray();
        this.h = new HashMap();
        textPaint.setTextSize(g0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setTypeface(g0.o());
        Drawable mutate = context.getDrawable(2131232554).mutate();
        this.f13272c = mutate;
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        Drawable mutate2 = context.getDrawable(2131231187).mutate();
        this.d = mutate2;
        mutate2.setBounds(0, 0, (int) (mutate2.getIntrinsicWidth() * 0.7f), (int) (mutate2.getIntrinsicHeight() * 0.7f));
        paint.setColor(n6.w0(n6.Ci, i6Var));
    }
}
