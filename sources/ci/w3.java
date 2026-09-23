package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.messenger.ul;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xw0;
public abstract class w3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f5703j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final k3 F;
    public final org.telegram.ui.ActionBar.v0 G;
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
    public final org.telegram.ui.Components.e6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int f5704a;
    public Utilities.Callback3 f5705a0;
    public final org.telegram.ui.ActionBar.d6 f5706b;
    public final ArrayList f5707b0;
    public final Paint f5708c;
    public boolean f5709c0;
    public final e3 d;
    public boolean f5710d0;
    public final f3 e;
    public MediaController.AlbumEntry f5711e0;
    public final o3 f5712f;
    public ArrayList f5713f0;
    public ArrayList f5714g0;
    public final FrameLayout h;
    public final ArrayList f5715h0;
    public ai.w5 f5716i0;
    public final ml0 f5717n;
    public final l3 f5718r;
    public final xw0 f5719s;
    public final i4 v;
    public boolean f5720w;
    public final org.telegram.ui.ActionBar.k f5721x;
    public final TextView f5722y;

    public w3(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f5708c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.e6(this, 0L, 350L, rr.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f5707b0 = arrayList;
        this.f5715h0 = new ArrayList();
        this.O = f7;
        this.f5704a = i10;
        this.f5706b = d6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        e3 e3Var = new e3(this, context, d6Var);
        this.d = e3Var;
        e3Var.setItemSelectorColorProvider(new ai.w1(22));
        o3 o3Var = new o3(this);
        this.f5712f = o3Var;
        e3Var.setAdapter(o3Var);
        f3 f3Var = new f3(this);
        this.e = f3Var;
        e3Var.setLayoutManager(f3Var);
        e3Var.setFastScrollEnabled(1);
        e3Var.setFastScrollVisible(true);
        e3Var.getFastScroll().setAlpha(0.0f);
        f3Var.O = new g3(this);
        e3Var.i(new Object());
        e3Var.setClipToPadding(false);
        addView(e3Var, w7.x5.e(-1, -1, 119));
        e3Var.setOnItemClickListener(new al0(this) {
            public final w3 f5866b;

            {
                this.f5866b = this;
            }

            @Override
            public final void d(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        w3 w3Var = this.f5866b;
                        ArrayList arrayList2 = w3Var.f5707b0;
                        ArrayList arrayList3 = w3Var.f5715h0;
                        if (i11 >= 2 && w3Var.W != null && (view instanceof r3)) {
                            r3 r3Var = (r3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (w3Var.f5709c0) {
                                if (i12 == 0) {
                                    w3Var.e(w3.f5703j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (w3Var.f5710d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    l8 l8Var = (l8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = w3Var.W;
                                    if (l8Var.K) {
                                        bitmap = w3.d(r3Var);
                                    }
                                    callback22.run(l8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < w3Var.f5713f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) w3Var.f5713f0.get(i12);
                                if (arrayList3.isEmpty() && !w3Var.Q) {
                                    Utilities.Callback2 callback23 = w3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = w3.d(r3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > w3Var.R) {
                                    int i13 = -w3Var.N;
                                    w3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(r3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(w3Var.d);
                                w3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w3 w3Var2 = this.f5866b;
                        l3 l3Var = w3Var2.f5718r;
                        org.telegram.ui.ActionBar.v0 v0Var = w3Var2.G;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < l3Var.f5662c.size() && (callback2 = w3Var2.W) != null) {
                            callback2.run(l3Var.f5662c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        e3Var.setOnItemLongClickListener(new a1.c(this, 16));
        e3Var.setOnScrollListener(new i3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, d6Var);
        this.f5721x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.A(436207615, false);
        kVar.B(-1, false);
        kVar.B(-1, true);
        addView(kVar, w7.x5.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new j3(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        k3 k3Var = new k3(this, context, n10, d6Var);
        this.F = k3Var;
        k3Var.setSubMenuOpenSide(1);
        if (AndroidUtilities.isTablet()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        kVar.addView(k3Var, 0, w7.x5.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        k3Var.setOnClickListener(new View.OnClickListener(this) {
            public final w3 f5908b;

            {
                this.f5908b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5908b.F.M(null, null);
                        return;
                    case 1:
                        w3 w3Var = this.f5908b;
                        if (w3Var.I.getAlpha() >= 0.25f) {
                            w3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        w3 w3Var2 = this.f5908b;
                        if (w3Var2.I.getAlpha() >= 0.25f) {
                            w3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f5908b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f5722y = textView;
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
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        k3Var.addView(textView, w7.x5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        ml0 ml0Var = new ml0(context, d6Var);
        this.f5717n = ml0Var;
        ml0Var.setLayoutManager(new s4.s(3));
        l3 l3Var = new l3(this);
        this.f5718r = l3Var;
        ml0Var.setAdapter(l3Var);
        ml0Var.setOnScrollListener(new m3(this));
        ml0Var.setClipToPadding(true);
        ml0Var.i(new Object());
        frameLayout.addView(ml0Var, w7.x5.e(-1, -1, 119));
        u00 u00Var = new u00(context, d6Var);
        u00Var.setViewType(2);
        u00Var.setAlpha(0.0f);
        u00Var.setVisibility(8);
        frameLayout.addView(u00Var, w7.x5.e(-1, -1, 119));
        xw0 xw0Var = new xw0(context, u00Var, 11, d6Var);
        this.f5719s = xw0Var;
        vh.o oVar = xw0Var.d;
        oVar.setTextSize(1, 16.0f);
        oVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19170y6, d6Var));
        oVar.setTypeface(null);
        oVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new i4(this, false, new ai.y1(this, 9));
        frameLayout.addView(xw0Var, w7.x5.e(-1, -1, 119));
        ml0Var.setEmptyView(xw0Var);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d3(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        ml0Var.setOnItemClickListener(new al0(this) {
            public final w3 f5866b;

            {
                this.f5866b = this;
            }

            @Override
            public final void d(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        w3 w3Var = this.f5866b;
                        ArrayList arrayList2 = w3Var.f5707b0;
                        ArrayList arrayList3 = w3Var.f5715h0;
                        if (i11 >= 2 && w3Var.W != null && (view instanceof r3)) {
                            r3 r3Var = (r3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (w3Var.f5709c0) {
                                if (i12 == 0) {
                                    w3Var.e(w3.f5703j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (w3Var.f5710d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    l8 l8Var = (l8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = w3Var.W;
                                    if (l8Var.K) {
                                        bitmap = w3.d(r3Var);
                                    }
                                    callback22.run(l8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < w3Var.f5713f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) w3Var.f5713f0.get(i12);
                                if (arrayList3.isEmpty() && !w3Var.Q) {
                                    Utilities.Callback2 callback23 = w3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = w3.d(r3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > w3Var.R) {
                                    int i13 = -w3Var.N;
                                    w3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(r3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(w3Var.d);
                                w3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        w3 w3Var2 = this.f5866b;
                        l3 l3Var2 = w3Var2.f5718r;
                        org.telegram.ui.ActionBar.v0 v0Var = w3Var2.G;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < l3Var2.f5662c.size() && (callback2 = w3Var2.W) != null) {
                            callback2.run(l3Var2.f5662c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f1210w.f4368b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                l8 l8Var = (l8) obj;
                if (!l8Var.f4979g && !l8Var.f5008w) {
                    this.f5707b0.add(l8Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18859h5, d6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, w7.x5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d g10 = ul.g(24, context, d6Var, true);
            this.J = g10;
            g10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final w3 f5908b;

                    {
                        this.f5908b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f5908b.F.M(null, null);
                                return;
                            case 1:
                                w3 w3Var = this.f5908b;
                                if (w3Var.I.getAlpha() >= 0.25f) {
                                    w3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                w3 w3Var2 = this.f5908b;
                                if (w3Var2.I.getAlpha() >= 0.25f) {
                                    w3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f5908b.f(false);
                                return;
                        }
                    }
                });
            }
            d g11 = ul.g(24, context, d6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            pq pqVar = new pq(R.drawable.mini_collage, 0);
            pqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            g11.g(spannableStringBuilder, false, true);
            linearLayout.addView(g11, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final w3 f5908b;

                {
                    this.f5908b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f5908b.F.M(null, null);
                            return;
                        case 1:
                            w3 w3Var = this.f5908b;
                            if (w3Var.I.getAlpha() >= 0.25f) {
                                w3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            w3 w3Var2 = this.f5908b;
                            if (w3Var2.I.getAlpha() >= 0.25f) {
                                w3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f5908b.f(false);
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
            imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Oh, d6Var)));
            w7.z5.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final w3 f5908b;

                {
                    this.f5908b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f5908b.F.M(null, null);
                            return;
                        case 1:
                            w3 w3Var = this.f5908b;
                            if (w3Var.I.getAlpha() >= 0.25f) {
                                w3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            w3 w3Var2 = this.f5908b;
                            if (w3Var2.I.getAlpha() >= 0.25f) {
                                w3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f5908b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f5703j0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.f5707b0.size() > 0)) {
            this.f5711e0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f5714g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f5711e0 = (MediaController.AlbumEntry) this.f5714g0.get(0);
            } else {
                this.f5711e0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f5713f0 = b(this.f5711e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f5711e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f5722y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f5722y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f5722y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(r3 r3Var) {
        Bitmap bitmap;
        if (r3Var != null && (bitmap = r3Var.f5440a) != null && !bitmap.isRecycled()) {
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
        o3 o3Var = this.f5712f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f5711e0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f5711e0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f5711e0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f5714g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f5711e0 = (MediaController.AlbumEntry) this.f5714g0.get(0);
                } else {
                    this.f5711e0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f5713f0 = b(this.f5711e0);
            this.f5715h0.clear();
            i();
            if (o3Var != null) {
                o3Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.f5707b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f5704a).getStoriesController().f1210w.f4368b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    l8 l8Var = (l8) obj;
                    if (!l8Var.f4979g && !l8Var.f5008w) {
                        arrayList2.add(l8Var);
                    }
                }
            }
            h();
            i();
            if (o3Var != null) {
                o3Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float g10 = g();
        int i10 = 0;
        if (g10 <= hg.c.f(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e);
        if (z10 != this.f5720w) {
            this.f5720w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f5720w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f5721x;
        if (kVar != null) {
            kVar.setAlpha(e);
            if (e <= 0.0f) {
                i10 = 8;
            }
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        ai.w5 w5Var = this.f5716i0;
        if (w5Var != null) {
            w5Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f5708c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f5711e0 = albumEntry;
        this.f5713f0 = b(albumEntry);
        this.f5715h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f5711e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f5722y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f5703j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f5712f.l();
        f3 f3Var = this.e;
        if (z10) {
            ji.o oVar = new ji.o(getContext(), 2);
            oVar.f42777a = 1;
            oVar.f13094p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            f3Var.w0(oVar);
            return;
        }
        f3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        r3 r3Var;
        if (this.f5705a0 != null) {
            ArrayList arrayList = this.f5715h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    e3 e3Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < e3Var.getChildCount()) {
                                    View childAt = e3Var.getChildAt(i11);
                                    if (childAt instanceof r3) {
                                        r3Var = (r3) childAt;
                                        if (r3Var.S == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    r3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(r3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f5705a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(e3Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        e3 e3Var = this.d;
        if (e3Var != null && e3Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < e3Var.getChildCount(); i11++) {
                View childAt = e3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (e3Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, e3Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f5711e0;
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
        k3 k3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k3Var.f19561b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f5714g0 = arrayList2;
        Collections.sort(arrayList2, new ai.e8(arrayList, 1));
        ArrayList arrayList3 = this.f5707b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f5703j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f5714g0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f5714g0.isEmpty();
        TextView textView = this.f5722y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f5714g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f5714g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f5706b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f5706b);
                }
            }
            k3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.f2(4, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f5714g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f5714g0.get(0) == this.f5711e0 && this.f5707b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5709c0 = z10;
        if (z10 || (this.f5711e0 != f5703j0 && ((arrayList = this.f5714g0) == null || arrayList.isEmpty() || this.f5714g0.get(0) != this.f5711e0))) {
            z11 = false;
        }
        this.f5710d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int dp;
        ArrayList arrayList = this.f5715h0;
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
            ul.r(scaleY.translationY(dp), rr.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
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
                alpha2.translationY(f11).setInterpolator(rr.h).setDuration(320L).setListener(new ai.n(9, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f5704a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f5704a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        r3.f5438e0.clear();
        r3.f5439f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = r3.f5436c0;
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
        e3 e3Var = this.d;
        e3Var.setPinnedSectionOffsetY(currentActionBarHeight);
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
        e3Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
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
        TextView textView = this.f5722y;
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
        this.f5705a0 = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
