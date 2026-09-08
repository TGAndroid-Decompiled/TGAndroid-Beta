package di;

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
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.zk0;
public abstract class x3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry f8389j0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable E;
    public final l3 F;
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
    public final int f8390a;
    public Utilities.Callback3 f8391a0;
    public final org.telegram.ui.ActionBar.f6 f8392b;
    public final ArrayList f8393b0;
    public final Paint f8394c;
    public boolean f8395c0;
    public final f3 d;
    public boolean f8396d0;
    public final g3 f8397e;
    public MediaController.AlbumEntry f8398e0;
    public final p3 f8399f;
    public ArrayList f8400f0;
    public ArrayList f8401g0;
    public final FrameLayout h;
    public final ArrayList f8402h0;
    public bi.g5 f8403i0;
    public final ll0 f8404n;
    public final m3 f8405r;
    public final xw0 f8406s;
    public final j4 v;
    public boolean f8407w;
    public final org.telegram.ui.ActionBar.k f8408x;
    public final TextView f8409y;

    public x3(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f7, boolean z11, boolean z12) {
        super(context);
        float f10;
        Paint paint = new Paint(1);
        this.f8394c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f8393b0 = arrayList;
        this.f8402h0 = new ArrayList();
        this.O = f7;
        this.f8390a = i10;
        this.f8392b = f6Var;
        this.L = z10;
        this.M = z11;
        this.P = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        f3 f3Var = new f3(this, context, f6Var);
        this.d = f3Var;
        f3Var.setItemSelectorColorProvider(new androidx.emoji2.text.w(29));
        p3 p3Var = new p3(this);
        this.f8399f = p3Var;
        f3Var.setAdapter(p3Var);
        g3 g3Var = new g3(this);
        this.f8397e = g3Var;
        f3Var.setLayoutManager(g3Var);
        f3Var.setFastScrollEnabled(1);
        f3Var.setFastScrollVisible(true);
        f3Var.getFastScroll().setAlpha(0.0f);
        g3Var.O = new h3(this);
        f3Var.i(new Object());
        f3Var.setClipToPadding(false);
        addView(f3Var, w7.x5.e(-1, -1, 119));
        f3Var.setOnItemClickListener(new zk0(this) {
            public final x3 f8541b;

            {
                this.f8541b = this;
            }

            @Override
            public final void a(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        x3 x3Var = this.f8541b;
                        ArrayList arrayList2 = x3Var.f8393b0;
                        ArrayList arrayList3 = x3Var.f8402h0;
                        if (i11 >= 2 && x3Var.W != null && (view instanceof s3)) {
                            s3 s3Var = (s3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (x3Var.f8395c0) {
                                if (i12 == 0) {
                                    x3Var.e(x3.f8389j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (x3Var.f8396d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    o8 o8Var = (o8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = x3Var.W;
                                    if (o8Var.K) {
                                        bitmap = x3.d(s3Var);
                                    }
                                    callback22.run(o8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < x3Var.f8400f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) x3Var.f8400f0.get(i12);
                                if (arrayList3.isEmpty() && !x3Var.Q) {
                                    Utilities.Callback2 callback23 = x3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = x3.d(s3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > x3Var.R) {
                                    int i13 = -x3Var.N;
                                    x3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(s3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(x3Var.d);
                                x3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        x3 x3Var2 = this.f8541b;
                        m3 m3Var = x3Var2.f8405r;
                        org.telegram.ui.ActionBar.v0 v0Var = x3Var2.G;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < m3Var.f8347c.size() && (callback2 = x3Var2.W) != null) {
                            callback2.run(m3Var.f8347c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        f3Var.setOnItemLongClickListener(new a1.c(this, 22));
        f3Var.setOnScrollListener(new j3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        this.f8408x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.B(436207615, false);
        kVar.C(-1, false);
        kVar.C(-1, true);
        addView(kVar, w7.x5.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new k3(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        l3 l3Var = new l3(this, context, n10, f6Var);
        this.F = l3Var;
        l3Var.setSubMenuOpenSide(1);
        if (AndroidUtilities.isTablet()) {
            f10 = 64.0f;
        } else {
            f10 = 56.0f;
        }
        kVar.addView(l3Var, 0, w7.x5.d(-2, -1.0f, 51, f10, 0.0f, 40.0f, 0.0f));
        l3Var.setOnClickListener(new View.OnClickListener(this) {
            public final x3 f6928b;

            {
                this.f6928b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f6928b.F.M(null, null);
                        return;
                    case 1:
                        x3 x3Var = this.f6928b;
                        if (x3Var.I.getAlpha() >= 0.25f) {
                            x3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        x3 x3Var2 = this.f6928b;
                        if (x3Var2.I.getAlpha() >= 0.25f) {
                            x3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f6928b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f8409y = textView;
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
        l3Var.addView(textView, w7.x5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        ll0 ll0Var = new ll0(context, f6Var);
        this.f8404n = ll0Var;
        ll0Var.setLayoutManager(new s4.s(3));
        m3 m3Var = new m3(this);
        this.f8405r = m3Var;
        ll0Var.setAdapter(m3Var);
        ll0Var.setOnScrollListener(new n3(this));
        ll0Var.setClipToPadding(true);
        ll0Var.i(new Object());
        frameLayout.addView(ll0Var, w7.x5.e(-1, -1, 119));
        t00 t00Var = new t00(context, f6Var);
        t00Var.setViewType(2);
        t00Var.setAlpha(0.0f);
        t00Var.setVisibility(8);
        frameLayout.addView(t00Var, w7.x5.e(-1, -1, 119));
        xw0 xw0Var = new xw0(context, t00Var, 11, f6Var);
        this.f8406s = xw0Var;
        wh.p pVar = xw0Var.d;
        pVar.setTextSize(1, 16.0f);
        pVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f21069y6, f6Var));
        pVar.setTypeface(null);
        pVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new j4(this, false, new bi.o1(this, 9));
        frameLayout.addView(xw0Var, w7.x5.e(-1, -1, 119));
        ll0Var.setEmptyView(xw0Var);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new e3(this);
        this.G = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        ll0Var.setOnItemClickListener(new zk0(this) {
            public final x3 f8541b;

            {
                this.f8541b = this;
            }

            @Override
            public final void a(int i11, View view) {
                Utilities.Callback2 callback2;
                switch (r2) {
                    case 0:
                        x3 x3Var = this.f8541b;
                        ArrayList arrayList2 = x3Var.f8393b0;
                        ArrayList arrayList3 = x3Var.f8402h0;
                        if (i11 >= 2 && x3Var.W != null && (view instanceof s3)) {
                            s3 s3Var = (s3) view;
                            int i12 = i11 - 2;
                            Bitmap bitmap = null;
                            if (x3Var.f8395c0) {
                                if (i12 == 0) {
                                    x3Var.e(x3.f8389j0, true);
                                    return;
                                }
                                i12 = i11 - 3;
                            } else if (x3Var.f8396d0) {
                                if (i12 >= 0 && i12 < arrayList2.size()) {
                                    o8 o8Var = (o8) arrayList2.get(i12);
                                    Utilities.Callback2 callback22 = x3Var.W;
                                    if (o8Var.K) {
                                        bitmap = x3.d(s3Var);
                                    }
                                    callback22.run(o8Var, bitmap);
                                    return;
                                }
                                i12 -= arrayList2.size();
                            }
                            if (i12 >= 0 && i12 < x3Var.f8400f0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) x3Var.f8400f0.get(i12);
                                if (arrayList3.isEmpty() && !x3Var.Q) {
                                    Utilities.Callback2 callback23 = x3Var.W;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmap = x3.d(s3Var);
                                    }
                                    callback23.run(photoEntry, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(photoEntry)) {
                                    arrayList3.remove(photoEntry);
                                } else if (arrayList3.size() + 1 > x3Var.R) {
                                    int i13 = -x3Var.N;
                                    x3Var.N = i13;
                                    AndroidUtilities.shakeViewSpring(s3Var, i13);
                                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    return;
                                } else {
                                    arrayList3.add(photoEntry);
                                }
                                AndroidUtilities.updateVisibleRows(x3Var.d);
                                x3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        x3 x3Var2 = this.f8541b;
                        m3 m3Var2 = x3Var2.f8405r;
                        org.telegram.ui.ActionBar.v0 v0Var = x3Var2.G;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i11 >= 0 && i11 < m3Var2.f8347c.size() && (callback2 = x3Var2.W) != null) {
                            callback2.run(m3Var2.f8347c.get(i11), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f3851w.f6963b;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                o8 o8Var = (o8) obj;
                if (!o8Var.f7784g && !o8Var.f7813w) {
                    this.f8393b0.add(o8Var);
                }
            }
        }
        if (z11) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20761h5, f6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, w7.x5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d g10 = wl.g(24, context, f6Var, true);
            this.J = g10;
            g10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, w7.x5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final x3 f6928b;

                    {
                        this.f6928b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f6928b.F.M(null, null);
                                return;
                            case 1:
                                x3 x3Var = this.f6928b;
                                if (x3Var.I.getAlpha() >= 0.25f) {
                                    x3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                x3 x3Var2 = this.f6928b;
                                if (x3Var2.I.getAlpha() >= 0.25f) {
                                    x3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f6928b.f(false);
                                return;
                        }
                    }
                });
            }
            d g11 = wl.g(24, context, f6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            nq nqVar = new nq(R.drawable.mini_collage, 0);
            nqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            g11.g(spannableStringBuilder, false, true);
            linearLayout.addView(g11, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final x3 f6928b;

                {
                    this.f6928b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f6928b.F.M(null, null);
                            return;
                        case 1:
                            x3 x3Var = this.f6928b;
                            if (x3Var.I.getAlpha() >= 0.25f) {
                                x3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            x3 x3Var2 = this.f6928b;
                            if (x3Var2.I.getAlpha() >= 0.25f) {
                                x3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f6928b.f(false);
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
            w7.z5.b(imageView, 0.1f, 1.5f);
            addView(imageView, w7.x5.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final x3 f6928b;

                {
                    this.f6928b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f6928b.F.M(null, null);
                            return;
                        case 1:
                            x3 x3Var = this.f6928b;
                            if (x3Var.I.getAlpha() >= 0.25f) {
                                x3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            x3 x3Var2 = this.f6928b;
                            if (x3Var2.I.getAlpha() >= 0.25f) {
                                x3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f6928b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f8389j0;
        if (albumEntry != null && (albumEntry != albumEntry2 || this.f8393b0.size() > 0)) {
            this.f8398e0 = albumEntry;
        } else {
            ArrayList arrayList3 = this.f8401g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f8398e0 = (MediaController.AlbumEntry) this.f8401g0.get(0);
            } else {
                this.f8398e0 = MediaController.allMediaAlbumEntry;
            }
        }
        this.f8400f0 = b(this.f8398e0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f8398e0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f8409y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f8409y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f8409y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(s3 s3Var) {
        Bitmap bitmap;
        if (s3Var != null && (bitmap = s3Var.f8134a) != null && !bitmap.isRecycled()) {
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
        p3 p3Var = this.f8399f;
        int i13 = 0;
        if (i10 == i12) {
            h();
            if (this.f8398e0 != null) {
                while (true) {
                    if (i13 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                    int i14 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f8398e0;
                    if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f8398e0 = albumEntry;
                        break;
                    }
                    i13++;
                }
            } else {
                ArrayList arrayList = this.f8401g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f8398e0 = (MediaController.AlbumEntry) this.f8401g0.get(0);
                } else {
                    this.f8398e0 = MediaController.allMediaAlbumEntry;
                }
            }
            this.f8400f0 = b(this.f8398e0);
            this.f8402h0.clear();
            i();
            if (p3Var != null) {
                p3Var.l();
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            ArrayList arrayList2 = this.f8393b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = MessagesController.getInstance(this.f8390a).getStoriesController().f3851w.f6963b;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    o8 o8Var = (o8) obj;
                    if (!o8Var.f7784g && !o8Var.f7813w) {
                        arrayList2.add(o8Var);
                    }
                }
            }
            h();
            i();
            if (p3Var != null) {
                p3Var.l();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
        float g10 = g();
        int i10 = 0;
        if (g10 <= i2.g.f(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e7 = this.S.e(z10);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e7);
        if (z10 != this.f8407w) {
            this.f8407w = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f8407w) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate.alpha(f7).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f8408x;
        if (kVar != null) {
            kVar.setAlpha(e7);
            if (e7 <= 0.0f) {
                i10 = 8;
            }
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        bi.g5 g5Var = this.f8403i0;
        if (g5Var != null) {
            g5Var.setAlpha(1.0f - e7);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f8394c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f8398e0 = albumEntry;
        this.f8400f0 = b(albumEntry);
        this.f8402h0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f8398e0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f8409y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f8389j0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f8399f.l();
        g3 g3Var = this.f8397e;
        if (z10) {
            ki.p pVar = new ki.p(getContext(), 2);
            pVar.f45934a = 1;
            pVar.f15068p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            g3Var.w0(pVar);
            return;
        }
        g3Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        s3 s3Var;
        if (this.f8391a0 != null) {
            ArrayList arrayList = this.f8402h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.run((MediaController.PhotoEntry) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    f3 f3Var = this.d;
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                            int i11 = 0;
                            while (true) {
                                if (i11 < f3Var.getChildCount()) {
                                    View childAt = f3Var.getChildAt(i11);
                                    if (childAt instanceof s3) {
                                        s3Var = (s3) childAt;
                                        if (s3Var.S == photoEntry) {
                                            break;
                                        }
                                    }
                                    i11++;
                                } else {
                                    s3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(s3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f8391a0.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        AndroidUtilities.updateVisibleRows(f3Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        f3 f3Var = this.d;
        if (f3Var != null && f3Var.getChildCount() > 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < f3Var.getChildCount(); i11++) {
                View childAt = f3Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        } else {
            padding = getPadding();
        }
        if (f3Var == null) {
            return padding;
        }
        return AndroidUtilities.lerp(0, padding, f3Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f8398e0;
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
        l3 l3Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = l3Var.f21405b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f8401g0 = arrayList2;
        Collections.sort(arrayList2, new bi.l7(arrayList, 1));
        ArrayList arrayList3 = this.f8393b0;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f8389j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f8401g0;
            arrayList4.add(!arrayList4.isEmpty(), albumEntry);
        }
        boolean isEmpty2 = this.f8401g0.isEmpty();
        TextView textView = this.f8409y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f8401g0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f8401g0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f8392b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.f8392b);
                }
            }
            l3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.u1(4, this, albumEntry2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f8401g0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f8401g0.get(0) == this.f8398e0 && this.f8393b0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8395c0 = z10;
        if (z10 || (this.f8398e0 != f8389j0 && ((arrayList = this.f8401g0) == null || arrayList.isEmpty() || this.f8401g0.get(0) != this.f8398e0))) {
            z11 = false;
        }
        this.f8396d0 = z11;
    }

    public final void j() {
        float f7;
        float f10;
        int dp;
        ArrayList arrayList = this.f8402h0;
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
            wl.q(scaleY.translationY(dp), pr.h, 320L);
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
                alpha2.translationY(f11).setInterpolator(pr.h).setDuration(320L).setListener(new ah.q0(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f8390a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f8390a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        s3.f8132e0.clear();
        s3.f8133f0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = s3.f8130c0;
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
        f3 f3Var = this.d;
        f3Var.setPinnedSectionOffsetY(currentActionBarHeight);
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
        f3Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
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
        TextView textView = this.f8409y;
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
        this.f8391a0 = callback3;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
