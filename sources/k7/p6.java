package k7;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class p6 {
    public static boolean f9965a = false;
    public static Method f9966b = null;
    public static boolean f9967c = false;
    public static Field d;

    public static boolean a(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = r0.j0.f43118a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = r0.i0.d;
            r0.i0 i0Var = (r0.i0) view.getTag(2131296694);
            WeakReference weakReference = null;
            r0.i0 i0Var2 = i0Var;
            if (i0Var == null) {
                ?? obj = new Object();
                obj.f43113a = null;
                obj.f43114b = null;
                obj.f43115c = null;
                view.setTag(2131296694, obj);
                i0Var2 = obj;
            }
            WeakReference weakReference2 = i0Var2.f43115c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                i0Var2.f43115c = new WeakReference(keyEvent);
                if (i0Var2.f43114b == null) {
                    i0Var2.f43114b = new SparseArray();
                }
                SparseArray sparseArray = i0Var2.f43114b;
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

    public static boolean b(r0.k r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: k7.p6.b(r0.k, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
