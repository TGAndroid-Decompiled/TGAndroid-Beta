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
import java.util.WeakHashMap;
import m.v1;
import r0.i0;
public class g extends u implements DialogInterface {
    public final f f10199f;

    public g(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.f10199f = new f(getContext(), this, getWindow());
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
        View view;
        int i11;
        int i12;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        f fVar = this.f10199f;
        fVar.f10177b.setContentView(fVar.f10194u);
        Context context = fVar.f10176a;
        Window window = fVar.f10178c;
        View findViewById2 = window.findViewById(2131296590);
        View findViewById3 = findViewById2.findViewById(2131296720);
        View findViewById4 = findViewById2.findViewById(2131296402);
        View findViewById5 = findViewById2.findViewById(2131296353);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296406);
        View view3 = fVar.f10180f;
        if (view3 == null) {
            view3 = null;
        }
        int i13 = 0;
        if (view3 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !f.a(view3)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296405);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.f10181g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.f10179e != null) {
                ((LinearLayout.LayoutParams) ((v1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131296720);
        View findViewById7 = viewGroup.findViewById(2131296402);
        View findViewById8 = viewGroup.findViewById(2131296353);
        ViewGroup c10 = f.c(findViewById6, findViewById3);
        ViewGroup c11 = f.c(findViewById7, findViewById4);
        ViewGroup c12 = f.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296631);
        fVar.f10186m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f10186m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c11.findViewById(16908299);
        fVar.f10190q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.f10186m.removeView(fVar.f10190q);
            if (fVar.f10179e != null) {
                ViewGroup viewGroup2 = (ViewGroup) fVar.f10186m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(fVar.f10186m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(fVar.f10179e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c11.setVisibility(8);
            }
        }
        Button button = (Button) c12.findViewById(16908313);
        fVar.h = button;
        androidx.mediarouter.app.x xVar = fVar.A;
        button.setOnClickListener(xVar);
        if (TextUtils.isEmpty(null)) {
            fVar.h.setVisibility(8);
            z11 = false;
        } else {
            fVar.h.setText((CharSequence) null);
            fVar.h.setVisibility(0);
            z11 = true;
        }
        Button button2 = (Button) c12.findViewById(16908314);
        fVar.f10182i = button2;
        button2.setOnClickListener(xVar);
        if (TextUtils.isEmpty(fVar.f10183j)) {
            fVar.f10182i.setVisibility(8);
        } else {
            fVar.f10182i.setText(fVar.f10183j);
            fVar.f10182i.setVisibility(0);
            z11 |= true;
        }
        Button button3 = (Button) c12.findViewById(16908315);
        fVar.f10185l = button3;
        button3.setOnClickListener(xVar);
        if (TextUtils.isEmpty(null)) {
            fVar.f10185l.setVisibility(8);
        } else {
            fVar.f10185l.setText((CharSequence) null);
            fVar.f10185l.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (z11) {
                Button button4 = fVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z11) {
                Button button5 = fVar.f10182i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z11) {
                Button button6 = fVar.f10185l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z11) {
            c12.setVisibility(8);
        }
        if (fVar.f10191r != null) {
            c10.addView(fVar.f10191r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296714).setVisibility(8);
        } else {
            fVar.f10188o = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(fVar.d) && fVar.f10197y) {
                TextView textView2 = (TextView) window.findViewById(2131296332);
                fVar.f10189p = textView2;
                textView2.setText(fVar.d);
                Drawable drawable = fVar.f10187n;
                if (drawable != null) {
                    fVar.f10188o.setImageDrawable(drawable);
                } else {
                    fVar.f10189p.setPadding(fVar.f10188o.getPaddingLeft(), fVar.f10188o.getPaddingTop(), fVar.f10188o.getPaddingRight(), fVar.f10188o.getPaddingBottom());
                    fVar.f10188o.setVisibility(8);
                }
            } else {
                window.findViewById(2131296714).setVisibility(8);
                fVar.f10188o.setVisibility(8);
                c10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c10 != null && c10.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (c12.getVisibility() != 8) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13 && (findViewById = c11.findViewById(2131296704)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = fVar.f10186m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (fVar.f10179e != null) {
                view2 = c10.findViewById(2131296713);
            } else {
                view2 = null;
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = c11.findViewById(2131296705);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.f10179e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z13 || i10 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i11 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i11 = alertController$RecycleListView.f926a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z13) {
                    i12 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i12 = alertController$RecycleListView.f927b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
        if (!z12) {
            View view4 = fVar.f10179e;
            if (view4 == null) {
                view4 = fVar.f10186m;
            }
            if (view4 != null) {
                if (z13) {
                    i13 = 2;
                }
                int i14 = i10 | i13;
                View findViewById10 = window.findViewById(2131296630);
                View findViewById11 = window.findViewById(2131296629);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 23) {
                    WeakHashMap weakHashMap = i0.f44697a;
                    if (i15 >= 23) {
                        r0.b0.b(view4, i14, 3);
                    }
                    if (findViewById10 != null) {
                        c11.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        c11.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i14 & 1) == 0) {
                        c11.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (i14 & 2) == 0) {
                        c11.removeView(findViewById11);
                        view = null;
                    } else {
                        view = findViewById11;
                    }
                    if (findViewById10 != null || view != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = fVar.f10179e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new a(findViewById10, view));
                            fVar.f10179e.post(new c5.v(fVar, findViewById10, view, false, 6));
                        } else {
                            View view5 = findViewById10;
                            if (view5 != null) {
                                c11.removeView(view5);
                            }
                            if (view != null) {
                                c11.removeView(view);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = fVar.f10179e;
        if (alertController$RecycleListView3 != null && (listAdapter = fVar.f10192s) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i16 = fVar.f10193t;
            if (i16 > -1) {
                alertController$RecycleListView3.setItemChecked(i16, true);
                alertController$RecycleListView3.setSelection(i16);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f10199f.f10186m;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f10199f.f10186m;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        f fVar = this.f10199f;
        fVar.d = charSequence;
        TextView textView = fVar.f10189p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
