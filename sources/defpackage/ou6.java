package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.mediarouter.app.OverlayListView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
public final class ou6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final boolean a;
    public final wu6 b;

    public ou6(wu6 wu6Var, boolean z) {
        this.b = wu6Var;
        this.a = z;
    }

    @Override
    public final void onGlobalLayout() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        HashMap hashMap;
        HashMap hashMap2;
        Bitmap bitmap;
        ImageView.ScaleType scaleType;
        wu6 wu6Var = this.b;
        wu6Var.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (wu6Var.w0) {
            wu6Var.x0 = true;
            return;
        }
        ew6 ew6Var = wu6Var.r;
        int i3 = wu6Var.R.getLayoutParams().height;
        wu6.o(-1, wu6Var.R);
        wu6Var.u(wu6Var.h());
        View decorView = wu6Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(wu6Var.getWindow().getAttributes().width, 1073741824), 0);
        wu6.o(i3, wu6Var.R);
        if ((wu6Var.L.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) wu6Var.L.getDrawable()).getBitmap()) != null) {
            i = wu6Var.k(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = wu6Var.L;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        } else {
            i = 0;
        }
        int l = wu6Var.l(wu6Var.h());
        int size = wu6Var.X.size();
        if (wu6Var.n()) {
            i2 = DesugarCollections.unmodifiableList(ew6Var.v).size() * wu6Var.f0;
        } else {
            i2 = 0;
        }
        if (size > 0) {
            i2 += wu6Var.h0;
        }
        int min = Math.min(i2, wu6Var.g0);
        if (!wu6Var.v0) {
            min = 0;
        }
        int max = Math.max(i, min) + l;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (wu6Var.J.getMeasuredHeight() - wu6Var.K.getMeasuredHeight());
        if (i > 0 && max <= height) {
            wu6Var.L.setVisibility(0);
            wu6.o(i, wu6Var.L);
        } else {
            if (wu6Var.R.getMeasuredHeight() + wu6Var.V.getLayoutParams().height >= wu6Var.K.getMeasuredHeight()) {
                wu6Var.L.setVisibility(8);
            }
            max = min + l;
            i = 0;
        }
        if (wu6Var.h() && max <= height) {
            wu6Var.S.setVisibility(0);
        } else {
            wu6Var.S.setVisibility(8);
        }
        if (wu6Var.S.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        wu6Var.u(z);
        if (wu6Var.S.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int l2 = wu6Var.l(z2);
        int max2 = Math.max(i, min) + l2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        wu6Var.R.clearAnimation();
        wu6Var.V.clearAnimation();
        wu6Var.K.clearAnimation();
        LinearLayout linearLayout = wu6Var.R;
        boolean z3 = this.a;
        if (z3) {
            wu6Var.f(l2, linearLayout);
            wu6Var.f(min, wu6Var.V);
            wu6Var.f(height, wu6Var.K);
        } else {
            wu6.o(l2, linearLayout);
            wu6.o(min, wu6Var.V);
            wu6.o(height, wu6Var.K);
        }
        wu6.o(rect.height(), wu6Var.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(ew6Var.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = wu6Var.X;
        if (isEmpty) {
            arrayList.clear();
            wu6Var.W.notifyDataSetChanged();
        } else if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            wu6Var.W.notifyDataSetChanged();
        } else {
            if (z3) {
                OverlayListView overlayListView = wu6Var.V;
                vu6 vu6Var = wu6Var.W;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView.getChildCount(); i4++) {
                    Object item = vu6Var.getItem(firstVisiblePosition + i4);
                    View childAt = overlayListView.getChildAt(i4);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z3) {
                Context context = wu6Var.s;
                OverlayListView overlayListView2 = wu6Var.V;
                vu6 vu6Var2 = wu6Var.W;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i5 = 0; i5 < overlayListView2.getChildCount(); i5++) {
                    Object item2 = vu6Var2.getItem(firstVisiblePosition2 + i5);
                    View childAt2 = overlayListView2.getChildAt(i5);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList2 = wu6Var.X;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList2);
            wu6Var.Y = hashSet;
            HashSet hashSet2 = new HashSet(wu6Var.X);
            hashSet2.removeAll(unmodifiableList);
            wu6Var.Z = hashSet2;
            wu6Var.X.addAll(0, wu6Var.Y);
            wu6Var.X.removeAll(wu6Var.Z);
            wu6Var.W.notifyDataSetChanged();
            if (z3 && wu6Var.v0) {
                if (wu6Var.Z.size() + wu6Var.Y.size() > 0) {
                    wu6Var.V.setEnabled(false);
                    wu6Var.V.requestLayout();
                    wu6Var.w0 = true;
                    wu6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new qu6(wu6Var, hashMap, hashMap2));
                    return;
                }
            }
            wu6Var.Y = null;
            wu6Var.Z = null;
        }
    }
}
