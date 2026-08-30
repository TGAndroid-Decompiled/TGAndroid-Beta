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
import com.google.android.gms.common.api.internal.s1;
import java.util.WeakHashMap;
import m.w1;
import r0.c0;
import r0.j0;
public class f extends s implements DialogInterface {
    public final e f6266f;

    public f(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.f6266f = new e(getContext(), this, getWindow());
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
        boolean z4;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        ListAdapter listAdapter;
        int i11;
        int i12;
        View view;
        View findViewById;
        super.onCreate(bundle);
        e eVar = this.f6266f;
        eVar.f6245b.setContentView(eVar.f6261u);
        Context context = eVar.f6244a;
        Window window = eVar.f6246c;
        View findViewById2 = window.findViewById(2131296590);
        View findViewById3 = findViewById2.findViewById(2131296720);
        View findViewById4 = findViewById2.findViewById(2131296402);
        View findViewById5 = findViewById2.findViewById(2131296353);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131296406);
        View view2 = eVar.f6247f;
        if (view2 == null) {
            view2 = null;
        }
        int i13 = 0;
        if (view2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4 || !e.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131296405);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (eVar.f6248g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (eVar.e != null) {
                ((LinearLayout.LayoutParams) ((w1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131296720);
        View findViewById7 = viewGroup.findViewById(2131296402);
        View findViewById8 = viewGroup.findViewById(2131296353);
        ViewGroup c3 = e.c(findViewById6, findViewById3);
        ViewGroup c10 = e.c(findViewById7, findViewById4);
        ViewGroup c11 = e.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131296631);
        eVar.f6253m = nestedScrollView;
        nestedScrollView.setFocusable(false);
        eVar.f6253m.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c10.findViewById(16908299);
        eVar.f6257q = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f6253m.removeView(eVar.f6257q);
            if (eVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f6253m.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f6253m);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c10.setVisibility(8);
            }
        }
        Button button = (Button) c11.findViewById(16908313);
        eVar.h = button;
        androidx.mediarouter.app.y yVar = eVar.A;
        button.setOnClickListener(yVar);
        if (TextUtils.isEmpty(null)) {
            eVar.h.setVisibility(8);
            z10 = false;
        } else {
            eVar.h.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            z10 = true;
        }
        Button button2 = (Button) c11.findViewById(16908314);
        eVar.f6249i = button2;
        button2.setOnClickListener(yVar);
        if (TextUtils.isEmpty(eVar.f6250j)) {
            eVar.f6249i.setVisibility(8);
        } else {
            eVar.f6249i.setText(eVar.f6250j);
            eVar.f6249i.setVisibility(0);
            z10 |= true;
        }
        Button button3 = (Button) c11.findViewById(16908315);
        eVar.f6252l = button3;
        button3.setOnClickListener(yVar);
        if (TextUtils.isEmpty(null)) {
            eVar.f6252l.setVisibility(8);
        } else {
            eVar.f6252l.setText((CharSequence) null);
            eVar.f6252l.setVisibility(0);
            z10 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968613, typedValue, true);
        if (typedValue.data != 0) {
            if (z10) {
                Button button4 = eVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z10) {
                Button button5 = eVar.f6249i;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z10) {
                Button button6 = eVar.f6252l;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z10) {
            c11.setVisibility(8);
        }
        if (eVar.f6258r != null) {
            c3.addView(eVar.f6258r, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131296714).setVisibility(8);
        } else {
            eVar.f6255o = (ImageView) window.findViewById(16908294);
            if (!TextUtils.isEmpty(eVar.d) && eVar.f6264y) {
                TextView textView2 = (TextView) window.findViewById(2131296332);
                eVar.f6256p = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f6254n;
                if (drawable != null) {
                    eVar.f6255o.setImageDrawable(drawable);
                } else {
                    eVar.f6256p.setPadding(eVar.f6255o.getPaddingLeft(), eVar.f6255o.getPaddingTop(), eVar.f6255o.getPaddingRight(), eVar.f6255o.getPaddingBottom());
                    eVar.f6255o.setVisibility(8);
                }
            } else {
                window.findViewById(2131296714).setVisibility(8);
                eVar.f6255o.setVisibility(8);
                c3.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c3 != null && c3.getVisibility() != 8) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (c11.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && (findViewById = c10.findViewById(2131296704)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f6253m;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (eVar.e != null) {
                view = c3.findViewById(2131296713);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = c10.findViewById(2131296705);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z12 || i10 == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i10 != 0) {
                    i11 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i11 = alertController$RecycleListView.f359a;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z12) {
                    i12 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i12 = alertController$RecycleListView.f360b;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
            }
        }
        if (!z11) {
            View view3 = eVar.e;
            if (view3 == null) {
                view3 = eVar.f6253m;
            }
            if (view3 != null) {
                if (z12) {
                    i13 = 2;
                }
                int i14 = i10 | i13;
                View findViewById10 = window.findViewById(2131296630);
                View findViewById11 = window.findViewById(2131296629);
                int i15 = Build.VERSION.SDK_INT;
                if (i15 >= 23) {
                    WeakHashMap weakHashMap = j0.f43118a;
                    if (i15 >= 23) {
                        c0.b(view3, i14, 3);
                    }
                    if (findViewById10 != null) {
                        c10.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        c10.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i14 & 1) == 0) {
                        c10.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (i14 & 2) == 0) {
                        c10.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById10 != null || findViewById11 != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = eVar.e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new a(findViewById10, findViewById11));
                            eVar.e.post(new s1(eVar, findViewById10, findViewById11, 1));
                        } else {
                            if (findViewById10 != null) {
                                c10.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                c10.removeView(findViewById11);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = eVar.e;
        if (alertController$RecycleListView3 != null && (listAdapter = eVar.f6259s) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i16 = eVar.f6260t;
            if (i16 > -1) {
                alertController$RecycleListView3.setItemChecked(i16, true);
                alertController$RecycleListView3.setSelection(i16);
            }
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6266f.f6253m;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6266f.f6253m;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        e eVar = this.f6266f;
        eVar.d = charSequence;
        TextView textView = eVar.f6256p;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
