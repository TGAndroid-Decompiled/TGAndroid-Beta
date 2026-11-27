package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public class d61 extends e {
    public b61 a;
    public d79 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public d61(Bundle bundle) {
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
        arrayList2.add(new c61(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z2 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(new c61(2, (u51) obj));
            z2 = true;
        }
        if (z2) {
            arrayList2.add(new c61(3, null));
            arrayList2.add(new c61(4, null));
        }
        arrayList2.add(new c61(3, null));
        b61 b61Var = this.a;
        if (b61Var != null) {
            if (arrayList != null) {
                b61Var.E(arrayList, arrayList2);
            } else {
                b61Var.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 13));
        this.simpleActionBar.setTitle(ob6.M0(2131747639, null));
        d79 d79Var = new d79(context, null);
        this.b = d79Var;
        d79Var.s1();
        this.b.setSectionsDrawBackground(true);
        zb3 zb3Var = new zb3();
        zb3Var.C = false;
        zb3Var.m = false;
        this.b.setItemAnimator(zb3Var);
        this.b.setLayoutManager(new x46());
        d79 d79Var2 = this.b;
        b61 b61Var = new b61(this);
        this.a = b61Var;
        d79Var2.setAdapter(b61Var);
        this.b.setOnItemClickListener(new tg0(this, (byte) 19));
        frameLayout.addView(this.b);
        Y();
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
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
