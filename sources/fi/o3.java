package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zq;
public abstract class o3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f11335j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final d3 F;
    public final org.telegram.ui.ActionBar.w0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.h6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int f11336a;
    public Utilities.Callback3 f11337a0;
    public final org.telegram.ui.ActionBar.u6 f11338b;
    public final ArrayList f11339b0;
    public final Paint f11340c;
    public boolean f11341c0;
    public final x2 d;
    public boolean f11342d0;
    public final y2 e;
    public MediaController.AlbumEntry f11343e0;
    public final h3 f11344f;
    public ArrayList f11345f0;
    public ArrayList f11346g0;
    public final FrameLayout h;
    public final ArrayList f11347h0;
    public di.i4 f11348i0;
    public final mm0 f11349n;
    public final e3 f11350r;
    public final ey0 f11351s;
    public final z3 v;
    public boolean f11352w;
    public final org.telegram.ui.ActionBar.k f11353x;
    public final TextView f11354y;

    public o3(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f11340c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.h6(this, 0L, 350L, ds.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f11339b0 = arrayList;
        this.f11347h0 = new ArrayList();
        this.O = f7;
        this.f11336a = i10;
        this.f11338b = u6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        x2 x2Var = new x2(this, context, u6Var);
        this.d = x2Var;
        x2Var.setItemSelectorColorProvider(new c2.i(19));
        h3 h3Var = new h3(this);
        this.f11344f = h3Var;
        x2Var.setAdapter(h3Var);
        y2 y2Var = new y2(this);
        this.e = y2Var;
        x2Var.setLayoutManager(y2Var);
        x2Var.setFastScrollEnabled(1);
        x2Var.setFastScrollVisible(true);
        x2Var.getFastScroll().setAlpha(0.0f);
        y2Var.O = new z2(this);
        x2Var.i(new Object());
        x2Var.setClipToPadding(false);
        addView(x2Var, gb1.i(-1, -1, 119));
        x2Var.setOnItemClickListener(new zl0(this) {
            public final o3 f11542b;

            {
                this.f11542b = this;
            }

            @Override
            public final void c(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        o3 o3Var = this.f11542b;
                        ArrayList arrayList2 = o3Var.f11339b0;
                        ArrayList arrayList3 = o3Var.f11347h0;
                        if (i11 >= 2 && o3Var.W != null && (view instanceof k3)) {
                            k3 k3Var = (k3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (o3Var.f11341c0) {
                                if (i12 == 0) {
                                    o3Var.e(o3.f11335j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (o3Var.f11342d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    w7 w7Var = (w7) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = o3Var.W;
                                    if (w7Var.K) {
                                        bitmap = o3.d(k3Var);
                                    }
                                    callback22.run(w7Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < o3Var.f11345f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) o3Var.f11345f0.get(i12);
                                if (arrayList3.isEmpty() && !o3Var.Q) {
                                    Utilities.Callback2 callback23 = o3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = o3.d(k3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > o3Var.R) {
                                    int i13 = -o3Var.N;
                                    o3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(k3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(o3Var.d);
                                o3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f11542b;
                        e3 e3Var = o3Var2.f11350r;
                        org.telegram.ui.ActionBar.w0 w0Var = o3Var2.G;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < e3Var.f11293c.size() && (callback2 = o3Var2.W) != null) {
                            callback2.run(e3Var.f11293c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        x2Var.setOnItemLongClickListener(new e1.c(this, 7));
        x2Var.setOnScrollListener(new b3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, u6Var);
        this.f11353x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.x(436207615, false);
        kVar.y(-1, false);
        kVar.y(-1, true);
        addView(kVar, gb1.i(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new c3(this));
        org.telegram.ui.ActionBar.z l4 = kVar.l();
        d3 d3Var = new d3(this, context, l4, u6Var);
        this.F = d3Var;
        d3Var.setSubMenuOpenSide(1);
        if (AndroidUtilities.isTablet()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        kVar.addView(d3Var, 0, gb1.h(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        d3Var.setOnClickListener(new View.OnClickListener(this) {
            public final o3 f11580b;

            {
                this.f11580b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11580b.F.U(null, null);
                        return;
                    case 1:
                        o3 o3Var = this.f11580b;
                        if (o3Var.I.getAlpha() >= 0.25f) {
                            o3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        o3 o3Var2 = this.f11580b;
                        if (o3Var2.I.getAlpha() >= 0.25f) {
                            o3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f11580b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f11354y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        float f11 = 10.0f;
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        d3Var.addView(textView, gb1.h(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, gb1.i(-1, -1, 119));
        mm0 mm0Var = new mm0(context, u6Var);
        this.f11349n = mm0Var;
        mm0Var.setLayoutManager(new s4.t(3));
        e3 e3Var = new e3(this);
        this.f11350r = e3Var;
        mm0Var.setAdapter(e3Var);
        mm0Var.setOnScrollListener(new f3(this));
        mm0Var.setClipToPadding(true);
        mm0Var.i(new Object());
        frameLayout.addView(mm0Var, gb1.i(-1, -1, 119));
        c10 c10Var = new c10(context, u6Var);
        c10Var.setViewType(2);
        c10Var.setAlpha(0.0f);
        c10Var.setVisibility(8);
        frameLayout.addView(c10Var, gb1.i(-1, -1, 119));
        ey0 ey0Var = new ey0(context, c10Var, 11, u6Var);
        this.f11351s = ey0Var;
        xh.n nVar = ey0Var.d;
        nVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.V(nVar, org.telegram.ui.ActionBar.y6.f23746y6, u6Var);
        nVar.setTypeface(null);
        nVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new z3(this, false, new ai.i(this, 19));
        frameLayout.addView(ey0Var, gb1.i(-1, -1, 119));
        mm0Var.setEmptyView(ey0Var);
        org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new w2(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        mm0Var.setOnItemClickListener(new zl0(this) {
            public final o3 f11542b;

            {
                this.f11542b = this;
            }

            @Override
            public final void c(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        o3 o3Var = this.f11542b;
                        ArrayList arrayList2 = o3Var.f11339b0;
                        ArrayList arrayList3 = o3Var.f11347h0;
                        if (i11 >= 2 && o3Var.W != null && (view instanceof k3)) {
                            k3 k3Var = (k3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (o3Var.f11341c0) {
                                if (i12 == 0) {
                                    o3Var.e(o3.f11335j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (o3Var.f11342d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    w7 w7Var = (w7) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = o3Var.W;
                                    if (w7Var.K) {
                                        bitmap = o3.d(k3Var);
                                    }
                                    callback22.run(w7Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < o3Var.f11345f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) o3Var.f11345f0.get(i12);
                                if (arrayList3.isEmpty() && !o3Var.Q) {
                                    Utilities.Callback2 callback23 = o3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = o3.d(k3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > o3Var.R) {
                                    int i13 = -o3Var.N;
                                    o3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(k3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(o3Var.d);
                                o3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        o3 o3Var2 = this.f11542b;
                        e3 e3Var2 = o3Var2.f11350r;
                        org.telegram.ui.ActionBar.w0 w0Var = o3Var2.G;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < e3Var2.f11293c.size() && (callback2 = o3Var2.W) != null) {
                            callback2.run(e3Var2.f11293c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f8648w.f10498b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                w7 w7Var = (w7) obj;
                if (!w7Var.f11903g && !w7Var.f11932w) {
                    this.f11339b0.add(w7Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23425h5, linearLayout, u6Var);
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : f11) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, gb1.h(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d f12 = vh.f(24, context, u6Var, true);
            this.J = f12;
            f12.i(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(f12, gb1.o(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                f12.setOnClickListener(new View.OnClickListener(this) {
                    public final o3 f11580b;

                    {
                        this.f11580b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f11580b.F.U(null, null);
                                return;
                            case 1:
                                o3 o3Var = this.f11580b;
                                if (o3Var.I.getAlpha() >= 0.25f) {
                                    o3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                o3 o3Var2 = this.f11580b;
                                if (o3Var2.I.getAlpha() >= 0.25f) {
                                    o3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f11580b.f(false);
                                return;
                        }
                    }
                });
            }
            d f13 = vh.f(24, context, u6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            zq zqVar = new zq(R.drawable.mini_collage, 0);
            zqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            f13.i(spannableStringBuilder, false, true);
            linearLayout.addView(f13, gb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            f13.setOnClickListener(new View.OnClickListener(this) {
                public final o3 f11580b;

                {
                    this.f11580b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f11580b.F.U(null, null);
                            return;
                        case 1:
                            o3 o3Var = this.f11580b;
                            if (o3Var.I.getAlpha() >= 0.25f) {
                                o3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            o3 o3Var2 = this.f11580b;
                            if (o3Var2.I.getAlpha() >= 0.25f) {
                                o3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f11580b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            int dp = AndroidUtilities.dp(56.0f);
            int i12 = org.telegram.ui.ActionBar.y6.Oh;
            ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i12, u6Var));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            imageView.setBackground(K);
            org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, u6Var);
            gb1.c(imageView, 0.1f, 1.5f);
            addView(imageView, gb1.h(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final o3 f11580b;

                {
                    this.f11580b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f11580b.F.U(null, null);
                            return;
                        case 1:
                            o3 o3Var = this.f11580b;
                            if (o3Var.I.getAlpha() >= 0.25f) {
                                o3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            o3 o3Var2 = this.f11580b;
                            if (o3Var2.I.getAlpha() >= 0.25f) {
                                o3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f11580b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f11335j0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.f11339b0.size() > 0)) {
            this.f11343e0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f11346g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f11343e0 = (MediaController.AlbumEntry) this.f11346g0.get(0);
            } else {
                this.f11343e0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f11345f0 = b(this.f11343e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f11343e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f11354y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f11354y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f11354y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(k3 k3Var) {
        Bitmap bitmap;
        if (k3Var != null && (bitmap = k3Var.f11094a) != null && !bitmap.isRecycled()) {
            return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
        }
        return null;
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < albumEntry.photos.size(); i10++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            if (!this.L || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        h3 h3Var = this.f11344f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f11343e0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f11343e0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f11343e0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f11346g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f11343e0 = (MediaController.AlbumEntry) this.f11346g0.get(0);
                } else {
                    this.f11343e0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f11345f0 = b(this.f11343e0);
            this.f11347h0.clear();
            i();
            if (h3Var != null) {
                h3Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.f11339b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f11336a).getStoriesController().f8648w.f10498b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    w7 w7Var = (w7) obj;
                    if (!w7Var.f11903g && !w7Var.f11932w) {
                        arrayList2.add(w7Var);
                    }
                }
            }
            h();
            i();
            if (h3Var != null) {
                h3Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float g7 = g();
        int i10 = 0;
        if (g7 <= org.telegram.messenger.t.c(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g7, 0.0f, e);
        if (z10 != this.f11352w) {
            this.f11352w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f11352w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f11353x;
        if (kVar != null) {
            kVar.setAlpha(e);
            if (e <= 0.0f) {
                i10 = 8;
            }
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        di.i4 i4Var = this.f11348i0;
        if (i4Var != null) {
            i4Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f11340c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f11343e0 = albumEntry;
        this.f11345f0 = b(albumEntry);
        this.f11347h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f11343e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f11354y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f11335j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f11344f.l();
        y2 y2Var = this.e;
        if (z10) {
            mi.n nVar = new mi.n(getContext(), 2);
            nVar.f47677a = 1;
            nVar.f18556p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            y2Var.w0(nVar);
            return;
        }
        y2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        k3 k3Var;
        if (this.f11337a0 != null) {
            ArrayList arrayList = this.f11347h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    x2 x2Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < x2Var.getChildCount()) {
                                    View childAt = x2Var.getChildAt(i11);
                                    if (childAt instanceof k3) {
                                        k3Var = (k3) childAt;
                                        if (k3Var.S == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    k3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(k3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f11337a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(x2Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        x2 x2Var = this.d;
        if (x2Var != null && x2Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < x2Var.getChildCount(); i11++) {
                View childAt = x2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (x2Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, x2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f11343e0;
    }

    public String getTitle() {
        int i10;
        if (this.L) {
            i10 = R.string.AddImage;
        } else {
            i10 = R.string.ChoosePhotoOrVideo;
        }
        return LocaleController.getString(i10);
    }

    public final void h() {
        a aVar;
        d3 d3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d3Var.f23174b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f11346g0 = arrayList2;
        Collections.sort(arrayList2, new bi.p5(arrayList, 2));
        ArrayList arrayList3 = this.f11339b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f11335j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f11346g0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f11346g0.isEmpty();
        TextView textView = this.f11354y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f11346g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f11346g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f11338b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f11338b);
                }
            }
            d3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.q(14, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f11346g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f11346g0.get(0) == this.f11343e0 && this.f11339b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11341c0 = z10;
        if (z10 || (this.f11343e0 != f11335j0 && ((arrayList = this.f11346g0) == null || arrayList.isEmpty() || this.f11346g0.get(0) != this.f11343e0))) {
            z11 = false;
        }
        this.f11342d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int dp;
        ArrayList arrayList = this.f11347h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        float f11 = 0.0f;
        float f12 = 1.0f;
        ImageView imageView = this.H;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f7);
            float f13 = 0.7f;
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!isEmpty) {
                f13 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f13);
            if (!isEmpty) {
                dp = -AndroidUtilities.navigationBarHeight;
            } else {
                dp = AndroidUtilities.dp(8.0f);
            }
            vh.q(scaleY.translationY(dp), ds.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.i(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f14 = 10.0f;
            int dp2 = AndroidUtilities.dp(10.0f);
            int dp3 = AndroidUtilities.dp(10.0f);
            int dp4 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f14 = 0.0f;
            }
            linearLayout.setPadding(dp2, dp3, dp4, AndroidUtilities.dp(f14) + AndroidUtilities.navigationBarHeight);
            if (this.T != z10) {
                this.T = z10;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                if (isEmpty) {
                    f11 = AndroidUtilities.dp(32.0f);
                }
                alpha2.translationY(f11).setInterpolator(ds.h).setDuration(320L).setListener(new bh.f0(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f11336a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f11336a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        k3.f11092e0.clear();
        k3.f11093f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = k3.f11090c0;
            if (i10 < arrayList.size()) {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        float f7;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        x2 x2Var = this.d;
        x2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            dp = 0;
        } else {
            if (AndroidUtilities.navigationBarHeight > 0) {
                i12 = 0;
            } else {
                i12 = 10;
            }
            dp = AndroidUtilities.dp(i12 + 114);
        }
        x2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            int dp4 = AndroidUtilities.dp(10.0f);
            int dp5 = AndroidUtilities.dp(10.0f);
            int dp6 = AndroidUtilities.dp(10.0f);
            if (AndroidUtilities.navigationBarHeight > 0) {
                f10 = 0.0f;
            } else {
                f10 = 10.0f;
            }
            linearLayout.setPadding(dp4, dp5, dp6, AndroidUtilities.dp(f10) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i13 = AndroidUtilities.statusBarHeight;
        int dp7 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f11354y;
        textView.setPadding(0, i13, dp7, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f7 = 18.0f;
                textView.setTextSize(f7);
                super.onMeasure(i10, i11);
            }
        }
        f7 = 20.0f;
        textView.setTextSize(f7);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.R = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.W = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.f11337a0 = callback3;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
