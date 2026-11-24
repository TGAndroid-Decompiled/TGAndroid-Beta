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
public abstract class jdc {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final wcc d = new Object();
    public static final ycc e = new ycc();

    public static afc a(View view) {
        WeakHashMap weakHashMap = a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            a = weakHashMap;
        }
        afc afcVar = (afc) weakHashMap.get(view);
        if (afcVar == null) {
            afc afcVar2 = new afc(view);
            a.put(view, afcVar2);
            return afcVar2;
        }
        return afcVar;
    }

    public static vxc b(View view, vxc vxcVar) {
        WindowInsets a2;
        WindowInsets g = vxcVar.g();
        if (g != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                a2 = gdc.a(view, g);
            } else {
                a2 = zcc.a(view, g);
            }
            if (!a2.equals(g)) {
                return vxc.h(view, a2);
            }
        }
        return vxcVar;
    }

    public static boolean c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = idc.d;
            idc idcVar = (idc) view.getTag(2131296696);
            idc idcVar2 = idcVar;
            if (idcVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(2131296696, obj);
                idcVar2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = idcVar2.a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = idc.d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        if (idcVar2.a == null) {
                            idcVar2.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = idc.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                idcVar2.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    idcVar2.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
            }
            View a2 = idcVar2.a(view);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    SparseArray sparseArray = idcVar2.b;
                    if (sparseArray == null) {
                        sparseArray = new SparseArray();
                        idcVar2.b = sparseArray;
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
            ArrayList arrayList2 = idc.d;
            idc idcVar = (idc) view.getTag(2131296696);
            WeakReference weakReference = null;
            idc idcVar2 = idcVar;
            if (idcVar == null) {
                ?? obj = new Object();
                obj.a = null;
                obj.b = null;
                obj.c = null;
                view.setTag(2131296696, obj);
                idcVar2 = obj;
            }
            WeakReference weakReference2 = idcVar2.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                idcVar2.c = new WeakReference(keyEvent);
                SparseArray sparseArray = idcVar2.b;
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    idcVar2.b = sparseArray;
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
                    fyb.g();
                    return false;
                }
            }
        }
        return false;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return fdc.a(view);
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

    public static String[] f(hp hpVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return hdc.a(hpVar);
        }
        return (String[]) hpVar.getTag(2131296691);
    }

    public static void g(int i, View view) {
        Object tag;
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i2 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i2 >= 28) {
                tag = edc.a(view);
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
                        charSequence = edc.a(view);
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
                    charSequence = edc.a(view);
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

    public static vxc h(View view, vxc vxcVar) {
        WindowInsets g = vxcVar.g();
        if (g != null) {
            WindowInsets b2 = zcc.b(view, g);
            if (!b2.equals(g)) {
                return vxc.h(view, b2);
            }
        }
        return vxcVar;
    }

    public static hv2 i(View view, hv2 hv2Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + hv2Var + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return hdc.b(view, hv2Var);
        }
        zib zibVar = (zib) view.getTag(2131296690);
        fp7 fp7Var = d;
        if (zibVar != null) {
            hv2 a2 = zib.a(view, hv2Var);
            if (a2 == null) {
                return null;
            }
            if (view instanceof fp7) {
                fp7Var = (fp7) view;
            }
            return fp7Var.a(a2);
        }
        if (view instanceof fp7) {
            fp7Var = (fp7) view;
        }
        return fp7Var.a(hv2Var);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            fdc.b(view, context, iArr, attributeSet, typedArray, i, 0);
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
        new xcc(2131296687, CharSequence.class, 8, 28, (byte) 1).a(view, charSequence);
        ycc yccVar = e;
        if (charSequence != null) {
            WeakHashMap weakHashMap = yccVar.a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(yccVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(yccVar);
                return;
            }
            return;
        }
        yccVar.a.remove(view);
        view.removeOnAttachStateChangeListener(yccVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(yccVar);
    }
}
