package defpackage;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
public final class ykb implements vs2 {
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
        k49 recycledViewPool;
        if (view != null && this.a.put(view, Boolean.TRUE) == null) {
            int i = 0;
            if (!this.c) {
                if (view instanceof tjb) {
                    try {
                        ((tjb) view).updateColors();
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                }
                try {
                    zkb.a0(view);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                Drawable background = view.getBackground();
                if (background instanceof tjb) {
                    try {
                        ((tjb) background).updateColors();
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                    background.invalidateSelf();
                }
                Drawable foreground = view.getForeground();
                if (foreground instanceof tjb) {
                    try {
                        ((tjb) foreground).updateColors();
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                    }
                    foreground.invalidateSelf();
                }
                view.invalidate();
            } else {
                HashSet hashSet = this.d;
                if (view instanceof tjb) {
                    ((tjb) view).addColorKeys(hashSet);
                }
                ukb o = zkb.o(view, false);
                if (o != null) {
                    for (int i2 = 0; i2 < 6; i2++) {
                        tkb tkbVar = o.a[i2];
                        if (tkbVar != null) {
                            zkb.f(tkbVar, hashSet);
                        }
                    }
                    if (o.b != null) {
                        for (int i3 = 0; i3 < o.b.size(); i3++) {
                            zkb.f((tkb) o.b.get(i3), hashSet);
                        }
                    }
                    if (o.c != null) {
                        for (int i4 = 0; i4 < o.c.size(); i4++) {
                            zkb.f((tkb) o.c.get(i4), hashSet);
                        }
                    }
                    tkb tkbVar2 = o.e;
                    if (tkbVar2 != null) {
                        zkb.f(tkbVar2, hashSet);
                    }
                    tkb tkbVar3 = o.f;
                    if (tkbVar3 != null) {
                        zkb.f(tkbVar3, hashSet);
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
                        ArrayList arrayList2 = ((j49) sparseArray.valueAt(i9)).a;
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            arrayList.add(((s49) arrayList2.get(i10)).a);
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
