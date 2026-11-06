package c8;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class ub {
    public static boolean f5878a = false;
    public static Method f5879b = null;
    public static boolean f5880c = false;
    public static Field d;

    public static boolean a(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = r0.i0.f54097a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = r0.h0.d;
            r0.h0 h0Var = (r0.h0) view.getTag(2131296694);
            WeakReference weakReference = null;
            r0.h0 h0Var2 = h0Var;
            if (h0Var == null) {
                ?? obj = new Object();
                obj.f54092a = null;
                obj.f54093b = null;
                obj.f54094c = null;
                view.setTag(2131296694, obj);
                h0Var2 = obj;
            }
            WeakReference weakReference2 = h0Var2.f54094c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                h0Var2.f54094c = new WeakReference(keyEvent);
                if (h0Var2.f54093b == null) {
                    h0Var2.f54093b = new SparseArray();
                }
                SparseArray sparseArray = h0Var2.f54093b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131296695)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    throw new ClassCastException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean b(r0.i r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: c8.ub.b(r0.i, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
