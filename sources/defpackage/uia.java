package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
public abstract class uia extends yha {
    public final HashSet k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public final ArrayList n3;
    public TextPaint o3;
    public StaticLayout p3;
    public float q3;
    public float r3;
    public ibc s3;
    public int t3;
    public final ArrayList u3;

    public uia(Context context) {
        super(context, null);
        this.k3 = new HashSet();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.u3 = new ArrayList();
    }

    public abstract boolean B1();

    public boolean C1() {
        return true;
    }

    public boolean D1() {
        return true;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r33) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uia.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        l69 movingAdapter = getMovingAdapter();
        if (D1() && getAdapter() == movingAdapter && B1() && (view instanceof jja)) {
            return true;
        }
        return super.drawChild(canvas, view, j);
    }

    public int getAnimateToColumnsCount() {
        return 3;
    }

    public float getChangeColumnsProgress() {
        return 0.0f;
    }

    public int getColumnsCount() {
        return 3;
    }

    public SparseArray<Float> getMessageAlphaEnter() {
        return null;
    }

    public l69 getMovingAdapter() {
        return null;
    }

    public int getPinchCenterPosition() {
        return 0;
    }

    public l69 getSupportingAdapter() {
        return null;
    }

    public yha getSupportingListView() {
        return null;
    }

    public void A1(jja jjaVar) {
    }

    public uia(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.k3 = new HashSet();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList();
        this.n3 = new ArrayList();
        this.u3 = new ArrayList();
    }
}
