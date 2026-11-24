package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;
public final class hs6 extends ArrayAdapter implements AdapterView.OnItemClickListener {
    public final LayoutInflater a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final Drawable e;

    public hs6(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.a = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{2130968868, 2130968877, 2130968874, 2130968873});
        this.b = hmd.a(context, obtainStyledAttributes.getResourceId(0, 0));
        this.c = hmd.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.d = hmd.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.e = hmd.a(context, obtainStyledAttributes.getResourceId(3, 0));
        obtainStyledAttributes.recycle();
    }

    @Override
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override
    public final android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs6.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override
    public final boolean isEnabled(int i) {
        return ((eu6) getItem(i)).g;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        eu6 eu6Var = (eu6) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(2131296543);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131296545);
        if (imageView != null && progressBar != null) {
            imageView.setVisibility(8);
            progressBar.setVisibility(0);
        }
        eu6Var.l();
    }
}
