package lh;

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
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.zk0;

public abstract class p3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {

    public static final MediaController.AlbumEntry f16506f0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable A;
    public final e3 B;
    public final org.telegram.ui.ActionBar.v0 C;
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
    public final org.telegram.ui.Components.y5 O;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public Utilities.Callback2 S;
    public Utilities.Callback3 T;
    public final ArrayList U;
    public boolean V;
    public boolean W;

    public final int f16507a;

    public MediaController.AlbumEntry f16508a0;

    public final org.telegram.ui.ActionBar.c6 f16509b;

    public ArrayList f16510b0;

    public final Paint f16511c;

    public ArrayList f16512c0;
    public final y2 d;

    public final ArrayList f16513d0;

    public final z2 f16514e;

    public ag.d f16515e0;

    public final i3 f16516f;
    public final FrameLayout h;

    public final zk0 f16517n;

    public final f3 f16518r;

    public final iw0 f16519s;
    public final a4 v;

    public boolean f16520w;

    public final org.telegram.ui.ActionBar.k f16521x;

    public final TextView f16522y;

    public p3(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, MediaController.AlbumEntry albumEntry, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        Paint paint = new Paint(1);
        this.f16511c = paint;
        this.J = -2;
        this.O = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        this.Q = true;
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.f16513d0 = new ArrayList();
        this.K = f10;
        this.f16507a = i10;
        this.f16509b = c6Var;
        this.H = z10;
        this.I = z11;
        this.L = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        y2 y2Var = new y2(this, context, c6Var);
        this.d = y2Var;
        y2Var.setItemSelectorColorProvider(new ia.l(22));
        i3 i3Var = new i3(this);
        this.f16516f = i3Var;
        y2Var.setAdapter(i3Var);
        z2 z2Var = new z2(this);
        this.f16514e = z2Var;
        y2Var.setLayoutManager(z2Var);
        y2Var.setFastScrollEnabled(1);
        y2Var.setFastScrollVisible(true);
        y2Var.getFastScroll().setAlpha(0.0f);
        z2Var.O = new a3(this);
        y2Var.i(new b3());
        y2Var.setClipToPadding(false);
        addView(y2Var, h7.z5.e(-1, -1, 119));
        final int i11 = 0;
        y2Var.setOnItemClickListener(new pk0(this) {

            public final p3 f16722b;

            {
                this.f16722b = this;
            }

            @Override
            public final void a(int i12, View view) {
                Utilities.Callback2 callback2;
                switch (i11) {
                    case 0:
                        p3 p3Var = this.f16722b;
                        ArrayList arrayList2 = p3Var.U;
                        ArrayList arrayList3 = p3Var.f16513d0;
                        if (i12 >= 2 && p3Var.S != null && (view instanceof l3)) {
                            l3 l3Var = (l3) view;
                            int size = i12 - 2;
                            Bitmap bitmapD = null;
                            if (!p3Var.V) {
                                if (p3Var.W) {
                                    if (size >= 0 && size < arrayList2.size()) {
                                        z7 z7Var = (z7) arrayList2.get(size);
                                        p3Var.S.run(z7Var, z7Var.K ? p3.d(l3Var) : null);
                                    } else {
                                        size -= arrayList2.size();
                                    }
                                }
                            } else if (size == 0) {
                                p3Var.e(p3.f16506f0, true);
                            } else {
                                size = i12 - 3;
                            }
                            if (size >= 0 && size < p3Var.f16510b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.f16510b0.get(size);
                                if (arrayList3.isEmpty() && !p3Var.M) {
                                    Utilities.Callback2 callback3 = p3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmapD = p3.d(l3Var);
                                    }
                                    callback3.run(photoEntry, bitmapD);
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > p3Var.N) {
                                        int i13 = -p3Var.J;
                                        p3Var.J = i13;
                                        AndroidUtilities.shakeViewSpring(l3Var, i13);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(p3Var.d);
                                    p3Var.j();
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    default:
                        p3 p3Var2 = this.f16722b;
                        f3 f3Var = p3Var2.f16518r;
                        org.telegram.ui.ActionBar.v0 v0Var = p3Var2.C;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < f3Var.f16470c.size() && (callback2 = p3Var2.S) != null) {
                            callback2.run(f3Var.f16470c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        y2Var.setOnItemLongClickListener(new p(this, 2));
        y2Var.setOnScrollListener(new c3(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, c6Var);
        this.f16521x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.C(436207615, false);
        kVar.D(-1, false);
        kVar.D(-1, true);
        addView(kVar, h7.z5.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new d3(this));
        org.telegram.ui.ActionBar.z zVarN = kVar.n();
        e3 e3Var = new e3(this, context, zVarN, c6Var);
        this.B = e3Var;
        e3Var.setSubMenuOpenSide(1);
        kVar.addView(e3Var, 0, h7.z5.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i12 = 0;
        e3Var.setOnClickListener(new View.OnClickListener(this) {

            public final p3 f16843b;

            {
                this.f16843b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f16843b.B.M(null, null);
                        break;
                    case 1:
                        p3 p3Var = this.f16843b;
                        if (p3Var.E.getAlpha() >= 0.25f) {
                            p3Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        p3 p3Var2 = this.f16843b;
                        if (p3Var2.E.getAlpha() >= 0.25f) {
                            p3Var2.f(true);
                            break;
                        }
                        break;
                    default:
                        this.f16843b.f(false);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.f16522y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.A = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        e3Var.addView(textView, h7.z5.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        zk0 zk0Var = new zk0(context, c6Var);
        this.f16517n = zk0Var;
        zk0Var.setLayoutManager(new f2.x(3));
        f3 f3Var = new f3(this);
        this.f16518r = f3Var;
        zk0Var.setAdapter(f3Var);
        zk0Var.setOnScrollListener(new g3(this));
        zk0Var.setClipToPadding(true);
        zk0Var.i(new u2());
        frameLayout.addView(zk0Var, h7.z5.e(-1, -1, 119));
        v2 v2Var = new v2(context, c6Var);
        v2Var.setViewType(2);
        v2Var.setAlpha(0.0f);
        v2Var.setVisibility(8);
        frameLayout.addView(v2Var, h7.z5.e(-1, -1, 119));
        iw0 iw0Var = new iw0(context, v2Var, 11, c6Var);
        this.f16519s = iw0Var;
        eh.s sVar = iw0Var.d;
        sVar.setTextSize(1, 16.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
        sVar.setTypeface(null);
        sVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new a4(this, false, new ag.n0(this, 28));
        frameLayout.addView(iw0Var, h7.z5.e(-1, -1, 119));
        zk0Var.setEmptyView(iw0Var);
        org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new x2(this);
        this.C = v0VarA;
        v0VarA.setVisibility(8);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i13 = 1;
        zk0Var.setOnItemClickListener(new pk0(this) {

            public final p3 f16722b;

            {
                this.f16722b = this;
            }

            @Override
            public final void a(int i14, View view) {
                Utilities.Callback2 callback2;
                switch (i13) {
                    case 0:
                        p3 p3Var = this.f16722b;
                        ArrayList arrayList2 = p3Var.U;
                        ArrayList arrayList3 = p3Var.f16513d0;
                        if (i14 >= 2 && p3Var.S != null && (view instanceof l3)) {
                            l3 l3Var = (l3) view;
                            int size = i14 - 2;
                            Bitmap bitmapD = null;
                            if (!p3Var.V) {
                                if (p3Var.W) {
                                    if (size >= 0 && size < arrayList2.size()) {
                                        z7 z7Var = (z7) arrayList2.get(size);
                                        p3Var.S.run(z7Var, z7Var.K ? p3.d(l3Var) : null);
                                    } else {
                                        size -= arrayList2.size();
                                    }
                                }
                            } else if (size == 0) {
                                p3Var.e(p3.f16506f0, true);
                            } else {
                                size = i14 - 3;
                            }
                            if (size >= 0 && size < p3Var.f16510b0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) p3Var.f16510b0.get(size);
                                if (arrayList3.isEmpty() && !p3Var.M) {
                                    Utilities.Callback2 callback3 = p3Var.S;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        bitmapD = p3.d(l3Var);
                                    }
                                    callback3.run(photoEntry, bitmapD);
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > p3Var.N) {
                                        int i15 = -p3Var.J;
                                        p3Var.J = i15;
                                        AndroidUtilities.shakeViewSpring(l3Var, i15);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(p3Var.d);
                                    p3Var.j();
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    default:
                        p3 p3Var2 = this.f16722b;
                        f3 f3Var2 = p3Var2.f16518r;
                        org.telegram.ui.ActionBar.v0 v0Var = p3Var2.C;
                        if (v0Var != null) {
                            AndroidUtilities.hideKeyboard(v0Var.getSearchContainer());
                        }
                        if (i14 >= 0 && i14 < f3Var2.f16470c.size() && (callback2 = p3Var2.S) != null) {
                            callback2.run(f3Var2.f16470c.get(i14), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().f13974w.f15625b;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                z7 z7Var = (z7) obj;
                if (!z7Var.f17209g && !z7Var.f17238w) {
                    this.U.add(z7Var);
                }
            }
        }
        if (z11) {
            this.D = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.E = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, c6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, h7.z5.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d dVarG = rl.g(24, context, c6Var, true);
            this.F = dVarG;
            dVarG.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(dVarG, h7.z5.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                final int i15 = 1;
                dVarG.setOnClickListener(new View.OnClickListener(this) {

                    public final p3 f16843b;

                    {
                        this.f16843b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.f16843b.B.M(null, null);
                                break;
                            case 1:
                                p3 p3Var = this.f16843b;
                                if (p3Var.E.getAlpha() >= 0.25f) {
                                    p3Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                p3 p3Var2 = this.f16843b;
                                if (p3Var2.E.getAlpha() >= 0.25f) {
                                    p3Var2.f(true);
                                    break;
                                }
                                break;
                            default:
                                this.f16843b.f(false);
                                break;
                        }
                    }
                });
            }
            d dVarG2 = rl.g(24, context, c6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            cq cqVar = new cq(R.drawable.mini_collage, 0);
            cqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            dVarG2.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVarG2, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            dVarG2.setOnClickListener(new View.OnClickListener(this) {

                public final p3 f16843b;

                {
                    this.f16843b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.f16843b.B.M(null, null);
                            break;
                        case 1:
                            p3 p3Var = this.f16843b;
                            if (p3Var.E.getAlpha() >= 0.25f) {
                                p3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            p3 p3Var2 = this.f16843b;
                            if (p3Var2.E.getAlpha() >= 0.25f) {
                                p3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.f16843b.f(false);
                            break;
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
            h7.b6.b(imageView, 0.1f, 1.5f);
            addView(imageView, h7.z5.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) {

                public final p3 f16843b;

                {
                    this.f16843b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.f16843b.B.M(null, null);
                            break;
                        case 1:
                            p3 p3Var = this.f16843b;
                            if (p3Var.E.getAlpha() >= 0.25f) {
                                p3Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            p3 p3Var2 = this.f16843b;
                            if (p3Var2.E.getAlpha() >= 0.25f) {
                                p3Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.f16843b.f(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = f16506f0;
        if (albumEntry == null || (albumEntry == albumEntry2 && this.U.size() <= 0)) {
            ArrayList arrayList3 = this.f16512c0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f16508a0 = MediaController.allMediaAlbumEntry;
            } else {
                this.f16508a0 = (MediaController.AlbumEntry) this.f16512c0.get(0);
            }
        } else {
            this.f16508a0 = albumEntry;
        }
        this.f16510b0 = b(this.f16508a0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.f16508a0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.f16522y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.f16522y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.f16522y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(l3 l3Var) {
        Bitmap bitmap;
        if (l3Var == null || (bitmap = l3Var.f16297a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
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
        i3 i3Var = this.f16516f;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == NotificationCenter.storiesDraftsUpdated) {
                ArrayList arrayList = this.U;
                arrayList.clear();
                if (!this.H) {
                    ArrayList arrayList2 = MessagesController.getInstance(this.f16507a).getStoriesController().f13974w.f15625b;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        z7 z7Var = (z7) obj;
                        if (!z7Var.f17209g && !z7Var.f17238w) {
                            arrayList.add(z7Var);
                        }
                    }
                }
                h();
                i();
                if (i3Var != null) {
                    i3Var.l();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.f16508a0 != null) {
            while (i13 < MediaController.allMediaAlbums.size()) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                int i14 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.f16508a0;
                if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.f16508a0 = albumEntry;
                    break;
                }
                i13++;
            }
        } else {
            ArrayList arrayList3 = this.f16512c0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.f16508a0 = MediaController.allMediaAlbumEntry;
            } else {
                this.f16508a0 = (MediaController.AlbumEntry) this.f16512c0.get(0);
            }
        }
        this.f16510b0 = b(this.f16508a0);
        this.f16513d0.clear();
        i();
        if (i3Var != null) {
            i3Var.l();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float fG = g();
        boolean z10 = fG <= ((float) i0.a.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float fE = this.O.e(z10);
        float fLerp = AndroidUtilities.lerp(fG, 0.0f, fE);
        if (z10 != this.f16520w) {
            this.f16520w = z10;
            c(z10);
            this.d.getFastScroll().animate().alpha(this.f16520w ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f16521x;
        if (kVar != null) {
            kVar.setAlpha(fE);
            int i10 = fE <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        ag.d dVar = this.f16515e0;
        if (dVar != null) {
            dVar.setAlpha(1.0f - fE);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, fLerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.f16511c);
        canvas.save();
        canvas.clipRect(0.0f, fLerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z10) {
        this.f16508a0 = albumEntry;
        this.f16510b0 = b(albumEntry);
        this.f16513d0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.f16508a0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.f16522y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == f16506f0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f16516f.l();
        z2 z2Var = this.f16514e;
        if (!z10) {
            z2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        sh.n nVar = new sh.n(getContext(), 2);
        nVar.f5731a = 1;
        nVar.f47990p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        z2Var.w0(nVar);
    }

    public final void f(boolean z10) {
        Bitmap bitmapD;
        l3 l3Var;
        if (this.T == null) {
            return;
        }
        ArrayList arrayList = this.f16513d0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.S.run((MediaController.PhotoEntry) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            y2 y2Var = this.d;
            if (i10 >= size) {
                this.T.run(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(y2Var);
                j();
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                bitmapD = null;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= y2Var.getChildCount()) {
                        l3Var = null;
                        break;
                    }
                    View childAt = y2Var.getChildAt(i11);
                    if (childAt instanceof l3) {
                        l3Var = (l3) childAt;
                        if (l3Var.O == photoEntry) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmapD = d(l3Var);
            }
            arrayList2.add(bitmapD);
        }
    }

    public final int g() {
        int padding;
        y2 y2Var = this.d;
        if (y2Var == null || y2Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int iMin = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < y2Var.getChildCount(); i10++) {
                View childAt = y2Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    iMin = Math.min(iMin, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(iMin, getHeight()));
        }
        return y2Var == null ? padding : AndroidUtilities.lerp(0, padding, y2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.f16508a0;
    }

    public String getTitle() {
        return LocaleController.getString(this.H ? R.string.AddImage : R.string.ChoosePhotoOrVideo);
    }

    public final void h() {
        a aVar;
        e3 e3Var = this.B;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = e3Var.f23854b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f16512c0 = arrayList2;
        Collections.sort(arrayList2, new ag.h(arrayList, 4));
        ArrayList arrayList3 = this.U;
        boolean zIsEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = f16506f0;
        if (!zIsEmpty) {
            ArrayList arrayList4 = this.f16512c0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, albumEntry);
        }
        boolean zIsEmpty2 = this.f16512c0.isEmpty();
        TextView textView = this.f16522y;
        if (zIsEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A, (Drawable) null);
        int size = this.f16512c0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.f16512c0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.f16509b);
            } else {
                ArrayList arrayListB = b(albumEntry2);
                if (!arrayListB.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, arrayListB.size(), this.f16509b);
                }
            }
            e3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ag.q0(26, this, albumEntry2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f16512c0;
        boolean z10 = true;
        boolean z11 = arrayList2 != null && !arrayList2.isEmpty() && this.f16512c0.get(0) == this.f16508a0 && this.U.size() > 2;
        this.V = z11;
        if (z11 || (this.f16508a0 != f16506f0 && ((arrayList = this.f16512c0) == null || arrayList.isEmpty() || this.f16512c0.get(0) != this.f16508a0))) {
            z10 = false;
        }
        this.W = z10;
    }

    public final void j() {
        ArrayList arrayList = this.f16513d0;
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z10 = !zIsEmpty;
        ImageView imageView = this.D;
        if (imageView != null) {
            rl.o(imageView.animate().alpha(!zIsEmpty ? 1.0f : 0.0f).scaleX(!zIsEmpty ? 1.0f : 0.7f).scaleY(zIsEmpty ? 0.7f : 1.0f).translationY(!zIsEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), er.h, 320L);
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null) {
            d dVar = this.F;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.P != z10) {
                this.P = z10;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(zIsEmpty ? 0.0f : 1.0f).translationY(zIsEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(er.h).setDuration(320L).setListener(new ag.x(12, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f16507a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.f16507a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        l3.f16295a0.clear();
        l3.f16296b0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = l3.V;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        y2 y2Var = this.d;
        y2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int iDp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int iDp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.E;
        if (linearLayout == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        y2Var.setPadding(iDp2, currentActionBarHeight2, iDp3, iDp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.D;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        int iDp4 = AndroidUtilities.dp(10.0f);
        TextView textView = this.f16522y;
        textView.setPadding(0, i12, iDp4, 0);
        if (AndroidUtilities.isTablet()) {
            f10 = 20.0f;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f10 = 18.0f;
            } else {
                f10 = 20.0f;
            }
        }
        textView.setTextSize(f10);
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
