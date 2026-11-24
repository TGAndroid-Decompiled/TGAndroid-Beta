package defpackage;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
public final class zmb implements gu2 {
    public final IdentityHashMap a = new IdentityHashMap();
    public boolean b;
    public boolean c;
    public HashSet d;
    public boolean e;

    public final void a() {
        this.a.clear();
        this.d = null;
        this.e = false;
    }

    @Override
    public final void accept(Object obj) {
        b((View) obj);
    }

    public final void b(View view) {
        m69 recycledViewPool;
        if (view != null && this.a.put(view, Boolean.TRUE) == null) {
            int i = 0;
            if (!this.c) {
                if (view instanceof vlb) {
                    try {
                        ((vlb) view).updateColors();
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                }
                try {
                    anb.a0(view);
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                Drawable background = view.getBackground();
                if (background instanceof vlb) {
                    try {
                        ((vlb) background).updateColors();
                    } catch (Exception e3) {
                        fc4.g(e3, true);
                    }
                    background.invalidateSelf();
                }
                Drawable foreground = view.getForeground();
                if (foreground instanceof vlb) {
                    try {
                        ((vlb) foreground).updateColors();
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                    }
                    foreground.invalidateSelf();
                }
                view.invalidate();
            } else {
                HashSet hashSet = this.d;
                if (view instanceof vlb) {
                    ((vlb) view).addColorKeys(hashSet);
                }
                vmb o = anb.o(view, false);
                if (o != null) {
                    for (int i2 = 0; i2 < 6; i2++) {
                        umb umbVar = o.a[i2];
                        if (umbVar != null) {
                            anb.f(umbVar, hashSet);
                        }
                    }
                    if (o.b != null) {
                        for (int i3 = 0; i3 < o.b.size(); i3++) {
                            anb.f((umb) o.b.get(i3), hashSet);
                        }
                    }
                    if (o.c != null) {
                        for (int i4 = 0; i4 < o.c.size(); i4++) {
                            anb.f((umb) o.c.get(i4), hashSet);
                        }
                    }
                    umb umbVar2 = o.e;
                    if (umbVar2 != null) {
                        anb.f(umbVar2, hashSet);
                    }
                    umb umbVar3 = o.f;
                    if (umbVar3 != null) {
                        anb.f(umbVar3, hashSet);
                    }
                }
            }
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                boolean z = this.b;
                for (int i5 = 0; i5 < recyclerView.getChildCount(); i5++) {
                    b(recyclerView.getChildAt(i5));
                }
                for (int i6 = 0; i6 < recyclerView.getHiddenChildCount(); i6++) {
                    b(recyclerView.W(i6));
                }
                for (int i7 = 0; i7 < recyclerView.getAttachedScrapChildCount(); i7++) {
                    b(recyclerView.O(i7));
                }
                for (int i8 = 0; i8 < recyclerView.getCachedChildCount(); i8++) {
                    b(recyclerView.P(i8));
                }
                if (z && (recycledViewPool = recyclerView.getRecycledViewPool()) != null) {
                    ArrayList arrayList = new ArrayList();
                    SparseArray sparseArray = recycledViewPool.a;
                    for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                        ArrayList arrayList2 = ((l69) sparseArray.valueAt(i9)).a;
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            arrayList.add(((u69) arrayList2.get(i10)).a);
                        }
                    }
                    while (i < arrayList.size()) {
                        b((View) arrayList.get(i));
                        i++;
                    }
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i < viewGroup.getChildCount()) {
                    b(viewGroup.getChildAt(i));
                    i++;
                }
            }
        }
    }
}
