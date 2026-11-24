package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
public abstract class kfc {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final xec d = new Object();
    public static final zec e = new zec();

    public static ahc a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        ahc ahcVar = (ahc) weakHashMap.get(view);
        if (ahcVar == null) {
            ahc ahcVar2 = new ahc(view);
            a.put(view, ahcVar2);
            return ahcVar2;
        }
        return ahcVar;
    }

    public static wzc b(View view, wzc wzcVar) {
        WindowInsets a2;
        WindowInsets g = wzcVar.g();
        if (g != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                a2 = hfc.a(view, g);
            } else {
                a2 = afc.a(view, g);
            }
            if (!a2.equals(g)) {
                return wzc.h(view, a2);
            }
        }
        return wzcVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = jfc.d;
            jfc jfcVar = (jfc) view.getTag(2131296696);
            jfc jfcVar2 = jfcVar;
            if (jfcVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(2131296696, obj);
                jfcVar2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = jfcVar2.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = jfc.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        if (jfcVar2.a == null) {
                            jfcVar2.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = jfc.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                jfcVar2.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    jfcVar2.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
            }
            View a2 = jfcVar2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    SparseArray sparseArray = jfcVar2.b;
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                        jfcVar2.b = sparseArray;
                    }
                    sparseArray.put(keyCode, new WeakReference(a2));
                }
            }
            if (a2 != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = jfc.d;
            jfc jfcVar = (jfc) view.getTag(2131296696);
            WeakReference weakReference = null;
            jfc jfcVar2 = jfcVar;
            if (jfcVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(2131296696, obj);
                jfcVar2 = obj;
            }
            WeakReference weakReference2 = jfcVar2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                jfcVar2.c = new WeakReference(keyEvent);
                SparseArray sparseArray = jfcVar2.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    jfcVar2.b = sparseArray;
                }
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131296697)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    rjb.p();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return gfc.a(view);
        }
        if (!c) {
            if (b == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    b = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    c = true;
                    return null;
                }
            }
            try {
                Object obj = b.get(view);
                if (obj instanceof View.AccessibilityDelegate) {
                    return (View.AccessibilityDelegate) obj;
                }
                return null;
            } catch (Throwable unused2) {
                c = true;
                return null;
            }
        }
        return null;
    }

    public static String[] f(hq hqVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ifc.a(hqVar);
        }
        return (String[]) hqVar.getTag(2131296691);
    }

    public static void g(int i, View view) {
        Object tag;
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = ffc.a(view);
            } else {
                tag = view.getTag(2131296687);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            int i3 = 32;
            if (view.getAccessibilityLiveRegion() == 0 && !z) {
                if (i == 32) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(obtain);
                    obtain.setEventType(32);
                    obtain.setContentChangeTypes(i);
                    obtain.setSource(view);
                    view.onPopulateAccessibilityEvent(obtain);
                    List<CharSequence> text = obtain.getText();
                    if (i2 >= 28) {
                        charSequence = ffc.a(view);
                    } else {
                        Object tag2 = view.getTag(2131296687);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                    return;
                } else if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                } else {
                    return;
                }
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            if (!z) {
                i3 = 2048;
            }
            obtain2.setEventType(i3);
            obtain2.setContentChangeTypes(i);
            if (z) {
                List<CharSequence> text2 = obtain2.getText();
                if (i2 >= 28) {
                    charSequence = ffc.a(view);
                } else {
                    Object tag3 = view.getTag(2131296687);
                    if (CharSequence.class.isInstance(tag3)) {
                        charSequence = tag3;
                    }
                }
                text2.add(charSequence);
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
            }
            view.sendAccessibilityEventUnchecked(obtain2);
        }
    }

    public static wzc h(View view, wzc wzcVar) {
        WindowInsets g = wzcVar.g();
        if (g != null) {
            WindowInsets b2 = afc.b(view, g);
            if (!b2.equals(g)) {
                return wzc.h(view, b2);
            }
        }
        return wzcVar;
    }

    public static rw2 i(View view, rw2 rw2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + rw2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return ifc.b(view, rw2Var);
        }
        alb albVar = (alb) view.getTag(2131296690);
        ir7 ir7Var = d;
        if (albVar != null) {
            rw2 a2 = alb.a(view, rw2Var);
            if (a2 == null) {
                return null;
            }
            if (view instanceof ir7) {
                ir7Var = (ir7) view;
            }
            return ir7Var.a(a2);
        }
        if (view instanceof ir7) {
            ir7Var = (ir7) view;
        }
        return ir7Var.a(rw2Var);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            gfc.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void k(View view, q4 q4Var) {
        p4 p4Var;
        if (q4Var == null && (e(view) instanceof p4)) {
            q4Var = new q4();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (q4Var == null) {
            p4Var = null;
        } else {
            p4Var = q4Var.b;
        }
        view.setAccessibilityDelegate(p4Var);
    }

    public static void l(View view, CharSequence charSequence) {
        boolean z;
        new yec(2131296687, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        zec zecVar = e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = zecVar.a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(zecVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(zecVar);
                return;
            }
            return;
        }
        zecVar.a.remove(view);
        view.removeOnAttachStateChangeListener(zecVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(zecVar);
    }
}
