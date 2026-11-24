package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
public final class z implements TextWatcher {
    public final ImageView a;
    public final int b;
    public final int c;
    public final LinearLayout d;
    public final ArrayList e;
    public final TextView f;
    public final ScrollView h;

    public z(ImageView imageView, int i, int i2, LinearLayout linearLayout, ArrayList arrayList, TextView textView, ScrollView scrollView) {
        this.a = imageView;
        this.b = i;
        this.c = i2;
        this.d = linearLayout;
        this.e = arrayList;
        this.f = textView;
        this.h = scrollView;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i;
        LinearLayout linearLayout;
        int i2;
        int i3;
        boolean z;
        int i4;
        String str;
        int i5;
        String lowerCase = editable.toString().trim().toLowerCase();
        boolean isEmpty = lowerCase.isEmpty();
        int i6 = 8;
        if (editable.length() > 0) {
            i = 0;
        } else {
            i = 8;
        }
        this.a.setVisibility(i);
        int i7 = this.b;
        while (true) {
            linearLayout = this.d;
            i2 = this.c;
            if (i7 >= i2) {
                break;
            }
            View childAt = linearLayout.getChildAt(i7);
            if (!isEmpty) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            childAt.setVisibility(i5);
            i7++;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i8 >= arrayList.size() || (i3 = i2 + i8) >= linearLayout.getChildCount()) {
                break;
            }
            u0c u0cVar = (u0c) arrayList.get(i8);
            String str2 = u0cVar.d;
            if (str2 == null) {
                str2 = (u0cVar.b + " " + u0cVar.c).toLowerCase();
            }
            if (!isEmpty && !str2.contains(lowerCase) && ((str = u0cVar.a) == null || !str.toLowerCase().startsWith(lowerCase))) {
                z = false;
            } else {
                z = true;
            }
            View childAt2 = linearLayout.getChildAt(i3);
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            childAt2.setVisibility(i4);
            if (z) {
                i9++;
            }
            i8++;
        }
        if (!isEmpty && i9 == 0) {
            i6 = 0;
        }
        this.f.setVisibility(i6);
        this.h.scrollTo(0, 0);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
