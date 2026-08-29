package nh;

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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.zk0;
public abstract class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f18166f0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable A;
    public final c3 B;
    public final org.telegram.ui.ActionBar.w0 C;
    public final ImageView D;
    public final LinearLayout E;
    public final d F;
    public boolean G;
    public final boolean H;
    public final boolean I;
    public int J;
    public final float K;
    public final boolean L;
    public boolean M;
    public int N;
    public final org.telegram.ui.Components.d6 O;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public Utilities.Callback2 S;
    public Utilities.Callback3 T;
    public final ArrayList U;
    public boolean V;
    public boolean W;
    public final int f18167a;
    public MediaController.AlbumEntry f18168a0;
    public final org.telegram.ui.ActionBar.c6 f18169b;
    public ArrayList f18170b0;
    public final Paint f18171c;
    public ArrayList f18172c0;
    public final w2 d;
    public final ArrayList f18173d0;
    public final x2 f18174e;
    public bh.d f18175e0;
    public final g3 f18176f;
    public final FrameLayout h;
    public final jl0 f18177n;
    public final d3 f18178r;
    public final qw0 f18179s;
    public final w3 v;
    public boolean f18180w;
    public final org.telegram.ui.ActionBar.l f18181x;
    public final TextView f18182y;

    public n3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f9, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.f18171c = paint;
        this.J = -2;
        this.O = new org.telegram.ui.Components.d6(this, 0L, 350L, jr.h);
        this.Q = true;
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.f18173d0 = new ArrayList();
        this.K = f9;
        this.f18167a = i10;
        this.f18169b = c6Var;
        this.H = z10;
        this.I = z11;
        this.L = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        w2 w2Var = new w2(this, context, c6Var);
        this.d = w2Var;
        w2Var.setItemSelectorColorProvider(new m4.a(5));
        g3 g3Var = new g3(this);
        this.f18176f = g3Var;
        w2Var.setAdapter(g3Var);
        x2 x2Var = new x2(this);
        this.f18174e = x2Var;
        w2Var.setLayoutManager(x2Var);
        w2Var.setFastScrollEnabled(1);
        w2Var.setFastScrollVisible(true);
        w2Var.getFastScroll().setAlpha(0.0f);
        x2Var.O = new y2(this);
        w2Var.i(new Object());
        w2Var.setClipToPadding(false);
        addView(w2Var, i7.f6.e(-1, -1, 119));
        w2Var.setOnItemClickListener(new zk0(this) {
            public final n3 f18396b;

            {
                this.f18396b = this;
            }

            @Override
            public final void c(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        n3 n3Var = this.f18396b;
                        ArrayList arrayList2 = n3Var.U;
                        ArrayList arrayList3 = n3Var.f18173d0;
                        if (i11 >= 2 && n3Var.S != null && (view instanceof j3)) {
                            j3 j3Var = (j3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (n3Var.V) {
                                if (i12 == 0) {
                                    n3Var.e(n3.f18166f0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (n3Var.W) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    o7 o7Var = (o7) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = n3Var.S;
                                    if (o7Var.K) {
                                        bitmap = n3.d(j3Var);
                                    }
                                    callback22.run(o7Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < n3Var.f18170b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) n3Var.f18170b0.get(i12);
                                if (arrayList3.isEmpty() && !n3Var.M) {
                                    Utilities.Callback2 callback23 = n3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = n3.d(j3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > n3Var.N) {
                                    int i13 = -n3Var.J;
                                    n3Var.J = i13;
                                    AndroidUtilities.shakeViewSpring(j3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(n3Var.d);
                                n3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n3 n3Var2 = this.f18396b;
                        d3 d3Var = n3Var2.f18178r;
                        org.telegram.ui.ActionBar.w0 w0Var = n3Var2.C;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < d3Var.f18124c.size() && (callback2 = n3Var2.S) != null) {
                            callback2.run(d3Var.f18124c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        w2Var.setOnItemLongClickListener(new l4.s0(this, 14));
        w2Var.setOnScrollListener(new a3(this));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var);
        this.f18181x = lVar;
        lVar.setBackgroundColor(-14737633);
        lVar.setTitleColor(-1);
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.B(436207615, false);
        lVar.C(-1, false);
        lVar.C(-1, true);
        addView(lVar, i7.f6.e(-1, -2, 55));
        lVar.setActionBarMenuOnItemClick(new b3(this));
        org.telegram.ui.ActionBar.a0 n10 = lVar.n();
        c3 c3Var = new c3(this, context, n10, c6Var);
        this.B = c3Var;
        c3Var.setSubMenuOpenSide(1);
        lVar.addView(c3Var, 0, i7.f6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        c3Var.setOnClickListener(new View.OnClickListener(this) {
            public final n3 f18507b;

            {
                this.f18507b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18507b.B.M(null, null);
                        return;
                    case 1:
                        n3 n3Var = this.f18507b;
                        if (n3Var.E.getAlpha() >= 0.25f) {
                            n3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        n3 n3Var2 = this.f18507b;
                        if (n3Var2.E.getAlpha() >= 0.25f) {
                            n3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f18507b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f18182y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.A = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        c3Var.addView(textView, i7.f6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        jl0 jl0Var = new jl0(context, c6Var);
        this.f18177n = jl0Var;
        jl0Var.setLayoutManager(new f2.w(3));
        d3 d3Var = new d3(this);
        this.f18178r = d3Var;
        jl0Var.setAdapter(d3Var);
        jl0Var.setOnScrollListener(new e3(this));
        jl0Var.setClipToPadding(true);
        jl0Var.i(new Object());
        frameLayout.addView(jl0Var, i7.f6.e(-1, -1, 119));
        p00 p00Var = new p00(context, c6Var);
        p00Var.setViewType(2);
        p00Var.setAlpha(0.0f);
        p00Var.setVisibility(8);
        frameLayout.addView(p00Var, i7.f6.e(-1, -1, 119));
        qw0 qw0Var = new qw0(context, p00Var, 11, c6Var);
        this.f18179s = qw0Var;
        gh.s sVar = qw0Var.d;
        sVar.setTextSize(1, 16.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23433y6, c6Var));
        sVar.setTypeface(null);
        sVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new w3(this, false, new b0(this, 3));
        frameLayout.addView(qw0Var, i7.f6.e(-1, -1, 119));
        jl0Var.setEmptyView(qw0Var);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new v2(this);
        this.C = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        jl0Var.setOnItemClickListener(new zk0(this) {
            public final n3 f18396b;

            {
                this.f18396b = this;
            }

            @Override
            public final void c(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        n3 n3Var = this.f18396b;
                        ArrayList arrayList2 = n3Var.U;
                        ArrayList arrayList3 = n3Var.f18173d0;
                        if (i11 >= 2 && n3Var.S != null && (view instanceof j3)) {
                            j3 j3Var = (j3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (n3Var.V) {
                                if (i12 == 0) {
                                    n3Var.e(n3.f18166f0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (n3Var.W) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    o7 o7Var = (o7) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = n3Var.S;
                                    if (o7Var.K) {
                                        bitmap = n3.d(j3Var);
                                    }
                                    callback22.run(o7Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < n3Var.f18170b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) n3Var.f18170b0.get(i12);
                                if (arrayList3.isEmpty() && !n3Var.M) {
                                    Utilities.Callback2 callback23 = n3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = n3.d(j3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > n3Var.N) {
                                    int i13 = -n3Var.J;
                                    n3Var.J = i13;
                                    AndroidUtilities.shakeViewSpring(j3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(n3Var.d);
                                n3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        n3 n3Var2 = this.f18396b;
                        d3 d3Var2 = n3Var2.f18178r;
                        org.telegram.ui.ActionBar.w0 w0Var = n3Var2.C;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < d3Var2.f18124c.size() && (callback2 = n3Var2.S) != null) {
                            callback2.run(d3Var2.f18124c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f16237w.f17373b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                o7 o7Var = (o7) obj;
                if (!o7Var.f18270g && !o7Var.f18299w) {
                    this.U.add(o7Var);
                }
            }
        }
        if (z11) {
            this.D = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, i7.f6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
            this.F = o10;
            o10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(o10, i7.f6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                o10.setOnClickListener(new View.OnClickListener(this) {
                    public final n3 f18507b;

                    {
                        this.f18507b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f18507b.B.M(null, null);
                                return;
                            case 1:
                                n3 n3Var = this.f18507b;
                                if (n3Var.E.getAlpha() >= 0.25f) {
                                    n3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                n3 n3Var2 = this.f18507b;
                                if (n3Var2.E.getAlpha() >= 0.25f) {
                                    n3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f18507b.f(false);
                                return;
                        }
                    }
                });
            }
            d o11 = org.telegram.messenger.x3.o(24, context, c6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            iq iqVar = new iq(R.drawable.mini_collage, 0);
            iqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            o11.g(spannableStringBuilder, false, true);
            linearLayout.addView(o11, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            o11.setOnClickListener(new View.OnClickListener(this) {
                public final n3 f18507b;

                {
                    this.f18507b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f18507b.B.M(null, null);
                            return;
                        case 1:
                            n3 n3Var = this.f18507b;
                            if (n3Var.E.getAlpha() >= 0.25f) {
                                n3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            n3 n3Var2 = this.f18507b;
                            if (n3Var2.E.getAlpha() >= 0.25f) {
                                n3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f18507b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.E = null;
            this.F = null;
            ImageView imageView = new ImageView(context);
            this.D = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var)));
            i7.h6.b(imageView, 0.1f, 1.5f);
            addView(imageView, i7.f6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final n3 f18507b;

                {
                    this.f18507b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f18507b.B.M(null, null);
                            return;
                        case 1:
                            n3 n3Var = this.f18507b;
                            if (n3Var.E.getAlpha() >= 0.25f) {
                                n3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            n3 n3Var2 = this.f18507b;
                            if (n3Var2.E.getAlpha() >= 0.25f) {
                                n3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f18507b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f18166f0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.U.size() > 0)) {
            this.f18168a0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f18172c0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f18168a0 = (MediaController.AlbumEntry) this.f18172c0.get(0);
            } else {
                this.f18168a0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f18170b0 = b(this.f18168a0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f18168a0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f18182y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f18182y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f18182y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(j3 j3Var) {
        Bitmap bitmap;
        if (j3Var != null && (bitmap = j3Var.f17942a) != null && !bitmap.isRecycled()) {
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
            if (!this.H || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        g3 g3Var = this.f18176f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f18168a0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f18168a0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f18168a0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f18172c0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f18168a0 = (MediaController.AlbumEntry) this.f18172c0.get(0);
                } else {
                    this.f18168a0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f18170b0 = b(this.f18168a0);
            this.f18173d0.clear();
            i();
            if (g3Var != null) {
                g3Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.U;
            arrayList2.clear();
            if (!this.H) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f18167a).getStoriesController().f16237w.f17373b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    o7 o7Var = (o7) obj;
                    if (!o7Var.f18270g && !o7Var.f18299w) {
                        arrayList2.add(o7Var);
                    }
                }
            }
            h();
            i();
            if (g3Var != null) {
                g3Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f9;
        float g10 = g();
        int i10 = 0;
        if (g10 <= j7.l1.d(32.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.O.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e10);
        if (z10 != this.f18180w) {
            this.f18180w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f18180w) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            animate.alpha(f9).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.f18181x;
        if (lVar != null) {
            lVar.setAlpha(e10);
            if (e10 <= 0.0f) {
                i10 = 8;
            }
            if (lVar.getVisibility() != i10) {
                lVar.setVisibility(i10);
            }
        }
        bh.d dVar = this.f18175e0;
        if (dVar != null) {
            dVar.setAlpha(1.0f - e10);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f18171c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f18168a0 = albumEntry;
        this.f18170b0 = b(albumEntry);
        this.f18173d0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f18168a0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f18182y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f18166f0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f18176f.l();
        x2 x2Var = this.f18174e;
        if (z10) {
            uh.n nVar = new uh.n(getContext(), 2);
            nVar.f6373a = 1;
            nVar.f49306p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            x2Var.w0(nVar);
            return;
        }
        x2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        j3 j3Var;
        if (this.T != null) {
            ArrayList arrayList = this.f18173d0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.S.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    w2 w2Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < w2Var.getChildCount()) {
                                    View childAt = w2Var.getChildAt(i11);
                                    if (childAt instanceof j3) {
                                        j3Var = (j3) childAt;
                                        if (j3Var.O == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    j3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(j3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.T.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(w2Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        w2 w2Var = this.d;
        if (w2Var != null && w2Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < w2Var.getChildCount(); i11++) {
                View childAt = w2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (w2Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, w2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f18168a0;
    }

    public String getTitle() {
        int i10;
        if (this.H) {
            i10 = R.string.AddImage;
        } else {
            i10 = R.string.ChoosePhotoOrVideo;
        }
        return LocaleController.getString(i10);
    }

    public final void h() {
        a aVar;
        c3 c3Var = this.B;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c3Var.f23915b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f18172c0 = arrayList2;
        Collections.sort(arrayList2, new a4.v(arrayList, 5));
        ArrayList arrayList3 = this.U;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f18166f0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f18172c0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f18172c0.isEmpty();
        TextView textView = this.f18182y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A, (Drawable) null);
        int size = this.f18172c0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f18172c0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f18169b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f18169b);
                }
            }
            c3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ag.n(29, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f18172c0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f18172c0.get(0) == this.f18168a0 && this.U.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V = z10;
        if (z10 || (this.f18168a0 != f18166f0 && ((arrayList = this.f18172c0) == null || arrayList.isEmpty() || this.f18172c0.get(0) != this.f18168a0))) {
            z11 = false;
        }
        this.W = z11;
    }

    public final void j() {
        float f9;
        float f10;
        int dp;
        ArrayList arrayList = this.f18173d0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        float f11 = 0.0f;
        float f12 = 1.0f;
        ImageView imageView = this.D;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
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
            org.telegram.ui.b.q(scaleY.translationY(dp), jr.h, 320L);
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null) {
            d dVar = this.F;
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
            if (this.P != z10) {
                this.P = z10;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f12 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                if (isEmpty) {
                    f11 = AndroidUtilities.dp(32.0f);
                }
                alpha2.translationY(f11).setInterpolator(jr.h).setDuration(320L).setListener(new bg.z2(13, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f18167a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f18167a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        j3.f17940a0.clear();
        j3.f17941b0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = j3.V;
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
        float f9;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        w2 w2Var = this.d;
        w2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.E;
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
        w2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.D;
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
        layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i13 = AndroidUtilities.statusBarHeight;
        int dp7 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f18182y;
        textView.setPadding(0, i13, dp7, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f9 = 18.0f;
                textView.setTextSize(f9);
                super.onMeasure(i10, i11);
            }
        }
        f9 = 20.0f;
        textView.setTextSize(f9);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.N = i10;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.R = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.S = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.T = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
