package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public class v51 extends d {
    public t51 a;
    public o39 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public v51(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Y() {
        ArrayList arrayList;
        boolean z = this.isPaused;
        ArrayList arrayList2 = this.c;
        if (!z && this.a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new u51(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z2 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(new u51(2, (m51) obj));
            z2 = true;
        }
        if (z2) {
            arrayList2.add(new u51(3, null));
            arrayList2.add(new u51(4, null));
        }
        arrayList2.add(new u51(3, null));
        t51 t51Var = this.a;
        if (t51Var != null) {
            if (arrayList != null) {
                t51Var.E(arrayList, arrayList2);
            } else {
                t51Var.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 12));
        this.simpleActionBar.setTitle(k96.M0(2131747719, null));
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        gb3 gb3Var = new gb3();
        gb3Var.C = false;
        gb3Var.m = false;
        this.b.setItemAnimator(gb3Var);
        this.b.setLayoutManager(new t26());
        o39 o39Var2 = this.b;
        t51 t51Var = new t51(this);
        this.a = t51Var;
        o39Var2.setAdapter(t51Var);
        this.b.setOnItemClickListener(new sg0(this, (byte) 18));
        frameLayout.addView(this.b);
        Y();
        return this.fragmentView;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt("type");
        Y();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
