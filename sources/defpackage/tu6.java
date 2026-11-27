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
public final class tu6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final boolean a;
    public final bv6 b;

    public tu6(bv6 bv6Var, boolean z) {
        this.b = bv6Var;
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
        bv6 bv6Var = this.b;
        bv6Var.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (bv6Var.w0) {
            bv6Var.x0 = true;
            return;
        }
        jw6 jw6Var = bv6Var.r;
        int i3 = bv6Var.R.getLayoutParams().height;
        bv6.o(-1, bv6Var.R);
        bv6Var.u(bv6Var.h());
        View decorView = bv6Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(bv6Var.getWindow().getAttributes().width, 1073741824), 0);
        bv6.o(i3, bv6Var.R);
        if ((bv6Var.L.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) bv6Var.L.getDrawable()).getBitmap()) != null) {
            i = bv6Var.k(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = bv6Var.L;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        } else {
            i = 0;
        }
        int l = bv6Var.l(bv6Var.h());
        int size = bv6Var.X.size();
        if (bv6Var.n()) {
            i2 = DesugarCollections.unmodifiableList(jw6Var.v).size() * bv6Var.f0;
        } else {
            i2 = 0;
        }
        if (size > 0) {
            i2 += bv6Var.h0;
        }
        int min = Math.min(i2, bv6Var.g0);
        if (!bv6Var.v0) {
            min = 0;
        }
        int max = Math.max(i, min) + l;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (bv6Var.J.getMeasuredHeight() - bv6Var.K.getMeasuredHeight());
        if (i > 0 && max <= height) {
            bv6Var.L.setVisibility(0);
            bv6.o(i, bv6Var.L);
        } else {
            if (bv6Var.R.getMeasuredHeight() + bv6Var.V.getLayoutParams().height >= bv6Var.K.getMeasuredHeight()) {
                bv6Var.L.setVisibility(8);
            }
            max = min + l;
            i = 0;
        }
        if (bv6Var.h() && max <= height) {
            bv6Var.S.setVisibility(0);
        } else {
            bv6Var.S.setVisibility(8);
        }
        if (bv6Var.S.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        bv6Var.u(z);
        if (bv6Var.S.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int l2 = bv6Var.l(z2);
        int max2 = Math.max(i, min) + l2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        bv6Var.R.clearAnimation();
        bv6Var.V.clearAnimation();
        bv6Var.K.clearAnimation();
        LinearLayout linearLayout = bv6Var.R;
        boolean z3 = this.a;
        if (z3) {
            bv6Var.f(l2, linearLayout);
            bv6Var.f(min, bv6Var.V);
            bv6Var.f(height, bv6Var.K);
        } else {
            bv6.o(l2, linearLayout);
            bv6.o(min, bv6Var.V);
            bv6.o(height, bv6Var.K);
        }
        bv6.o(rect.height(), bv6Var.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(jw6Var.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = bv6Var.X;
        if (isEmpty) {
            arrayList.clear();
            bv6Var.W.notifyDataSetChanged();
        } else if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            bv6Var.W.notifyDataSetChanged();
        } else {
            if (z3) {
                OverlayListView overlayListView = bv6Var.V;
                av6 av6Var = bv6Var.W;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView.getChildCount(); i4++) {
                    Object item = av6Var.getItem(firstVisiblePosition + i4);
                    View childAt = overlayListView.getChildAt(i4);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z3) {
                Context context = bv6Var.s;
                OverlayListView overlayListView2 = bv6Var.V;
                av6 av6Var2 = bv6Var.W;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i5 = 0; i5 < overlayListView2.getChildCount(); i5++) {
                    Object item2 = av6Var2.getItem(firstVisiblePosition2 + i5);
                    View childAt2 = overlayListView2.getChildAt(i5);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList2 = bv6Var.X;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList2);
            bv6Var.Y = hashSet;
            HashSet hashSet2 = new HashSet(bv6Var.X);
            hashSet2.removeAll(unmodifiableList);
            bv6Var.Z = hashSet2;
            bv6Var.X.addAll(0, bv6Var.Y);
            bv6Var.X.removeAll(bv6Var.Z);
            bv6Var.W.notifyDataSetChanged();
            if (z3 && bv6Var.v0) {
                if (bv6Var.Z.size() + bv6Var.Y.size() > 0) {
                    bv6Var.V.setEnabled(false);
                    bv6Var.V.requestLayout();
                    bv6Var.w0 = true;
                    bv6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new vu6(bv6Var, hashMap, hashMap2));
                    return;
                }
            }
            bv6Var.Y = null;
            bv6Var.Z = null;
        }
    }
}
