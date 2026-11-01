package nh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class l extends GestureDetector.SimpleOnGestureListener {
    public final View f13879a;
    public final ArrayList f13880b;
    public final m f13881c;
    public final n d;

    public l(n nVar, View view, ArrayList arrayList, m mVar) {
        this.d = nVar;
        this.f13879a = view;
        this.f13880b = arrayList;
        this.f13881c = mVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f13879a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        n nVar = this.d;
        int i10 = x10 - nVar.f13882a;
        int i11 = paddingTop - nVar.f13883b;
        ArrayList arrayList = this.f13880b;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (((i) obj).getBounds().contains(i10, i11)) {
                nVar.f13884c = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        n nVar = this.d;
        if (nVar.f13884c) {
            View view = this.f13879a;
            view.playSoundEffect(0);
            nVar.f13884c = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - nVar.f13882a;
            int i11 = paddingTop - nVar.f13883b;
            ArrayList arrayList = this.f13880b;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                i iVar = (i) obj;
                if (iVar.getBounds().contains(i10, i11)) {
                    this.f13881c.m(iVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
