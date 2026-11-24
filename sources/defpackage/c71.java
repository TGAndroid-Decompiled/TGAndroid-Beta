package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public class c71 extends d {
    public a71 a;
    public r59 b;
    public final ArrayList c;
    public ArrayList d;
    public int e;

    public c71(Bundle bundle) {
        super(bundle);
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
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
        arrayList2.add(new b71(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z2 = false;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            arrayList2.add(new b71(2, (t61) obj));
            z2 = true;
        }
        if (z2) {
            arrayList2.add(new b71(3, null));
            arrayList2.add(new b71(4, null));
        }
        arrayList2.add(new b71(3, null));
        a71 a71Var = this.a;
        if (a71Var != null) {
            if (arrayList != null) {
                a71Var.E(arrayList, arrayList2);
            } else {
                a71Var.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 13));
        this.simpleActionBar.setTitle(jb6.M0(2131747645, null));
        r59 r59Var = new r59(context, null);
        this.b = r59Var;
        r59Var.r1();
        this.b.setSectionsDrawBackground(true);
        sc3 sc3Var = new sc3();
        sc3Var.C = false;
        sc3Var.m = false;
        this.b.setItemAnimator(sc3Var);
        this.b.setLayoutManager(new u46());
        r59 r59Var2 = this.b;
        a71 a71Var = new a71(this);
        this.a = a71Var;
        r59Var2.setAdapter(a71Var);
        this.b.setOnItemClickListener(new xg0(this, (byte) 21));
        frameLayout.addView(this.b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
