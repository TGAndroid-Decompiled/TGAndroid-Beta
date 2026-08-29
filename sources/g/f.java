package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.common.api.internal.q1;
import java.util.WeakHashMap;
import m.w1;
import r0.c0;
import r0.j0;
public class f extends s implements DialogInterface {
    public final e f6890f;

    public f(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.f6890f = new e(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968615, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        ListAdapter listAdapter;
        int i11;
        int i12;
        View view;
        View findViewById;
        super.onCreate(bundle);
        e eVar = this.f6890f;
        eVar.f6868b.setContentView(eVar.f6885u);
        Context context = eVar.f6867a;
        Window window = eVar.f6869c;
        View findViewById2 = window.findViewById(2131296590);
        View findViewById3 = findViewById2.findViewById(2131296720);
        View findViewById4 = findViewById2.findViewById(2131296402);
        View findViewById5 = findViewById2.findViewById(2131296353);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296406);
        View view2 = eVar.f6871f;
        if (view2 == null) {
            view2 = null;
        }
        int i13 = 0;
        if (view2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !e.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296405);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f6872g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.f6870e != null) {
                ((LinearLayout.LayoutParams) ((w1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131296720);
        View findViewById7 = viewGroup.findViewById(2131296402);
        View findViewById8 = viewGroup.findViewById(2131296353);
        ViewGroup c3 = e.c(findViewById6, findViewById3);
        ViewGroup c6 = e.c(findViewById7, findViewById4);
        ViewGroup c10 = e.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296631);
        eVar.f6877m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f6877m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c6.findViewById(16908299);
        eVar.f6881q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f6877m.removeView(eVar.f6881q);
            if (eVar.f6870e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f6877m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f6877m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f6870e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c6.setVisibility(8);
            }
        }
        Button button = (Button) c10.findViewById(16908313);
        eVar.h = button;
        androidx.mediarouter.app.v vVar = eVar.A;
        button.setOnClickListener(vVar);
        if (TextUtils.isEmpty(null)) {
            eVar.h.setVisibility(8);
            z11 = false;
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            z11 = true;
        }
        Button button2 = (Button) c10.findViewById(16908314);
        eVar.f6873i = button2;
        button2.setOnClickListener(vVar);
        if (TextUtils.isEmpty(eVar.f6874j)) {
            eVar.f6873i.setVisibility(8);
        } else {
            eVar.f6873i.setText(eVar.f6874j);
            eVar.f6873i.setVisibility(0);
            z11 |= true;
        }
        Button button3 = (Button) c10.findViewById(16908315);
        eVar.f6876l = button3;
        button3.setOnClickListener(vVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f6876l.setVisibility(8);
        } else {
            eVar.f6876l.setText((CharSequence) null);
            eVar.f6876l.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (z11) {
                Button button4 = eVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z11) {
                Button button5 = eVar.f6873i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z11) {
                Button button6 = eVar.f6876l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z11) {
            c10.setVisibility(8);
        }
        if (eVar.f6882r != null) {
            c3.addView(eVar.f6882r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296714).setVisibility(8);
        } else {
            eVar.f6879o = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(eVar.d) && eVar.f6888y) {
                TextView textView2 = (TextView) window.findViewById(2131296332);
                eVar.f6880p = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f6878n;
                if (drawable != null) {
                    eVar.f6879o.setImageDrawable(drawable);
                } else {
                    eVar.f6880p.setPadding(eVar.f6879o.getPaddingLeft(), eVar.f6879o.getPaddingTop(), eVar.f6879o.getPaddingRight(), eVar.f6879o.getPaddingBottom());
                    eVar.f6879o.setVisibility(8);
                }
            } else {
                window.findViewById(2131296714).setVisibility(8);
                eVar.f6879o.setVisibility(8);
                c3.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c3 != null && c3.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (c10.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && (findViewById = c6.findViewById(2131296704)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f6877m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (eVar.f6870e != null) {
                view = c3.findViewById(2131296713);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = c6.findViewById(2131296705);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f6870e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z13 || i10 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i11 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i11 = alertController$RecycleListView.f924a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z13) {
                    i12 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i12 = alertController$RecycleListView.f925b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
        if (!z12) {
            View view3 = eVar.f6870e;
            if (view3 == null) {
                view3 = eVar.f6877m;
            }
            if (view3 != null) {
                if (z13) {
                    i13 = 2;
                }
                int i14 = i10 | i13;
                View findViewById10 = window.findViewById(2131296630);
                View findViewById11 = window.findViewById(2131296629);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 23) {
                    WeakHashMap weakHashMap = j0.f46829a;
                    if (i15 >= 23) {
                        c0.b(view3, i14, 3);
                    }
                    if (findViewById10 != null) {
                        c6.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        c6.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i14 & 1) == 0) {
                        c6.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (i14 & 2) == 0) {
                        c6.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById10 != null || findViewById11 != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f6870e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new a(findViewById10, findViewById11));
                            eVar.f6870e.post(new q1(eVar, findViewById10, findViewById11, 1));
                        } else {
                            if (findViewById10 != null) {
                                c6.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                c6.removeView(findViewById11);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = eVar.f6870e;
        if (alertController$RecycleListView3 != null && (listAdapter = eVar.f6883s) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i16 = eVar.f6884t;
            if (i16 > -1) {
                alertController$RecycleListView3.setItemChecked(i16, true);
                alertController$RecycleListView3.setSelection(i16);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6890f.f6877m;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6890f.f6877m;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f6890f;
        eVar.d = charSequence;
        TextView textView = eVar.f6880p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
