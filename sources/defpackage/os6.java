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
public final class os6 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final boolean a;
    public final ws6 b;

    public os6(ws6 ws6Var, boolean z) {
        this.b = ws6Var;
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
        ws6 ws6Var = this.b;
        ws6Var.K.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (ws6Var.w0) {
            ws6Var.x0 = true;
            return;
        }
        eu6 eu6Var = ws6Var.r;
        int i3 = ws6Var.R.getLayoutParams().height;
        ws6.o(-1, ws6Var.R);
        ws6Var.u(ws6Var.h());
        View decorView = ws6Var.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(ws6Var.getWindow().getAttributes().width, 1073741824), 0);
        ws6.o(i3, ws6Var.R);
        if ((ws6Var.L.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) ws6Var.L.getDrawable()).getBitmap()) != null) {
            i = ws6Var.k(bitmap.getWidth(), bitmap.getHeight());
            ImageView imageView = ws6Var.L;
            if (bitmap.getWidth() >= bitmap.getHeight()) {
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
        } else {
            i = 0;
        }
        int l = ws6Var.l(ws6Var.h());
        int size = ws6Var.X.size();
        if (ws6Var.n()) {
            i2 = DesugarCollections.unmodifiableList(eu6Var.v).size() * ws6Var.f0;
        } else {
            i2 = 0;
        }
        if (size > 0) {
            i2 += ws6Var.h0;
        }
        int min = Math.min(i2, ws6Var.g0);
        if (!ws6Var.v0) {
            min = 0;
        }
        int max = Math.max(i, min) + l;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int height = rect.height() - (ws6Var.J.getMeasuredHeight() - ws6Var.K.getMeasuredHeight());
        if (i > 0 && max <= height) {
            ws6Var.L.setVisibility(0);
            ws6.o(i, ws6Var.L);
        } else {
            if (ws6Var.R.getMeasuredHeight() + ws6Var.V.getLayoutParams().height >= ws6Var.K.getMeasuredHeight()) {
                ws6Var.L.setVisibility(8);
            }
            max = min + l;
            i = 0;
        }
        if (ws6Var.h() && max <= height) {
            ws6Var.S.setVisibility(0);
        } else {
            ws6Var.S.setVisibility(8);
        }
        if (ws6Var.S.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        ws6Var.u(z);
        if (ws6Var.S.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int l2 = ws6Var.l(z2);
        int max2 = Math.max(i, min) + l2;
        if (max2 > height) {
            min -= max2 - height;
        } else {
            height = max2;
        }
        ws6Var.R.clearAnimation();
        ws6Var.V.clearAnimation();
        ws6Var.K.clearAnimation();
        LinearLayout linearLayout = ws6Var.R;
        boolean z3 = this.a;
        if (z3) {
            ws6Var.f(l2, linearLayout);
            ws6Var.f(min, ws6Var.V);
            ws6Var.f(height, ws6Var.K);
        } else {
            ws6.o(l2, linearLayout);
            ws6.o(min, ws6Var.V);
            ws6.o(height, ws6Var.K);
        }
        ws6.o(rect.height(), ws6Var.I);
        List unmodifiableList = DesugarCollections.unmodifiableList(eu6Var.v);
        boolean isEmpty = unmodifiableList.isEmpty();
        ArrayList arrayList = ws6Var.X;
        if (isEmpty) {
            arrayList.clear();
            ws6Var.W.notifyDataSetChanged();
        } else if (new HashSet(arrayList).equals(new HashSet(unmodifiableList))) {
            ws6Var.W.notifyDataSetChanged();
        } else {
            if (z3) {
                OverlayListView overlayListView = ws6Var.V;
                vs6 vs6Var = ws6Var.W;
                hashMap = new HashMap();
                int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                for (int i4 = 0; i4 < overlayListView.getChildCount(); i4++) {
                    Object item = vs6Var.getItem(firstVisiblePosition + i4);
                    View childAt = overlayListView.getChildAt(i4);
                    hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                }
            } else {
                hashMap = null;
            }
            if (z3) {
                Context context = ws6Var.s;
                OverlayListView overlayListView2 = ws6Var.V;
                vs6 vs6Var2 = ws6Var.W;
                hashMap2 = new HashMap();
                int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                for (int i5 = 0; i5 < overlayListView2.getChildCount(); i5++) {
                    Object item2 = vs6Var2.getItem(firstVisiblePosition2 + i5);
                    View childAt2 = overlayListView2.getChildAt(i5);
                    Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                    childAt2.draw(new Canvas(createBitmap));
                    hashMap2.put(item2, new BitmapDrawable(context.getResources(), createBitmap));
                }
            } else {
                hashMap2 = null;
            }
            ArrayList arrayList2 = ws6Var.X;
            HashSet hashSet = new HashSet(unmodifiableList);
            hashSet.removeAll(arrayList2);
            ws6Var.Y = hashSet;
            HashSet hashSet2 = new HashSet(ws6Var.X);
            hashSet2.removeAll(unmodifiableList);
            ws6Var.Z = hashSet2;
            ws6Var.X.addAll(0, ws6Var.Y);
            ws6Var.X.removeAll(ws6Var.Z);
            ws6Var.W.notifyDataSetChanged();
            if (z3 && ws6Var.v0) {
                if (ws6Var.Z.size() + ws6Var.Y.size() > 0) {
                    ws6Var.V.setEnabled(false);
                    ws6Var.V.requestLayout();
                    ws6Var.w0 = true;
                    ws6Var.V.getViewTreeObserver().addOnGlobalLayoutListener(new qs6(ws6Var, hashMap, hashMap2));
                    return;
                }
            }
            ws6Var.Y = null;
            ws6Var.Z = null;
        }
    }
}
