package bi;

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
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public abstract class p4 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f3367j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final c4 F;
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
    public final org.telegram.ui.Components.d6 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public Utilities.Callback2 W;
    public final int f3368a;
    public Utilities.Callback3 f3369a0;
    public final org.telegram.ui.ActionBar.f6 f3370b;
    public final ArrayList f3371b0;
    public final Paint f3372c;
    public boolean f3373c0;
    public final w3 d;
    public boolean f3374d0;
    public final x3 e;
    public MediaController.AlbumEntry f3375e0;
    public final g4 f3376f;
    public ArrayList f3377f0;
    public ArrayList f3378g0;
    public final FrameLayout h;
    public final ArrayList f3379h0;
    public l4 f3380i0;
    public final vl0 f3381n;
    public final d4 f3382r;
    public final jx0 f3383s;
    public final b5 v;
    public boolean f3384w;
    public final org.telegram.ui.ActionBar.l f3385x;
    public final TextView f3386y;

    public p4(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f3372c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.d6(this, 0L, 350L, wr.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f3371b0 = arrayList;
        this.f3379h0 = new ArrayList();
        this.O = f7;
        this.f3368a = i10;
        this.f3370b = f6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        w3 w3Var = new w3(this, context, f6Var);
        this.d = w3Var;
        w3Var.setItemSelectorColorProvider(new androidx.emoji2.text.w(11));
        g4 g4Var = new g4(this);
        this.f3376f = g4Var;
        w3Var.setAdapter(g4Var);
        x3 x3Var = new x3(this);
        this.e = x3Var;
        w3Var.setLayoutManager(x3Var);
        w3Var.setFastScrollEnabled(1);
        w3Var.setFastScrollVisible(true);
        w3Var.getFastScroll().setAlpha(0.0f);
        x3Var.O = new y3(this);
        w3Var.i(new Object());
        w3Var.setClipToPadding(false);
        addView(w3Var, w7.a6.e(-1, -1, 119));
        w3Var.setOnItemClickListener(new jl0(this) {
            public final p4 f3303b;

            {
                this.f3303b = this;
            }

            @Override
            public final void d(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        p4 p4Var = this.f3303b;
                        ArrayList arrayList2 = p4Var.f3371b0;
                        ArrayList arrayList3 = p4Var.f3379h0;
                        if (i11 >= 2 && p4Var.W != null && (view instanceof j4)) {
                            j4 j4Var = (j4) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (p4Var.f3373c0) {
                                if (i12 == 0) {
                                    p4Var.e(p4.f3367j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (p4Var.f3374d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    r9 r9Var = (r9) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = p4Var.W;
                                    if (r9Var.K) {
                                        bitmap = p4.d(j4Var);
                                    }
                                    callback22.run(r9Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < p4Var.f3377f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p4Var.f3377f0.get(i12);
                                if (arrayList3.isEmpty() && !p4Var.Q) {
                                    Utilities.Callback2 callback23 = p4Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = p4.d(j4Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > p4Var.R) {
                                    int i13 = -p4Var.N;
                                    p4Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(j4Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(p4Var.d);
                                p4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p4 p4Var2 = this.f3303b;
                        d4 d4Var = p4Var2.f3382r;
                        org.telegram.ui.ActionBar.w0 w0Var = p4Var2.G;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < d4Var.f3304c.size() && (callback2 = p4Var2.W) != null) {
                            callback2.run(d4Var.f3304c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        w3Var.setOnItemLongClickListener(new a1.c(this, 6));
        w3Var.setOnScrollListener(new a4(this));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, f6Var);
        this.f3385x = lVar;
        lVar.setBackgroundColor(-14737633);
        lVar.setTitleColor(-1);
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setBackButtonImage(R.drawable.ic_ab_back);
        lVar.A(436207615, false);
        lVar.C(-1, false);
        lVar.C(-1, true);
        addView(lVar, w7.a6.e(-1, -2, 55));
        lVar.setActionBarMenuOnItemClick(new b4(this));
        org.telegram.ui.ActionBar.z n10 = lVar.n();
        c4 c4Var = new c4(this, context, n10, f6Var);
        this.F = c4Var;
        c4Var.setSubMenuOpenSide(1);
        if (AndroidUtilities.isTablet()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        lVar.addView(c4Var, 0, w7.a6.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        c4Var.setOnClickListener(new View.OnClickListener(this) {
            public final p4 f3366b;

            {
                this.f3366b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3366b.F.M(null, null);
                        return;
                    case 1:
                        p4 p4Var = this.f3366b;
                        if (p4Var.I.getAlpha() >= 0.25f) {
                            p4Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        p4 p4Var2 = this.f3366b;
                        if (p4Var2.I.getAlpha() >= 0.25f) {
                            p4Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f3366b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f3386y = textView;
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
        c4Var.addView(textView, w7.a6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        vl0 vl0Var = new vl0(context, f6Var);
        this.f3381n = vl0Var;
        vl0Var.setLayoutManager(new s4.s(3));
        d4 d4Var = new d4(this);
        this.f3382r = d4Var;
        vl0Var.setAdapter(d4Var);
        vl0Var.setOnScrollListener(new e4(this));
        vl0Var.setClipToPadding(true);
        vl0Var.i(new Object());
        frameLayout.addView(vl0Var, w7.a6.e(-1, -1, 119));
        a10 a10Var = new a10(context, f6Var);
        a10Var.setViewType(2);
        a10Var.setAlpha(0.0f);
        a10Var.setVisibility(8);
        frameLayout.addView(a10Var, w7.a6.e(-1, -1, 119));
        jx0 jx0Var = new jx0(context, a10Var, 11, f6Var);
        this.f3383s = jx0Var;
        uh.o oVar = jx0Var.d;
        oVar.setTextSize(1, 16.0f);
        oVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18306y6, f6Var));
        oVar.setTypeface(null);
        oVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new b5(this, false, new ai.b(this, 5));
        frameLayout.addView(jx0Var, w7.a6.e(-1, -1, 119));
        vl0Var.setEmptyView(jx0Var);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new v3(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        vl0Var.setOnItemClickListener(new jl0(this) {
            public final p4 f3303b;

            {
                this.f3303b = this;
            }

            @Override
            public final void d(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        p4 p4Var = this.f3303b;
                        ArrayList arrayList2 = p4Var.f3371b0;
                        ArrayList arrayList3 = p4Var.f3379h0;
                        if (i11 >= 2 && p4Var.W != null && (view instanceof j4)) {
                            j4 j4Var = (j4) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (p4Var.f3373c0) {
                                if (i12 == 0) {
                                    p4Var.e(p4.f3367j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (p4Var.f3374d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    r9 r9Var = (r9) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = p4Var.W;
                                    if (r9Var.K) {
                                        bitmap = p4.d(j4Var);
                                    }
                                    callback22.run(r9Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < p4Var.f3377f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p4Var.f3377f0.get(i12);
                                if (arrayList3.isEmpty() && !p4Var.Q) {
                                    Utilities.Callback2 callback23 = p4Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = p4.d(j4Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > p4Var.R) {
                                    int i13 = -p4Var.N;
                                    p4Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(j4Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(p4Var.d);
                                p4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        p4 p4Var2 = this.f3303b;
                        d4 d4Var2 = p4Var2.f3382r;
                        org.telegram.ui.ActionBar.w0 w0Var = p4Var2.G;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < d4Var2.f3304c.size() && (callback2 = p4Var2.W) != null) {
                            callback2.run(d4Var2.f3304c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f48517w.f2684b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                r9 r9Var = (r9) obj;
                if (!r9Var.f3574g && !r9Var.f3603w) {
                    this.f3371b0.add(r9Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, f6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, w7.a6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d g10 = em.g(24, context, f6Var, true);
            this.J = g10;
            g10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, w7.a6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final p4 f3366b;

                    {
                        this.f3366b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f3366b.F.M(null, null);
                                return;
                            case 1:
                                p4 p4Var = this.f3366b;
                                if (p4Var.I.getAlpha() >= 0.25f) {
                                    p4Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                p4 p4Var2 = this.f3366b;
                                if (p4Var2.I.getAlpha() >= 0.25f) {
                                    p4Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f3366b.f(false);
                                return;
                        }
                    }
                });
            }
            d g11 = em.g(24, context, f6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            uq uqVar = new uq(R.drawable.mini_collage, 0);
            uqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            g11.g(spannableStringBuilder, false, true);
            linearLayout.addView(g11, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final p4 f3366b;

                {
                    this.f3366b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f3366b.F.M(null, null);
                            return;
                        case 1:
                            p4 p4Var = this.f3366b;
                            if (p4Var.I.getAlpha() >= 0.25f) {
                                p4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            p4 p4Var2 = this.f3366b;
                            if (p4Var2.I.getAlpha() >= 0.25f) {
                                p4Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f3366b.f(false);
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
            imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var)));
            w7.c6.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.a6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final p4 f3366b;

                {
                    this.f3366b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f3366b.F.M(null, null);
                            return;
                        case 1:
                            p4 p4Var = this.f3366b;
                            if (p4Var.I.getAlpha() >= 0.25f) {
                                p4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            p4 p4Var2 = this.f3366b;
                            if (p4Var2.I.getAlpha() >= 0.25f) {
                                p4Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f3366b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f3367j0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.f3371b0.size() > 0)) {
            this.f3375e0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f3378g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f3375e0 = (MediaController.AlbumEntry) this.f3378g0.get(0);
            } else {
                this.f3375e0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f3377f0 = b(this.f3375e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f3375e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f3386y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f3386y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f3386y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(j4 j4Var) {
        Bitmap bitmap;
        if (j4Var != null && (bitmap = j4Var.f2945a) != null && !bitmap.isRecycled()) {
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
        g4 g4Var = this.f3376f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f3375e0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f3375e0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f3375e0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f3378g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f3375e0 = (MediaController.AlbumEntry) this.f3378g0.get(0);
                } else {
                    this.f3375e0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f3377f0 = b(this.f3375e0);
            this.f3379h0.clear();
            i();
            if (g4Var != null) {
                g4Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.f3371b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f3368a).getStoriesController().f48517w.f2684b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    r9 r9Var = (r9) obj;
                    if (!r9Var.f3574g && !r9Var.f3603w) {
                        arrayList2.add(r9Var);
                    }
                }
            }
            h();
            i();
            if (g4Var != null) {
                g4Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float g10 = g();
        int i10 = 0;
        if (g10 <= hc.b.g(32.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e);
        if (z10 != this.f3384w) {
            this.f3384w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f3384w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.f3385x;
        if (lVar != null) {
            lVar.setAlpha(e);
            if (e <= 0.0f) {
                i10 = 8;
            }
            if (lVar.getVisibility() != i10) {
                lVar.setVisibility(i10);
            }
        }
        l4 l4Var = this.f3380i0;
        if (l4Var != null) {
            l4Var.setAlpha(1.0f - e);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f3372c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f3375e0 = albumEntry;
        this.f3377f0 = b(albumEntry);
        this.f3379h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f3375e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f3386y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f3367j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f3376f.l();
        x3 x3Var = this.e;
        if (z10) {
            ii.o oVar = new ii.o(getContext(), 2);
            oVar.f41760a = 1;
            oVar.f10694p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            x3Var.w0(oVar);
            return;
        }
        x3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        j4 j4Var;
        if (this.f3369a0 != null) {
            ArrayList arrayList = this.f3379h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    w3 w3Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < w3Var.getChildCount()) {
                                    View childAt = w3Var.getChildAt(i11);
                                    if (childAt instanceof j4) {
                                        j4Var = (j4) childAt;
                                        if (j4Var.S == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    j4Var = null;
                                    break;
                                }
                            }
                            bitmap = d(j4Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f3369a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(w3Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        w3 w3Var = this.d;
        if (w3Var != null && w3Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < w3Var.getChildCount(); i11++) {
                View childAt = w3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (w3Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, w3Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f3375e0;
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
        c4 c4Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = c4Var.f18686b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f3378g0 = arrayList2;
        Collections.sort(arrayList2, new q3(arrayList, 0));
        ArrayList arrayList3 = this.f3371b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f3367j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f3378g0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f3378g0.isEmpty();
        TextView textView = this.f3386y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f3378g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f3378g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f3370b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f3370b);
                }
            }
            c4Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new n3(0, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f3378g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f3378g0.get(0) == this.f3375e0 && this.f3371b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f3373c0 = z10;
        if (z10 || (this.f3375e0 != f3367j0 && ((arrayList = this.f3378g0) == null || arrayList.isEmpty() || this.f3378g0.get(0) != this.f3375e0))) {
            z11 = false;
        }
        this.f3374d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int dp;
        ArrayList arrayList = this.f3379h0;
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
            em.q(scaleY.translationY(dp), wr.h, 320L);
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
                alpha2.translationY(f11).setInterpolator(wr.h).setDuration(320L).setListener(new ai.e(5, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f3368a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f3368a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        j4.f2943e0.clear();
        j4.f2944f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = j4.f2941c0;
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        w3 w3Var = this.d;
        w3Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
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
        w3Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
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
        layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i13 = AndroidUtilities.statusBarHeight;
        int dp7 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f3386y;
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
        this.f3369a0 = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
