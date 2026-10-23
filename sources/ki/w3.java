package ki;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Map;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tm0;
public final class w3 extends j71 {
    public static final ArrayList f15645t4 = new ArrayList();
    public boolean A3;
    public boolean B3;
    public boolean C3;
    public boolean D3;
    public TL_iv.pageTableCell E3;
    public TL_iv.pageTableCell F3;
    public long G3;
    public float H3;
    public float I3;
    public boolean J3;
    public h2 K3;
    public int L3;
    public h1 M3;
    public final i N3;
    public ArrayList O3;
    public int P3;
    public int Q3;
    public int R3;
    public boolean S3;
    public a T3;
    public boolean U3;
    public final o3 V3;
    public final s2 W3;
    public final p3 X3;
    public final q3 Y3;
    public final r3 Z3;
    public final IdentityHashMap f15646a4;
    public final IdentityHashMap f15647b4;
    public a f15648c4;
    public a f15649d4;
    public final s3 f15650e4;
    public final a3 f15651f4;
    public final int f15652g3;
    public final b3 f15653g4;
    public final org.telegram.ui.ActionBar.g6 f15654h3;
    public final c3 f15655h4;
    public final u3 f15656i3;
    public final d3 f15657i4;
    public MessageObject f15658j3;
    public o5 f15659j4;
    public boolean f15660k3;
    public j80 f15661k4;
    public TL_iv.RichMessage f15662l3;
    public int l4;
    public final ArrayList f15663m3;
    public int f15664m4;
    public final HashMap f15665n3;
    public final t2 f15666n4;
    public final j3 f15667o3;
    public final e3 f15668o4;
    public final aa f15669p3;
    public final k2.w0 f15670p4;
    public int f15671q3;
    public final ArrayList f15672q4;
    public int f15673r3;
    public tm0 f15674r4;
    public int f15675s3;
    public int f15676s4;
    public boolean f15677t3;
    public float f15678u3;
    public float f15679v3;
    public float f15680w3;
    public float f15681x3;
    public View y3;
    public b f15682z3;

    public w3(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, u3 u3Var) {
        super(context, i10, 0, false, new hg.o(r1, 15), new j5.b(r1, 5), null, g6Var);
        this.f15660k3 = true;
        this.f15663m3 = new ArrayList();
        this.f15665n3 = new HashMap();
        this.f15671q3 = -1;
        this.f15673r3 = -1;
        this.f15675s3 = 0;
        this.N3 = new i(this, 2);
        this.S3 = true;
        this.V3 = new o3(this);
        this.W3 = new s2(this);
        this.X3 = new p3(this);
        this.Y3 = new q3(this);
        this.Z3 = new r3(this);
        this.f15646a4 = new IdentityHashMap();
        this.f15647b4 = new IdentityHashMap();
        this.f15650e4 = new s3(this);
        this.f15651f4 = new a3(this);
        this.f15653g4 = new b3(this);
        this.f15655h4 = new c3(this);
        this.f15657i4 = new d3(this);
        this.l4 = -1;
        this.f15664m4 = -1;
        this.f15666n4 = new t2(this);
        this.f15668o4 = new e3(this);
        k2.w0 w0Var = new k2.w0(this, 2);
        this.f15670p4 = w0Var;
        this.f15672q4 = new ArrayList();
        this.f15676s4 = -1;
        w3[] w3VarArr = {this};
        this.f15652g3 = i10;
        this.f15654h3 = g6Var;
        this.f15656i3 = u3Var;
        this.Z2.f24972r = false;
        setClipToPadding(false);
        setClipChildren(false);
        H1(new hg.o(this, 16), false);
        setReorderLongPressEnabled(false);
        C1(true);
        j3 j3Var = new j3(this, u3Var);
        this.f15667o3 = j3Var;
        j3Var.S(this);
        j3Var.f22871z0 = this.Y2;
        aa n10 = j3Var.n(context);
        this.f15669p3 = n10;
        AndroidUtilities.removeFromParent(n10);
        j3Var.D = new l3(this, u3Var);
        j(new m3(0, this, u3Var));
        this.K3 = new h2(w0Var);
    }

    public static boolean B3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int C2(int i10) {
        if (i10 == 4) {
            return 114971;
        }
        if (i10 == 16384) {
            return 32772;
        }
        if (i10 != 32768) {
            return 4;
        }
        return 16388;
    }

    public static boolean D3(a aVar) {
        if (aVar != null && (aVar.f15141b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || K3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !c6.y(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean G3(TL_iv.PageBlock pageBlock) {
        if (!K3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean H3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean I3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean J3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !H3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean K3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean L3(a aVar) {
        if (aVar != null && !aVar.f15145i && !D3(aVar) && (aVar.f15141b instanceof TL_iv.pageBlockParagraph) && aVar.f15142c == 0 && aVar.d == 0 && !aVar.e && aVar.f15147k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void O1(ki.w3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.b71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.O1(ki.w3[], java.util.ArrayList, org.telegram.ui.Components.b71):void");
    }

    public static void P2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f15141b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            t tVar = aVar.f15144g;
            if (tVar != null && tVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f15141b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f15141b.caption.text = new TL_iv.textEmpty();
                        aVar.f15141b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f15141b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            t tVar2 = aVar.f15144g;
            if (tVar2 != null && tVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f15141b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f15141b.caption.text = new TL_iv.textEmpty();
                        aVar.f15141b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f15141b);
                }
            }
        } else if (H3(pageBlock)) {
            ArrayList m32 = m3(aVar.f15141b);
            List W3 = W3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; m32 != null && i12 < m32.size() && i12 < W3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) m32.get(i12);
                if (((t) W3.get(i12)).b()) {
                    if (pageBlock4 instanceof TL_iv.pageBlockPhoto) {
                        j10 = ((TL_iv.pageBlockPhoto) pageBlock4).photo_id;
                    } else if (pageBlock4 instanceof TL_iv.pageBlockVideo) {
                        j10 = ((TL_iv.pageBlockVideo) pageBlock4).video_id;
                    } else {
                        j10 = 0;
                    }
                    if (j10 != 0) {
                        k0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f15141b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f15141b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f15141b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                k0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f15141b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                t tVar3 = aVar.f15144g;
                if (tVar3 != null && tVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f15141b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f15141b.caption.text = new TL_iv.textEmpty();
                            aVar.f15141b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f15141b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                t tVar4 = aVar.f15144g;
                if (tVar4 != null && (document = tVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f20349id;
                }
                if (tVar4 != null && tVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f15141b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        k0.d(pageBlock7);
                        arrayList.add(aVar.f15141b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMap) {
                TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) pageBlock5;
                int i13 = o4.M;
                if (pageblockmap.geo instanceof TLRPC.TL_geoPoint) {
                    if (pageblockmap.caption == null) {
                        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
                        pageblockmap.caption = pageCaption;
                        pageCaption.text = new TL_iv.textEmpty();
                        pageblockmap.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(pageblockmap);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockMath) {
                if (!TextUtils.isEmpty(((TL_iv.pageBlockMath) pageBlock5).source)) {
                    arrayList.add(aVar.f15141b);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock5;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                if (pageblocktable.rows != null) {
                    for (int i14 = 0; i14 < pageblocktable.rows.size(); i14++) {
                        TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i14);
                        if (pagetablerow.cells != null) {
                            for (int i15 = 0; i15 < pagetablerow.cells.size(); i15++) {
                                TL_iv.pageTableCell pagetablecell = pagetablerow.cells.get(i15);
                                if (pagetablecell.text == null) {
                                    g6.c(pagetablecell, "");
                                } else {
                                    pagetablecell.flags |= 128;
                                }
                                if (pagetablecell.colspan > 1) {
                                    i10 = pagetablecell.flags | 2;
                                } else {
                                    i10 = pagetablecell.flags & (-3);
                                }
                                pagetablecell.flags = i10;
                                if (pagetablecell.rowspan > 1) {
                                    i11 = pagetablecell.flags | 4;
                                } else {
                                    i11 = pagetablecell.flags & (-5);
                                }
                                pagetablecell.flags = i11;
                            }
                        }
                    }
                }
                if (U4(pageblocktable)) {
                    arrayList.add(pageblocktable);
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockButtonRow) {
                TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock5;
                ArrayList<TL_keyboard.PageButton> arrayList3 = pageblockbuttonrow.buttons;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    arrayList.add(pageblockbuttonrow);
                }
            } else {
                arrayList.add(pageBlock5);
            }
        }
    }

    public static void Q1(w3 w3Var, int i10, int i11, int i12) {
        h1 editText;
        if (i10 >= 0) {
            View m10 = w3Var.Y2.m(i10);
            if (m10 instanceof c6) {
                c6 c6Var = (c6) m10;
                if (i11 == 1 && c6Var.m()) {
                    editText = c6Var.getAuthorEditText();
                } else {
                    editText = c6Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof o5) {
                o5 o5Var = (o5) m10;
                h1 k10 = o5Var.k(i11);
                if (k10 == null) {
                    k10 = o5Var.k(0);
                }
                if (k10 != null) {
                    k10.s();
                    k10.setSelection(Math.max(0, Math.min(i12, k10.length())));
                }
            } else if (m10 instanceof l0) {
                h1 captionEditText = ((l0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean Q2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock R1(ki.w3 r2, ki.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.R1(ki.w3, ki.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void R2(TL_iv.PageBlock pageBlock) {
        if (pageBlock != null) {
            if (pageBlock.text == null) {
                pageBlock.text = new TL_iv.textEmpty();
            }
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (pageblockpreformatted.language == null) {
                    pageblockpreformatted.language = "";
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                TL_iv.pageBlockBlockquote pageblockblockquote = (TL_iv.pageBlockBlockquote) pageBlock;
                if (pageblockblockquote.caption == null) {
                    pageblockblockquote.caption = new TL_iv.textEmpty();
                    return;
                }
            }
            if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                TL_iv.pageBlockPullquote pageblockpullquote = (TL_iv.pageBlockPullquote) pageBlock;
                if (pageblockpullquote.caption == null) {
                    pageblockpullquote.caption = new TL_iv.textEmpty();
                }
            }
        }
    }

    public static void S1(w3 w3Var, h1 h1Var) {
        if (h1Var == null) {
            w3Var.getClass();
            return;
        }
        h1Var.adaptiveCreateLinkDialog = w3Var.f15660k3;
        h1Var.setInlineButtonContext(w3Var.f15652g3);
        h1Var.setInlineButtonClickListener(new t2(w3Var));
    }

    public static void T1(a aVar, t tVar, w3 w3Var) {
        u3 u3Var = w3Var.f15656i3;
        IdentityHashMap identityHashMap = w3Var.f15647b4;
        IdentityHashMap identityHashMap2 = w3Var.f15646a4;
        if (tVar == null) {
            ArrayList arrayList = w3Var.f15663m3;
            for (t tVar2 : W3(aVar)) {
                a5 a5Var = (a5) identityHashMap2.remove(tVar2);
                if (a5Var != null) {
                    a5Var.b();
                }
                w4 w4Var = (w4) identityHashMap.remove(tVar2);
                if (w4Var != null) {
                    w4Var.a();
                }
            }
            int indexOf = arrayList.indexOf(aVar);
            if (indexOf >= 0) {
                h2 h2Var = w3Var.K3;
                if (h2Var != null) {
                    h2Var.d();
                }
                arrayList.remove(indexOf);
                w3Var.Z2.N(true);
                h2 h2Var2 = w3Var.K3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
            }
            u3Var.onContentChanged();
            return;
        }
        a5 a5Var2 = (a5) identityHashMap2.remove(tVar);
        if (a5Var2 != null) {
            a5Var2.b();
        }
        w4 w4Var2 = (w4) identityHashMap.remove(tVar);
        if (w4Var2 != null) {
            w4Var2.a();
        }
        h2 h2Var3 = w3Var.K3;
        if (h2Var3 != null) {
            h2Var3.d();
        }
        w3Var.w4(aVar, tVar);
        h2 h2Var4 = w3Var.K3;
        if (h2Var4 != null) {
            h2Var4.h();
        }
        u3Var.onContentChanged();
    }

    public static void T2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            Y1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.e = z11;
                            aVar.f15143f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        Y1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    U2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            Y1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock T3(a aVar, t tVar) {
        int i10;
        if (H3(aVar.f15141b)) {
            ArrayList m32 = m3(aVar.f15141b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(tVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && m32 != null && i10 < m32.size()) {
                return (TL_iv.PageBlock) m32.get(i10);
            }
            return null;
        }
        return aVar.f15141b;
    }

    public static void U1(w3 w3Var) {
        if (w3Var.J3) {
            return;
        }
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.h();
        }
        w3Var.f15656i3.p();
        w3Var.u4();
    }

    public static void U2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
        int i11 = 0;
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            ArrayList<TL_iv.PageListOrderedItem> arrayList2 = ((TL_iv.pageBlockOrderedList) pageBlock).items;
            int size = arrayList2.size();
            int i12 = 1;
            while (i11 < size) {
                TL_iv.PageListOrderedItem pageListOrderedItem = arrayList2.get(i11);
                i11++;
                TL_iv.PageListOrderedItem pageListOrderedItem2 = pageListOrderedItem;
                if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemText) {
                    Y1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    T2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                    i12 = i13;
                }
                i12++;
            }
            return;
        }
        ArrayList<TL_iv.PageListItem> arrayList3 = ((TL_iv.pageBlockList) pageBlock).items;
        int size2 = arrayList3.size();
        while (i11 < size2) {
            TL_iv.PageListItem pageListItem = arrayList3.get(i11);
            i11++;
            TL_iv.PageListItem pageListItem2 = pageListItem;
            if (pageListItem2 instanceof TL_iv.TL_pageListItemText) {
                Y1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                T2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean U4(TL_iv.pageBlockTable pageblocktable) {
        TL_iv.RichText richText = pageblocktable.title;
        if (richText != null && !TextUtils.isEmpty(e6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!g6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void V1(w3 w3Var, a aVar) {
        ArrayList arrayList = w3Var.f15663m3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        h2 h2Var = w3Var.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f15147k.addAll(aVar.f15147k);
        arrayList.add(indexOf + 1, aVar2);
        w3Var.y4();
        w3Var.Z2.N(false);
        h2 h2Var2 = w3Var.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        w3Var.post(new o2(w3Var, aVar2, 23));
    }

    public static FrameLayout V4(o5 o5Var, boolean z10) {
        int i10;
        r5 m10;
        g6 model = o5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : o5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z10 ? (g6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i10 || (o10 == i10 && a2 < i11) : o10 > i10 || (o10 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m10 = o5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return o5Var;
    }

    public static boolean W1(ki.w3 r16, ki.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.W1(ki.w3, ki.a, boolean):boolean");
    }

    public static List W3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (H3(aVar.f15141b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        t tVar = aVar.f15144g;
        if (tVar != null) {
            return Collections.singletonList(tVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static h1 X3(View view) {
        if (view instanceof c6) {
            return ((c6) view).getEditText();
        }
        if (view instanceof l0) {
            return ((l0) view).getCaptionEditText();
        }
        if (view instanceof t0) {
            return ((t0) view).getEditText();
        }
        return null;
    }

    public static void Y1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.e = z10;
        aVar.f15143f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock Y3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockHeading1) {
            return new TL_iv.pageBlockHeading1();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading2) {
            return new TL_iv.pageBlockHeading2();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading3) {
            return new TL_iv.pageBlockHeading3();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading4) {
            return new TL_iv.pageBlockHeading4();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading5) {
            return new TL_iv.pageBlockHeading5();
        }
        if (pageBlock instanceof TL_iv.pageBlockHeading6) {
            return new TL_iv.pageBlockHeading6();
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
            return new TL_iv.pageBlockBlockquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPullquote) {
            return new TL_iv.pageBlockPullquote();
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
            pageblockpreformatted.language = ((TL_iv.pageBlockPreformatted) pageBlock).language;
            return pageblockpreformatted;
        } else if (pageBlock instanceof TL_iv.pageBlockFooter) {
            return new TL_iv.pageBlockFooter();
        } else {
            return new TL_iv.pageBlockParagraph();
        }
    }

    public static t Z3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i10;
        t tVar = new t();
        tVar.f15569b = photoEntry.isVideo;
        tVar.e = str;
        tVar.f15574j = photoEntry.width;
        tVar.f15575k = photoEntry.height;
        String str2 = photoEntry.imagePath;
        int i11 = 0;
        if (str2 != null && str != null && str.equals(str2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = photoEntry.orientation;
        }
        tVar.f15576l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        tVar.f15577m = i11;
        tVar.f15568a = 1;
        tVar.f15571f = 0.0f;
        return tVar;
    }

    public static o5 a3(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof o5) {
                return (o5) parent;
            }
        }
        return null;
    }

    public static void c3(ArrayList arrayList, ArrayList arrayList2, Map map) {
        TL_iv.RichText richText;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) pageBlock;
                        if (pageblockdetails.title == null) {
                            pageblockdetails.title = new TL_iv.textEmpty();
                        }
                        arrayList.add(new a(pageblockdetails, 0, 0));
                        int size2 = arrayList.size();
                        c3(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f15145i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = p0.a();
                        c3(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f15147k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    U2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList d3(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        c3(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void f2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] g5(o5 o5Var) {
        int i10;
        int i11;
        g6 g6Var = o5Var.F;
        if (g6Var != null) {
            i10 = g6Var.f15350g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            h1 k10 = o5Var.k(i10);
            if (k10 != null) {
                i11 = k10.length();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                return new int[]{i10, i11};
            }
            i10--;
        }
        return null;
    }

    public static ArrayList m3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean n4(h1 h1Var, float f7, float f10) {
        int[] iArr;
        if (h1Var != null && h1Var.getVisibility() == 0) {
            h1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - iArr[0];
            float f12 = f10 - iArr[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= h1Var.getWidth() && f12 <= h1Var.getHeight()) {
                int offsetForPosition = h1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                h1Var.s();
                h1Var.setSelection(Math.max(0, Math.min(offsetForPosition, h1Var.length())));
                return true;
            }
        }
        return false;
    }

    public static int q4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i11 = aVar.f15148l;
        } else {
            i11 = aVar.f15149m;
        }
        int size = aVar.f15147k.size() - i11;
        return org.telegram.messenger.v0.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean r3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !J3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int r4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f15147k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f15147k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                ((c6) childAt).setLocked(z10);
            } else if (childAt instanceof o5) {
                ((o5) childAt).setLocked(z10);
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof t0) {
                ((t0) childAt).setLocked(z10);
            } else if (childAt instanceof x0) {
                childAt.invalidate();
            }
        }
    }

    public final c6 A2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.Y2.m(i10);
        if (!(m10 instanceof c6)) {
            return null;
        }
        return (c6) m10;
    }

    public final void A3(ki.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.A3(ki.a):void");
    }

    public final t A4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document Y2 = Y2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (Y2 == null) {
                return null;
            }
            t tVar = new t();
            tVar.f15570c = true;
            tVar.f15568a = 2;
            tVar.h = Y2;
            tVar.f15573i = Y2;
            return tVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document Y22 = Y2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (Y22 == null) {
                return null;
            }
            t tVar2 = new t();
            tVar2.d = true;
            tVar2.f15568a = 2;
            tVar2.h = Y22;
            return tVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document Y23 = Y2(pageblockvideo.video_id);
                if (Y23 == null) {
                    return null;
                }
                t tVar3 = new t();
                tVar3.f15569b = true;
                tVar3.f15568a = 2;
                tVar3.h = Y23;
                tVar3.f15578n = pageblockvideo.spoiler;
                while (i10 < Y23.attributes.size()) {
                    if (Y23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) Y23.attributes.get(i10);
                        tVar3.f15574j = tL_documentAttributeVideo.f20350w;
                        tVar3.f15575k = tL_documentAttributeVideo.h;
                        return tVar3;
                    }
                    i10++;
                }
                return tVar3;
            } else if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
                return null;
            } else {
                TL_iv.pageBlockPhoto pageblockphoto = (TL_iv.pageBlockPhoto) pageBlock;
                long j10 = pageblockphoto.photo_id;
                int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i11 == 0) {
                    photo = null;
                } else {
                    int i12 = 0;
                    loop1: while (true) {
                        if (i12 < this.f15663m3.size()) {
                            for (t tVar4 : W3((a) this.f15663m3.get(i12))) {
                                if (tVar4 != null && (photo = tVar4.f15572g) != null && photo.f20367id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f15662l3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f20367id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = v4.f15640a;
                            synchronized (v4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) v4.f15640a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                t tVar5 = new t();
                tVar5.f15568a = 2;
                tVar5.f15572g = photo;
                tVar5.f15578n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    tVar5.f15574j = closestPhotoSizeWithSize.f20368w;
                    tVar5.f15575k = closestPhotoSizeWithSize.h;
                }
                return tVar5;
            }
        }
    }

    public final void B2() {
        M2();
        this.f15662l3 = null;
        this.f15648c4 = null;
        this.f15649d4 = null;
        this.K3 = new h2(this.f15670p4);
        F4();
        this.K3.j();
        u3 u3Var = this.f15656i3;
        if (u3Var != null) {
            u3Var.P();
        }
    }

    public final void B4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f15662l3 != null && aVar != null && (pageBlock = aVar.f15141b) != null) {
            if (H3(pageBlock)) {
                ArrayList m32 = m3(aVar.f15141b);
                aVar.h = new ArrayList();
                if (m32 != null) {
                    for (int i10 = 0; i10 < m32.size(); i10++) {
                        t A4 = A4((TL_iv.PageBlock) m32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (A4 == null) {
                            A4 = new t();
                        }
                        arrayList.add(A4);
                    }
                    return;
                }
                return;
            }
            t A42 = A4(aVar.f15141b);
            if (A42 != null) {
                aVar.f15144g = A42;
            }
        }
    }

    public final boolean C3() {
        int i10;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f22861p0) == j3Var.f22864s0 && i10 >= 0 && i10 < this.f15672q4.size()) {
            return G4(i10) instanceof l0;
        }
        return false;
    }

    public final ArrayList C4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (H3(aVar.f15141b)) {
                ArrayList m32 = m3(aVar.f15141b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (m32 != null) {
                    int size2 = m32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = m32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        t A4 = A4(pageBlock);
                        if (A4 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(A4);
                        }
                    }
                    m32.clear();
                    m32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f15141b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    t A42 = A4(pageBlock2);
                    if (A42 != null) {
                        aVar.f15144g = A42;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean D2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f15663m3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f15145i;
            ArrayList arrayList2 = aVar.f15147k;
            if (!z10) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    Map.EL.merge(hashMap, (Long) arrayList2.get(i11), 1, new Object());
                }
            }
            i10++;
        }
        boolean z11 = false;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            a aVar2 = (a) arrayList.get(i12);
            ArrayList arrayList3 = aVar2.f15147k;
            if (arrayList3.size() == 1 && (aVar2.f15141b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f15141b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f15665n3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f15141b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void D4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof l4) {
                a0 a0Var = (a0) ((l4) childAt);
                a0Var.f15158b.a(a0Var.f15157a, new j5.b(a0Var, 2));
            }
        }
        invalidate();
    }

    public final ArrayList E2() {
        TLRPC.Document document;
        t tVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15663m3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f15141b instanceof TL_iv.pageBlockDocument) && (tVar = aVar.f15144g) != null && tVar.b() && (document2 = aVar.f15144g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f15141b).document_id = document2.f20349id;
                }
                for (t tVar2 : W3(aVar)) {
                    if (tVar2.b() && (document = tVar2.h) != null) {
                        long j10 = document.f20349id;
                        if (j10 != 0 && document.access_hash != 0 && hashSet.add(Long.valueOf(j10))) {
                            arrayList.add(tVar2.h);
                        }
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final boolean E3() {
        int i10;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f22861p0) == j3Var.f22864s0 && D3(E4(i10))) {
            return true;
        }
        return false;
    }

    public final a E4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f15672q4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList F2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f15663m3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (document = tVar.h) != null && hashSet.add(Long.valueOf(document.f20349id))) {
                    arrayList.add(tVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void F4() {
        ArrayList arrayList = this.f15663m3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.Z2.N(false);
    }

    @Override
    public final boolean G1() {
        return this.U3;
    }

    public final ArrayList G2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f15663m3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (photo = tVar.f15572g) != null && hashSet.add(Long.valueOf(photo.f20367id))) {
                    arrayList.add(tVar.f15572g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View G4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.Y2.m(i10);
    }

    public final ArrayList H2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15663m3;
            if (i10 < arrayList2.size()) {
                for (t tVar : W3((a) arrayList2.get(i10))) {
                    if (tVar.b() && (photo = tVar.f15572g) != null && hashSet.add(Long.valueOf(photo.f20367id))) {
                        arrayList.add(tVar.f15572g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] H4() {
        int i10;
        ArrayList arrayList = this.f15663m3;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            int indexOf = arrayList.indexOf(E4(j3Var.f22861p0));
            int indexOf2 = arrayList.indexOf(E4(j3Var.f22864s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a W2 = W2();
        if (W2 != null) {
            i10 = arrayList.indexOf(W2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void I1() {
        u3 u3Var = this.f15656i3;
        if (u3Var != null) {
            u3Var.y();
        }
    }

    public final void I2() {
        h2 h2Var = this.K3;
        if (h2Var != null) {
            h2Var.h();
        }
        ArrayList arrayList = this.f15663m3;
        SpannableStringBuilder k10 = c5.k(arrayList);
        M2();
        arrayList.clear();
        HashMap hashMap = this.f15665n3;
        hashMap.clear();
        this.f15662l3 = null;
        c3(arrayList, c5.b(k10), hashMap);
        this.Z2.N(false);
        h2 h2Var2 = this.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        u3 u3Var = this.f15656i3;
        if (u3Var != null) {
            u3Var.onContentChanged();
            u3Var.P();
        }
    }

    public final boolean I4() {
        int i10;
        int i11;
        int i12;
        int i13;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            if (R3()) {
                int i14 = j3Var.f22861p0;
                int i15 = j3Var.f22862q0;
                int i16 = j3Var.f22865t0;
                int i17 = j3Var.f22863r0;
                int i18 = j3Var.f22866u0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    h1 T4 = T4(i14, i19);
                    if (T4 != null) {
                        int length = T4.length();
                        if (i19 == i15) {
                            i12 = i17;
                        } else {
                            i12 = 0;
                        }
                        if (i19 == i16) {
                            i13 = i18;
                        } else {
                            i13 = length;
                        }
                        if (i15 == i16) {
                            i12 = Math.min(i17, i18);
                            i13 = Math.max(i17, i18);
                        }
                        if (Math.max(0, Math.min(i12, length)) < Math.max(0, Math.min(i13, length))) {
                            return true;
                        }
                    }
                }
            } else if (E3()) {
                h1 O2 = O2(j3Var.f22861p0);
                if (O2 != null && Math.max(0, Math.min(Math.min(j3Var.f22863r0, j3Var.f22866u0), O2.length())) < Math.max(0, Math.min(Math.max(j3Var.f22863r0, j3Var.f22866u0), O2.length()))) {
                    return true;
                }
            } else if (C3()) {
                h1 y22 = y2(j3Var.f22861p0);
                if (y22 != null) {
                    int i20 = j3Var.f22863r0;
                    int i21 = j3Var.f22866u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), y22.length())) < Math.max(0, Math.min(Math.max(i20, i21), y22.length()))) {
                        return true;
                    }
                }
            } else if (M3()) {
                h1 p42 = p4(j3Var.f22861p0);
                if (p42 != null) {
                    int i22 = j3Var.f22863r0;
                    int i23 = j3Var.f22866u0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), p42.length())) < Math.max(0, Math.min(Math.max(i22, i23), p42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = j3Var.f22861p0;
                int i25 = j3Var.f22864s0;
                int i26 = j3Var.f22863r0;
                int i27 = j3Var.f22866u0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f15672q4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a E4 = E4(i28);
                        if (E4 != null) {
                            if (E4.f15156t == 0) {
                                TL_iv.PageBlock pageBlock = E4.f15141b;
                                if (!G3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int o22 = o2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = o22;
                            }
                            if (Math.max(0, Math.min(i10, o22)) < Math.max(0, Math.min(i11, o22))) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void J1() {
        u3 u3Var = this.f15656i3;
        if (u3Var != null) {
            u3Var.J();
        }
        D4();
    }

    public final a J2() {
        int i10;
        a E4;
        a W2 = W2();
        if (W2 != null) {
            return W2;
        }
        j3 j3Var = this.f15667o3;
        if (j3Var != null && (i10 = j3Var.f22861p0) >= 0 && (E4 = E4(i10)) != null) {
            return E4;
        }
        return null;
    }

    public final int[] J4() {
        j3 j3Var = this.f15667o3;
        if (j3Var != null) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22864s0;
            if (i10 >= 0 && i11 >= 0) {
                a E4 = E4(i10);
                a E42 = E4(i11);
                if (E4 != null && E42 != null) {
                    ArrayList arrayList = this.f15663m3;
                    int indexOf = arrayList.indexOf(E4);
                    int indexOf2 = arrayList.indexOf(E42);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        if (indexOf > indexOf2) {
                            indexOf = indexOf2;
                            indexOf2 = indexOf;
                        }
                        return new int[]{indexOf, indexOf2};
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void K1(s4.b1 b1Var) {
        u3 u3Var = this.f15656i3;
        if (u3Var != null && b1Var != null) {
            View view = b1Var.f46343a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.U3 = u3Var.e(view.getHeight() + iArr[1]);
        }
    }

    public final void K2() {
        ArrayList arrayList;
        j3 j3Var = this.f15667o3;
        int i10 = j3Var.f22861p0;
        int i11 = j3Var.f22863r0;
        int i12 = j3Var.f22864s0;
        if (!c2(i10, i11, i12, j3Var.f22866u0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f15663m3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f15672q4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f15156t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                h2 h2Var = this.K3;
                if (h2Var != null) {
                    h2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f15665n3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f15147k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                D2();
                b4();
                y4();
                j3Var.f(false);
                this.Z2.N(false);
                h2 h2Var2 = this.K3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                post(new o2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void K4(h1 h1Var) {
        h1Var.adaptiveCreateLinkDialog = this.f15660k3;
        h1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void L1(s4.b1 b1Var) {
        a aVar = this.T3;
        this.T3 = null;
        this.U3 = false;
        if (aVar != null) {
            h2 h2Var = this.K3;
            if (h2Var != null) {
                h2Var.d();
            }
            x4(aVar);
            h2 h2Var2 = this.K3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            u3 u3Var = this.f15656i3;
            if (u3Var != null) {
                u3Var.onContentChanged();
            }
        } else if (b1Var != null) {
            View view = b1Var.f46343a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean L2() {
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
            return true;
        } else if (this.f15659j4 == null) {
            return false;
        } else {
            S2();
            return true;
        }
    }

    public final void L4(ki.o5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.L4(ki.o5):void");
    }

    @Override
    public final void M1(s4.b1 b1Var) {
        int b10;
        m61 G;
        a aVar = null;
        if (b1Var != null && (b10 = b1Var.b()) >= 0 && (G = this.Z2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.T3 = aVar;
        this.U3 = false;
        u3 u3Var = this.f15656i3;
        if (u3Var != null) {
            u3Var.s();
        }
    }

    public final void M2() {
        j3 j3Var = this.f15667o3;
        if (j3Var != null) {
            j3Var.f(true);
        }
        S2();
        t3();
        IdentityHashMap identityHashMap = this.f15646a4;
        for (a5 a5Var : identityHashMap.values()) {
            a5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f15647b4;
        for (w4 w4Var : identityHashMap2.values()) {
            w4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean M3() {
        int i10;
        a E4;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f22861p0) == j3Var.f22864s0 && i10 >= 0 && i10 < this.f15672q4.size() && j3Var.f22862q0 == 1 && j3Var.f22865t0 == 1 && (E4 = E4(i10)) != null && c6.o(E4.f15141b)) {
            return true;
        }
        return false;
    }

    public final c6 M4() {
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22864s0;
            a E4 = E4(i10);
            if (i10 == i11 && E4 != null && G3(E4.f15141b)) {
                return A2(i10);
            }
            return null;
        }
        return null;
    }

    public final int N2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f15663m3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (D3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f15145i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean N3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f15663m3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f15145i && !D3(aVar)) {
                        if (!aVar.f15147k.isEmpty() || c6.o(aVar.f15141b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final Editable N4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (D3(E4(i10))) {
                h1 O2 = O2(i10);
                if (O2 != null) {
                    return O2.getText();
                }
                return null;
            } else if (M3()) {
                h1 p42 = p4(i10);
                if (p42 != null) {
                    return p42.getText();
                }
                return null;
            } else {
                a E4 = E4(i10);
                if (E4 != null && G3(E4.f15141b)) {
                    int o22 = o2(i10);
                    if (i2.o1.z(i11, i13, o22, 0) < i2.o1.h(i11, i13, o22, 0)) {
                        c6 A2 = A2(i10);
                        if (A2 != null) {
                            return A2.getEditText().getText();
                        }
                        return c6.z(E4.f15141b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final h1 O2(int i10) {
        if (!D3(E4(i10))) {
            return null;
        }
        View G4 = G4(i10);
        if (!(G4 instanceof t0)) {
            return null;
        }
        return ((t0) G4).getEditText();
    }

    public final boolean O3() {
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22864s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a E4 = E4(i10);
                    if (E4 != null) {
                        if (I3(E4.f15141b)) {
                            z10 = true;
                        }
                    }
                    i10++;
                }
                return z10;
            }
        }
        return false;
    }

    public final boolean O4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.O4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean P3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.P3(int, int, int, int, int):boolean");
    }

    public final void P4(View view) {
        s4.b1 T;
        int b10;
        if (view != null && this.f27540a3 != null && this.f27543d3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.Z2.H(b10) >= 0) {
            this.B3 = true;
            j3 j3Var = this.f15667o3;
            if (j3Var.x()) {
                j3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.f27540a3.r(T);
        }
    }

    public final boolean Q3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            h1 T4 = T4(i11, i18);
            if (T4 != null) {
                int length = T4.length();
                if (i18 == i12) {
                    i16 = i13;
                } else {
                    i16 = 0;
                }
                if (i18 == i14) {
                    i17 = i15;
                } else {
                    i17 = length;
                }
                if (i12 == i14) {
                    i16 = Math.min(i13, i15);
                    i17 = Math.max(i13, i15);
                }
                int max = Math.max(0, Math.min(i16, length));
                int max2 = Math.max(0, Math.min(i17, length));
                if (max >= max2) {
                    continue;
                } else if ((T4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void Q4(a aVar, t tVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f7;
        a5 a5Var = (a5) this.f15646a4.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        IdentityHashMap identityHashMap = this.f15647b4;
        w4 w4Var = (w4) identityHashMap.remove(tVar);
        if (w4Var != null) {
            w4Var.a();
        }
        tVar.f15568a = 1;
        tVar.f15571f = 0.0f;
        w4 w4Var2 = new w4(this.f15652g3, photoEntry, new h3(aVar, tVar, this));
        identityHashMap.put(tVar, w4Var2);
        if (!w4Var2.f15686f && !w4Var2.h && !w4Var2.f15687n) {
            w4Var2.f15686f = true;
            int i11 = photoEntry.width;
            int i12 = photoEntry.height;
            if (i11 <= 0 || i12 <= 0) {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(photoEntry.path, options);
                    i11 = options.outWidth;
                    i12 = options.outHeight;
                } catch (Exception unused) {
                }
            }
            VideoEditedInfo videoEditedInfo = null;
            r7 = null;
            ArrayList<VideoEditedInfo.MediaEntity> arrayList = null;
            videoEditedInfo = null;
            if (i11 > 0 && i12 > 0) {
                int i13 = photoEntry.orientation;
                if (i13 == 90 || i13 == 270) {
                    int i14 = i12;
                    i12 = i11;
                    i11 = i14;
                }
                VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                videoEditedInfo2.startTime = 0L;
                videoEditedInfo2.start = (float) 0;
                videoEditedInfo2.endTime = Math.min(3000L, photoEntry.averageDuration);
                while (true) {
                    long j10 = videoEditedInfo2.endTime;
                    i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (i10 <= 0 || j10 >= 1000) {
                        break;
                    }
                    videoEditedInfo2.endTime = j10 * 2;
                }
                if (i10 <= 0) {
                    videoEditedInfo2.endTime = 3000L;
                }
                long j11 = videoEditedInfo2.endTime;
                videoEditedInfo2.end = (float) j11;
                videoEditedInfo2.compressQuality = 1;
                videoEditedInfo2.rotationValue = 0;
                videoEditedInfo2.originalPath = photoEntry.path;
                videoEditedInfo2.estimatedSize = (int) ((f7 / 1000.0f) * 115200.0f);
                videoEditedInfo2.estimatedDuration = j11;
                videoEditedInfo2.framerate = 30;
                videoEditedInfo2.originalDuration = j11;
                videoEditedInfo2.filterState = photoEntry.savedFilterState;
                String str = photoEntry.croppedPaintPath;
                if (str != null) {
                    videoEditedInfo2.paintPath = str;
                    ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = photoEntry.croppedMediaEntities;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        arrayList = photoEntry.croppedMediaEntities;
                    }
                    videoEditedInfo2.mediaEntities = arrayList;
                } else {
                    videoEditedInfo2.paintPath = photoEntry.paintPath;
                    videoEditedInfo2.mediaEntities = photoEntry.mediaEntities;
                }
                videoEditedInfo2.isPhoto = true;
                MediaController.CropState cropState = photoEntry.cropState;
                if (cropState != null) {
                    int i15 = cropState.transformRotation;
                    if (i15 == 90 || i15 == 270) {
                        int i16 = i12;
                        i12 = i11;
                        i11 = i16;
                    }
                    i11 = (int) (i11 * cropState.cropPw);
                    i12 = (int) (i12 * cropState.cropPh);
                }
                float f10 = i11;
                float f11 = i12;
                float max = Math.max(f10 / 854.0f, f11 / 854.0f);
                if (max < 1.0f) {
                    max = 1.0f;
                }
                int i17 = (int) (f10 / max);
                int i18 = (int) (f11 / max);
                if (i17 % 16 != 0) {
                    i17 = Math.max(1, Math.round(i17 / 16.0f)) * 16;
                }
                if (i18 % 16 != 0) {
                    i18 = Math.max(1, Math.round(i18 / 16.0f)) * 16;
                }
                videoEditedInfo2.resultWidth = i17;
                videoEditedInfo2.originalWidth = i17;
                videoEditedInfo2.resultHeight = i18;
                videoEditedInfo2.originalHeight = i18;
                videoEditedInfo2.bitrate = -1;
                videoEditedInfo2.muted = true;
                videoEditedInfo2.avatarStartTime = 0L;
                videoEditedInfo = videoEditedInfo2;
            }
            w4Var2.d = videoEditedInfo;
            if (videoEditedInfo != null && videoEditedInfo.needConvert()) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f20364id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                w4Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(w4Var2.f15683a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                w4Var2.f15685c = messageObject;
                messageObject.videoEditedInfo = w4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(w4Var2.f15683a);
                notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(w4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(w4Var2.f15685c, false, false, false);
                return;
            }
            w4Var2.b();
        }
    }

    public final boolean R3() {
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22864s0;
            a E4 = E4(i10);
            if (i10 == i11 && E4 != null && (E4.f15141b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void R4(a aVar, t tVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.f15646a4;
        a5 a5Var = (a5) identityHashMap.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        a5 a5Var2 = new a5(this.f15652g3, str, z10, i10, i11, i12, new i3(aVar, tVar, this));
        identityHashMap.put(tVar, a5Var2);
        a5Var2.d();
    }

    public final void S2() {
        if (this.C3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.C3 = false;
        this.D3 = false;
        this.E3 = null;
        this.F3 = null;
        j80 j80Var = this.f15661k4;
        if (j80Var != null) {
            this.f15661k4 = null;
            j80Var.u();
        }
        o5 o5Var = this.f15659j4;
        if (o5Var != null) {
            LinkedHashSet linkedHashSet = o5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                o5Var.v.invalidate();
                o5Var.s();
            }
            this.f15659j4 = null;
        }
        this.f15664m4 = -1;
        this.l4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean S3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f15652g3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f15663m3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += W3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList f32 = f3();
        ?? obj = new Object();
        obj.d = i11;
        obj.f15390b = f32.size() + obj.f15390b;
        for (int i12 = 0; i12 < f32.size(); i12++) {
            i2.b((TL_iv.PageBlock) f32.get(i12), 1, obj);
        }
        if (obj.f15389a > appGlobalConfig.richMessageLengthLimit.get() || obj.f15390b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f15391c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable S4(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof c6) {
            return ((c6) F1).getEditText().getText();
        }
        return c6.z(aVar.f15141b);
    }

    public final h1 T4(int i10, int i11) {
        View G4 = G4(i10);
        if (!(G4 instanceof o5)) {
            return null;
        }
        return ((o5) G4).k(i11);
    }

    public final int[] U3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.O3.size(); i12++) {
            int length = c6.y(((a) this.O3.get(i12)).f15141b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.O3.size() - 1;
        return new int[]{size, c6.y(((a) this.O3.get(size)).f15141b).length()};
    }

    public final h1 V2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                return ((c6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int V3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f15663m3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (D3(aVar)) {
                    i11++;
                } else if (aVar.f15145i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a W2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                if (c6Var.getEditText().isFocused() || (c6Var.m() && c6Var.h.isFocused())) {
                    return c6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void W4() {
        boolean z10;
        int[] H4 = H4();
        if (H4 != null) {
            int i10 = H4[0];
            int i11 = H4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f15663m3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    h2 h2Var = this.K3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    if (N3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f15145i;
                            ArrayList arrayList2 = aVar.f15147k;
                            if (!z11 && !D3(aVar)) {
                                if (c6.o(aVar.f15141b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f15141b.text;
                                    aVar.f15141b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a1.g.y(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = p0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f15145i;
                            ArrayList arrayList3 = aVar2.f15147k;
                            if (!z12 && !D3(aVar2)) {
                                if (c6.o(aVar2.f15141b)) {
                                    long a10 = p0.a();
                                    TL_iv.RichText j10 = c6.j(aVar2.f15141b);
                                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                        this.f15665n3.put(Long.valueOf(a10), j10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f15141b.text;
                                    aVar2.f15141b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    D2();
                    b4();
                    y4();
                    j3 j3Var = this.f15667o3;
                    if (j3Var != null && j3Var.x()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.Z2.N(false);
                    h2 h2Var2 = this.K3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    if (z10) {
                        post(new ig.d2(this, aVar3, aVar4, 4));
                    } else {
                        post(new o2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void X1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.X1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final o5 X2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return a3((h1) findFocus);
        }
        return null;
    }

    public final void X4(ki.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.X4(ki.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document Y2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f15663m3.size(); i12++) {
            for (t tVar : W3((a) this.f15663m3.get(i12))) {
                if (tVar != null && (document = tVar.h) != null && document.f20349id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f15662l3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f20349id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = v4.f15640a;
        synchronized (v4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) v4.f15641b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean Y4() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.Y4():boolean");
    }

    public final void Z1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        w3 w3Var;
        if (aVar != null && J3(aVar.f15141b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                h2 h2Var = this.K3;
                if (h2Var != null) {
                    h2Var.d();
                }
                t Z3 = Z3(photoEntry, str2);
                boolean c10 = w4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (H3(aVar.f15141b)) {
                    m3(aVar.f15141b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(Z3);
                } else {
                    t tVar = aVar.f15144g;
                    if (tVar != null && tVar.f15568a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f15141b.caption;
                        k0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f15141b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f15144g);
                        aVar.h.add(Z3);
                        aVar.f15144g = null;
                        aVar.f15141b = pageblockcollage;
                    } else {
                        aVar.f15141b = pageblockvideo;
                        aVar.f15144g = Z3;
                    }
                }
                this.Z2.N(false);
                t4(aVar);
                if (c10) {
                    Q4(aVar, Z3, photoEntry);
                    w3Var = this;
                } else {
                    w3Var = this;
                    w3Var.R4(aVar, Z3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                h2 h2Var2 = w3Var.K3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.f15656i3.onContentChanged();
            }
        }
    }

    public final int Z2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f15663m3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f15145i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (D3(aVar2)) {
                        i13++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.f15141b).open) {
                            i12 = i13;
                        }
                    } else if (aVar2.f15145i) {
                        if (i12 != -1 && i13 == i12) {
                            i12 = -1;
                        }
                        i13--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f15141b;
                    if (!K3(pageBlock) || r3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean Z4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.Z4(android.view.View, float, float):boolean");
    }

    public final void a2(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            h2 h2Var = this.K3;
            if (h2Var != null) {
                h2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f15662l3;
            if (richMessage2 == null) {
                this.f15662l3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f15662l3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            c3(arrayList4, richMessage.blocks, this.f15665n3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    B4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f15663m3;
                int size = arrayList5.size();
                a W2 = W2();
                if (W2 != null && (indexOf = arrayList5.indexOf(W2)) >= 0) {
                    TL_iv.PageBlock pageBlock = W2.f15141b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && c6.y(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                b4();
                y4();
                this.Z2.N(false);
                h2 h2Var2 = this.K3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                u3 u3Var = this.f15656i3;
                if (u3Var != null) {
                    u3Var.onContentChanged();
                }
            }
        }
    }

    public final a a4(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f15672q4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f15145i) {
                    if (aVar.f15156t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f15141b;
                        if (K3(pageBlock) && !r3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
                        }
                    }
                    return aVar;
                }
                i10 += i11;
            } else {
                return null;
            }
        }
        return null;
    }

    public final void a5(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable z12;
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f15663m3;
            if (arrayList.indexOf(aVar2) >= 0 && !D3(aVar2) && !aVar2.f15145i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f15141b;
                if (pageBlock != pageBlock2 && G3(pageBlock2) && G3(pageBlock)) {
                    c6 A2 = A2(arrayList.indexOf(aVar2));
                    if (A2 != null) {
                        z12 = A2.getEditText().getText();
                    } else {
                        z12 = c6.z(aVar2.f15141b);
                    }
                    c6.d(pageBlock, z12);
                    TL_iv.RichText j10 = c6.j(aVar2.f15141b);
                    if (j10 != null && c6.j(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = j10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = j10;
                        }
                    }
                }
                X4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a b2(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f15672q4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f15156t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void b3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                c6Var.f15240f.n();
                c6Var.h.n();
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof t0) {
                ((t0) childAt).getEditText().n();
            }
        }
    }

    public final void b4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15663m3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f15147k.isEmpty() && c6.o(aVar.f15141b)) {
                    long a2 = p0.a();
                    TL_iv.RichText j10 = c6.j(aVar.f15141b);
                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                        this.f15665n3.put(Long.valueOf(a2), j10);
                    }
                    aVar.f15147k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f15141b.text;
                    aVar.f15141b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void b5(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        a5(aVar2, pageBlock, aVar2.f15142c, aVar2.d, aVar2.e, aVar2.f15143f);
    }

    public final boolean c2(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.c2(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean c4(ki.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.c4(ki.a, boolean):boolean");
    }

    public final void c5(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        w3 w3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            a5(aVar2, aVar2.f15141b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f15142c);
        if (i10 == 2) {
            i11 = Math.max(1, aVar2.d);
        } else {
            i11 = 0;
        }
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        TL_iv.PageBlock pageBlock2 = aVar2.f15141b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f15143f) {
            z11 = true;
            pageBlock = pageBlock2;
            w3Var = this;
        } else {
            z11 = false;
            w3Var = this;
            pageBlock = pageBlock2;
        }
        w3Var.a5(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void d2() {
        c6 c6Var;
        a aVar;
        z5 z5Var;
        this.Z2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof c6) && (aVar = (c6Var = (c6) childAt).f15245x) != null && (z5Var = c6Var.f15246y) != null) {
                c6Var.f(aVar, z5Var, c6Var.E);
            }
        }
    }

    public final void d4() {
        int length;
        int z10;
        int h;
        int length2;
        int z11;
        int h10;
        int length3;
        int z12;
        int h11;
        int length4;
        int z13;
        int h12;
        h1 T4;
        int length5;
        int z14;
        int h13;
        boolean R3 = R3();
        j3 j3Var = this.f15667o3;
        if (R3) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22862q0;
            if (i11 == j3Var.f22865t0 && (T4 = T4(i10, i11)) != null && (z14 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length5 = T4.length()), 0)) < (h13 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length5, 0))) {
                h2 h2Var = this.K3;
                if (h2Var != null) {
                    h2Var.d();
                }
                if (e6.h(T4.getText(), z14, h13)) {
                    e6.n(T4.getText(), z14, h13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    h2 h2Var2 = this.K3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    u4();
                }
                T4.setSelectionOverride(z14, h13);
                T4.makeSelectedDate();
            }
        } else if (E3()) {
            int i12 = j3Var.f22861p0;
            h1 O2 = O2(i12);
            if (O2 != null && (z13 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length4 = O2.length()), 0)) < (h12 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length4, 0))) {
                h2 h2Var3 = this.K3;
                if (h2Var3 != null) {
                    h2Var3.d();
                }
                if (e6.h(O2.getText(), z13, h12)) {
                    e6.n(O2.getText(), z13, h12);
                    O2.invalidateEffects();
                    k4(i12);
                    h2 h2Var4 = this.K3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    u4();
                }
                O2.setSelectionOverride(z13, h12);
                O2.makeSelectedDate();
            }
        } else if (C3()) {
            int i13 = j3Var.f22861p0;
            h1 y22 = y2(i13);
            if (y22 != null && (z12 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length3 = y22.length()), 0)) < (h11 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length3, 0))) {
                h2 h2Var5 = this.K3;
                if (h2Var5 != null) {
                    h2Var5.d();
                }
                if (e6.h(y22.getText(), z12, h11)) {
                    e6.n(y22.getText(), z12, h11);
                    y22.invalidateEffects();
                    j4(i13);
                    h2 h2Var6 = this.K3;
                    if (h2Var6 != null) {
                        h2Var6.h();
                    }
                    u4();
                }
                y22.setSelectionOverride(z12, h11);
                y22.makeSelectedDate();
            }
        } else if (M3()) {
            int i14 = j3Var.f22861p0;
            h1 p42 = p4(i14);
            if (p42 != null && (z11 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length2 = p42.length()), 0)) < (h10 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length2, 0))) {
                h2 h2Var7 = this.K3;
                if (h2Var7 != null) {
                    h2Var7.d();
                }
                if (e6.h(p42.getText(), z11, h10)) {
                    e6.n(p42.getText(), z11, h10);
                    p42.invalidateEffects();
                    l4(i14);
                    h2 h2Var8 = this.K3;
                    if (h2Var8 != null) {
                        h2Var8.h();
                    }
                    u4();
                }
                p42.setSelectionOverride(z11, h10);
                p42.makeSelectedDate();
            }
        } else {
            c6 M4 = M4();
            if (M4 == null || (z10 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length = M4.getEditText().length()), 0)) >= (h = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length, 0))) {
                return;
            }
            h2 h2Var9 = this.K3;
            if (h2Var9 != null) {
                h2Var9.d();
            }
            if (e6.h(M4.getEditText().getText(), z10, h)) {
                e6.n(M4.getEditText().getText(), z10, h);
                M4.getEditText().invalidateEffects();
                M4.w();
                h2 h2Var10 = this.K3;
                if (h2Var10 != null) {
                    h2Var10.h();
                }
                u4();
            }
            M4.getEditText().setSelectionOverride(z10, h);
            M4.getEditText().makeSelectedDate();
        }
    }

    public final a d5() {
        j3 j3Var;
        int i10;
        a W2 = W2();
        if (W2 == null && (j3Var = this.f15667o3) != null && j3Var.x() && (i10 = j3Var.f22861p0) == j3Var.f22864s0) {
            return E4(i10);
        }
        return W2;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i10;
        Long l4;
        a aVar;
        View view;
        Long l10;
        int i11;
        int i12;
        ArrayList arrayList2;
        a aVar2;
        a aVar3;
        float f7;
        a aVar4;
        boolean z10;
        a aVar5;
        int childCount = getChildCount();
        if (childCount != 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                arrayList = this.f15672q4;
                if (i13 >= childCount) {
                    break;
                }
                int R = RecyclerView.R(getChildAt(i13));
                if (R >= 0 && R < arrayList.size()) {
                    aVar5 = (a) arrayList.get(R);
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    ArrayList arrayList3 = aVar5.f15147k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f15674r4 == null) {
                    tm0 tm0Var = new tm0(this);
                    this.f15674r4 = tm0Var;
                    tm0Var.a(null, null, null, this.f15654h3, 1);
                    w7.i.a(this.f15674r4, this.f15654h3);
                }
                int i15 = 0;
                while (i15 < i14) {
                    float f10 = 0.0f;
                    long j10 = 0;
                    int i16 = 0;
                    boolean z11 = false;
                    a aVar6 = null;
                    a aVar7 = null;
                    float f11 = 1.0f;
                    float f12 = 0.0f;
                    while (i16 <= childCount) {
                        if (i16 < childCount) {
                            View childAt = getChildAt(i16);
                            int R2 = RecyclerView.R(childAt);
                            if (R2 >= 0 && R2 < arrayList.size()) {
                                aVar = (a) arrayList.get(R2);
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ArrayList arrayList4 = aVar.f15147k;
                                if (i15 < arrayList4.size()) {
                                    l4 = (Long) arrayList4.get(i15);
                                    i10 = childCount;
                                    view = childAt;
                                }
                            }
                            i10 = childCount;
                            view = childAt;
                            l4 = null;
                        } else {
                            i10 = childCount;
                            l4 = null;
                            aVar = null;
                            view = null;
                        }
                        if (!z11 || (l4 != null && l4.longValue() == j10)) {
                            l10 = l4;
                            i11 = i15;
                            i12 = i14;
                            arrayList2 = arrayList;
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f7 = f11;
                        } else {
                            int q42 = q4(i15, aVar6, true);
                            l10 = l4;
                            int q43 = q4(i15, aVar7, false);
                            if (f12 - f10 <= AndroidUtilities.dp(4.0f)) {
                                i11 = i15;
                                i12 = i14;
                                arrayList2 = arrayList;
                            } else {
                                int dp = AndroidUtilities.dp(16.0f) * i15;
                                i11 = i15;
                                int dp2 = AndroidUtilities.dp(16.0f) + dp;
                                i12 = i14;
                                arrayList2 = arrayList;
                                int B = org.telegram.messenger.v0.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, q42 + f10, B, f12 - q43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.f15674r4.c(floor, floor, floor, f11, canvas, rectF);
                                    f7 = f11;
                                    this.f15674r4.f(canvas, rectF, f7);
                                    z11 = false;
                                }
                            }
                            aVar2 = aVar6;
                            aVar3 = aVar7;
                            f7 = f11;
                            z11 = false;
                        }
                        if (view != null && l10 != null) {
                            if (!z11) {
                                j10 = l10.longValue();
                                f10 = Float.MAX_VALUE;
                                f12 = -3.4028235E38f;
                                aVar4 = aVar;
                                z10 = true;
                                f7 = 1.0f;
                            } else {
                                aVar4 = aVar2;
                                z10 = z11;
                            }
                            if (aVar != null && aVar == this.T3) {
                                z11 = z10;
                                f11 = f7;
                            } else {
                                float y3 = view.getY();
                                float height = view.getHeight() + y3;
                                if (y3 < f10) {
                                    f10 = y3;
                                }
                                if (height > f12) {
                                    f12 = height;
                                }
                                f11 = Math.min(f7, view.getAlpha());
                                z11 = z10;
                            }
                            aVar7 = aVar;
                        } else {
                            aVar7 = aVar3;
                            f11 = f7;
                            aVar4 = aVar2;
                        }
                        i16++;
                        aVar6 = aVar4;
                        childCount = i10;
                        i15 = i11;
                        i14 = i12;
                        arrayList = arrayList2;
                    }
                    i15++;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean e2(int i10, int i11) {
        j3 j3Var;
        ArrayList arrayList = this.O3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] U3 = U3(max);
            int[] U32 = U3(max2);
            a aVar = (a) this.O3.get(U3[0]);
            if (U3[0] != U32[0] && max != max2) {
                View F1 = F1(aVar);
                View F12 = F1(this.O3.get(U32[0]));
                if ((F1 instanceof c6) && (F12 instanceof c6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f15663m3;
                        int size = arrayList2.size();
                        j3Var = this.f15667o3;
                        if (i12 >= size) {
                            break;
                        }
                        j3Var.X(i12, c6.y(((a) arrayList2.get(i12)).f15141b));
                        i12++;
                    }
                    c6 c6Var = (c6) F1;
                    int length = c6Var.getEditText().length();
                    if (U3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!j3Var.j0(c6Var, 0, U3[1], length)) {
                        c6Var.A();
                        return true;
                    }
                    j3Var.b0(0, U32[1], (c6) F12);
                    return true;
                }
            } else {
                View F13 = F1(aVar);
                if (F13 instanceof c6) {
                    c6 c6Var2 = (c6) F13;
                    c6Var2.A();
                    h1 editText = c6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(U3[1], length2), Math.min(U32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList e3(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        w3 w3Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f15663m3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f15145i;
            ArrayList arrayList3 = aVar.f15147k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f15147k.size() <= i12 || ((Long) aVar2.f15147k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> e32 = e3(i15, i16, i12 + 1, true);
                if (e32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f15665n3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (e32.size() == 1 && (e32.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (e32.get(0).text != null) {
                            textempty = e32.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = e32;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (D3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15141b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int V3 = V3(i15);
                pageblockdetails.blocks = e3(i15 + 1, Math.min(V3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = V3 + 1;
            } else {
                int i17 = aVar.f15142c;
                if (i17 <= 0) {
                    P2(arrayList, aVar);
                    i15++;
                    i13 = i11;
                    i14 = i12;
                } else {
                    int[] iArr = {i15};
                    if (aVar.d > 0) {
                        z11 = true;
                        i13 = i11;
                        i14 = i12;
                        w3Var = this;
                    } else {
                        z11 = false;
                        w3Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock q22 = w3Var.q2(i15, i17, i13, i14, z11, iArr);
                    if (q22 != null) {
                        arrayList.add(q22);
                    }
                    int i18 = iArr[0];
                    if (i18 <= 0) {
                        i15 = i13;
                    } else {
                        i15 = i18;
                    }
                }
                i11 = i13;
                i12 = i14;
            }
        }
        if (!z10) {
            while (!arrayList.isEmpty() && F3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && F3((TL_iv.PageBlock) i2.o1.i(1, arrayList))) {
                a1.g.y(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void e4(int i10) {
        int i11;
        h2 h2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int z11;
        int h;
        boolean z12;
        int i16;
        int length2;
        int z13;
        int h10;
        boolean z14;
        int i17;
        int length3;
        int z15;
        int h11;
        boolean z16;
        int i18;
        h2 h2Var2;
        int i19;
        int i20;
        int i21;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            boolean R3 = R3();
            u3 u3Var = this.f15656i3;
            int i22 = 0;
            if (R3) {
                int i23 = j3Var.f22861p0;
                int i24 = j3Var.f22862q0;
                int i25 = j3Var.f22865t0;
                int i26 = j3Var.f22863r0;
                int i27 = j3Var.f22866u0;
                boolean Q3 = Q3(i10, i23, i24, i26, i25, i27);
                if (!Q3) {
                    i18 = C2(i10);
                } else {
                    i18 = 0;
                }
                h2 h2Var3 = this.K3;
                if (h2Var3 != null) {
                    h2Var3.d();
                }
                this.J3 = true;
                int i28 = i24;
                boolean z17 = false;
                while (i28 <= i25) {
                    h1 T4 = T4(i23, i28);
                    if (T4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = T4.length();
                        if (i28 == i24) {
                            i19 = i26;
                        } else {
                            i19 = 0;
                        }
                        if (i28 == i25) {
                            i20 = i27;
                        } else {
                            i20 = length4;
                        }
                        if (i24 == i25) {
                            i19 = Math.min(i26, i27);
                            i20 = Math.max(i26, i27);
                        }
                        int i29 = i19;
                        i21 = i24;
                        int max = Math.max(0, Math.min(i29, length4));
                        int max2 = Math.max(0, Math.min(i20, length4));
                        if (max < max2) {
                            if (!Q3) {
                                if (i18 != 0) {
                                    T4.removeStyle(i18, max, max2);
                                }
                                T4.addStyle(i10, max, max2);
                            } else {
                                T4.removeStyle(i10, max, max2);
                            }
                            T4.invalidateEffects();
                            T4.requestLayout();
                            m4(i23, i28);
                            z17 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.J3 = false;
                if (z17 && (h2Var2 = this.K3) != null) {
                    h2Var2.h();
                }
                u3Var.p();
                if (z17) {
                    u4();
                }
            } else if (E3()) {
                int i30 = j3Var.f22861p0;
                h1 O2 = O2(i30);
                if (O2 != null && (z15 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length3 = O2.length()), 0)) < (h11 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length3, 0))) {
                    if ((O2.getCurrentStyle(z15, h11) & i10) == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    h2 h2Var4 = this.K3;
                    if (h2Var4 != null) {
                        h2Var4.d();
                    }
                    this.J3 = true;
                    if (z16) {
                        int C2 = C2(i10);
                        if (C2 != 0) {
                            O2.removeStyle(C2, z15, h11);
                        }
                        O2.addStyle(i10, z15, h11);
                    } else {
                        O2.removeStyle(i10, z15, h11);
                    }
                    this.J3 = false;
                    k4(i30);
                    O2.invalidateEffects();
                    O2.requestLayout();
                    h2 h2Var5 = this.K3;
                    if (h2Var5 != null) {
                        h2Var5.h();
                    }
                    u3Var.p();
                    u4();
                }
            } else if (C3()) {
                int i31 = j3Var.f22861p0;
                h1 y22 = y2(i31);
                if (y22 != null && (z13 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length2 = y22.length()), 0)) < (h10 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length2, 0))) {
                    if ((y22.getCurrentStyle(z13, h10) & i10) == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        i17 = C2(i10);
                    } else {
                        i17 = 0;
                    }
                    h2 h2Var6 = this.K3;
                    if (h2Var6 != null) {
                        h2Var6.d();
                    }
                    this.J3 = true;
                    if (z14) {
                        if (i17 != 0) {
                            y22.removeStyle(i17, z13, h10);
                        }
                        y22.addStyle(i10, z13, h10);
                    } else {
                        y22.removeStyle(i10, z13, h10);
                    }
                    y22.invalidateEffects();
                    y22.requestLayout();
                    j4(i31);
                    this.J3 = false;
                    h2 h2Var7 = this.K3;
                    if (h2Var7 != null) {
                        h2Var7.h();
                    }
                    u3Var.p();
                    u4();
                }
            } else if (M3()) {
                int i32 = j3Var.f22861p0;
                h1 p42 = p4(i32);
                if (p42 != null && (z11 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length = p42.length()), 0)) < (h = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length, 0))) {
                    if ((p42.getCurrentStyle(z11, h) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i16 = C2(i10);
                    } else {
                        i16 = 0;
                    }
                    h2 h2Var8 = this.K3;
                    if (h2Var8 != null) {
                        h2Var8.d();
                    }
                    this.J3 = true;
                    if (z12) {
                        if (i16 != 0) {
                            p42.removeStyle(i16, z11, h);
                        }
                        p42.addStyle(i10, z11, h);
                    } else {
                        p42.removeStyle(i10, z11, h);
                    }
                    p42.invalidateEffects();
                    p42.requestLayout();
                    l4(i32);
                    this.J3 = false;
                    h2 h2Var9 = this.K3;
                    if (h2Var9 != null) {
                        h2Var9.h();
                    }
                    u3Var.p();
                    u4();
                }
            } else {
                int i33 = j3Var.f22861p0;
                int i34 = j3Var.f22864s0;
                int i35 = j3Var.f22863r0;
                int i36 = j3Var.f22866u0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f15672q4.size()) {
                    int i37 = i10;
                    boolean P3 = P3(i37, i33, i35, i34, i36);
                    boolean z18 = !P3;
                    if (!P3) {
                        i11 = C2(i37);
                    } else {
                        i11 = 0;
                    }
                    h2 h2Var10 = this.K3;
                    if (h2Var10 != null) {
                        h2Var10.d();
                    }
                    this.J3 = true;
                    int i38 = i33;
                    boolean z19 = false;
                    while (i38 <= i34) {
                        a E4 = E4(i38);
                        if (E4 != null) {
                            TL_iv.PageBlock pageBlock = E4.f15141b;
                            if (G3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int o22 = o2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = i22;
                                }
                                z10 = z19;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = o22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, o22));
                                int max4 = Math.max(i22, Math.min(i14, o22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z19 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    c6 A2 = A2(i38);
                                    if (A2 != null) {
                                        org.telegram.ui.ActionBar.z4 styleDelegate = A2.getStyleDelegate();
                                        if (!P3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        A2.getEditText().invalidateEffects();
                                        A2.getEditText().requestLayout();
                                        A2.w();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(c6.z(E4.f15141b));
                                        if (!P3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            e6.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        e6.o(spannableStringBuilder, i15, max4, i37, z18, null);
                                        c6.d(E4.f15141b, spannableStringBuilder);
                                    }
                                    z19 = true;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                }
                            }
                        }
                        i12 = i11;
                        z10 = z19;
                        z19 = z10;
                        i38++;
                        i37 = i10;
                        i11 = i12;
                        i22 = 0;
                    }
                    boolean z20 = z19;
                    this.J3 = i22;
                    if (z20 && (h2Var = this.K3) != null) {
                        h2Var.h();
                    }
                    u3Var.p();
                    if (z20) {
                        u4();
                    }
                }
            }
        }
    }

    public final void e5(float f7, float f10) {
        TL_iv.pageTableCell l4;
        o5 o5Var = this.f15659j4;
        if (this.C3 && o5Var != null && this.y3 == o5Var && (l4 = o5Var.l((int) ((f7 - o5Var.getLeft()) - getLeft()), (int) ((f10 - o5Var.getTop()) - getTop()))) != null && l4 != this.F3) {
            this.F3 = l4;
            o5Var.v(this.E3, l4);
        }
    }

    public final ArrayList f3() {
        return e3(0, this.f15663m3.size(), 0, false);
    }

    public final void f4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.f4(android.view.View):void");
    }

    public final void f5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15141b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    h2 h2Var = this.K3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    c6 A2 = A2(this.f15663m3.indexOf(aVar));
                    if (A2 != null && (aVar2 = A2.f15245x) != null) {
                        A2.I(aVar2.f15141b, true);
                        A2.H = null;
                        A2.B();
                    }
                    h2 h2Var2 = this.K3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                }
            }
        }
    }

    public final void g2() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            ArrayList arrayList6 = this.f15663m3;
            if (i18 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i18);
                ArrayList arrayList7 = aVar.f15146j;
                ArrayList arrayList8 = aVar.f15147k;
                arrayList7.clear();
                int i19 = 1;
                if (aVar.f15145i) {
                    if (!arrayList.isEmpty()) {
                        a1.g.y(1, arrayList);
                    }
                    arrayList2.clear();
                    arrayList3.clear();
                    arrayList4.clear();
                    arrayList5.clear();
                    i16 = i17;
                } else {
                    for (int i20 = i17; i20 < arrayList8.size(); i20++) {
                        ((Long) arrayList8.get(i20)).getClass();
                        arrayList7.add(new Object());
                    }
                    for (int i21 = i17; i21 < arrayList.size(); i21++) {
                        arrayList7.add((p0) arrayList.get(i21));
                    }
                    int max = Math.max(i17, aVar.f15142c);
                    if (max == 0) {
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    } else {
                        if (aVar.d > 0) {
                            i10 = 1;
                        } else {
                            i10 = i17;
                        }
                        while (arrayList2.size() > max) {
                            arrayList2.remove(arrayList2.size() - 1);
                            arrayList3.remove(arrayList3.size() - 1);
                            arrayList4.remove(arrayList4.size() - 1);
                            arrayList5.remove(arrayList5.size() - 1);
                        }
                        int i22 = 1;
                        while (i22 <= max) {
                            int i23 = i22 - 1;
                            if (i22 == max) {
                                i12 = i17;
                                i11 = i19;
                            } else {
                                i11 = i17;
                                i12 = i11;
                            }
                            if (i23 < arrayList2.size()) {
                                i13 = i19;
                            } else {
                                i13 = i12;
                            }
                            if (i13 != 0 && i11 != 0) {
                                i14 = i19;
                                if (((Boolean) arrayList3.get(i23)).booleanValue() != i10) {
                                    i13 = i12;
                                }
                            } else {
                                i14 = i19;
                            }
                            if (i13 == 0) {
                                while (arrayList2.size() > i23) {
                                    arrayList2.remove(arrayList2.size() - 1);
                                    arrayList3.remove(arrayList3.size() - 1);
                                    arrayList4.remove(arrayList4.size() - 1);
                                    arrayList5.remove(arrayList5.size() - 1);
                                }
                                arrayList2.add(Long.valueOf(p0.a()));
                                if (i11 != 0) {
                                    z10 = i10;
                                } else {
                                    z10 = i12;
                                }
                                arrayList3.add(Boolean.valueOf(z10));
                                arrayList4.add(Integer.valueOf(i12));
                                arrayList5.add(0L);
                            }
                            ((Long) arrayList2.get(i23)).getClass();
                            if (i11 != 0) {
                                if (((Long) arrayList5.get(i23)).longValue() != 0 && K3(aVar.f15141b)) {
                                    i15 = i12;
                                } else {
                                    i15 = i14;
                                }
                                if (i15 != 0) {
                                    arrayList4.set(i23, Integer.valueOf(((Integer) arrayList4.get(i23)).intValue() + 1));
                                    arrayList5.set(i23, Long.valueOf(aVar.f15140a));
                                } else {
                                    ((Integer) arrayList4.get(i23)).getClass();
                                    ((Long) arrayList5.get(i23)).getClass();
                                }
                                arrayList7.add(new Object());
                            } else {
                                ((Boolean) arrayList3.get(i23)).getClass();
                                arrayList7.add(new Object());
                            }
                            i22++;
                            i17 = i12;
                            i19 = i14;
                        }
                    }
                    i16 = i17;
                    if (D3(aVar)) {
                        boolean z11 = ((TL_iv.pageBlockDetails) aVar.f15141b).open;
                        p0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (c6.o(aVar.f15141b)) {
                        p0.a();
                        arrayList7.add(new Object());
                    }
                }
                i18++;
                i17 = i16;
            } else {
                return;
            }
        }
    }

    public final boolean g3() {
        a aVar;
        ArrayList arrayList = this.f15663m3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) i2.o1.i(1, arrayList);
        }
        if (aVar != null && !K3(aVar.f15141b) && !aVar.f15145i && !D3(aVar) && !Q2(aVar.f15141b)) {
            if (!(F1(aVar) instanceof c6)) {
                return false;
            }
            k3(aVar);
            return true;
        }
        h2 h2Var = this.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.Z2.N(false);
        h2 h2Var2 = this.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        post(new o2(this, aVar2, 21));
        return true;
    }

    public final void g4() {
        int length;
        int z10;
        int h;
        int length2;
        int z11;
        int h10;
        int length3;
        int z12;
        int h11;
        int length4;
        int z13;
        int h12;
        h1 T4;
        int length5;
        int z14;
        int h13;
        boolean R3 = R3();
        u3 u3Var = this.f15656i3;
        j3 j3Var = this.f15667o3;
        if (R3) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22862q0;
            if (i11 == j3Var.f22865t0 && (T4 = T4(i10, i11)) != null && (z14 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length5 = T4.length()), 0)) < (h13 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length5, 0))) {
                if (e6.h(T4.getText(), z14, h13)) {
                    h2 h2Var = this.K3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    e6.n(T4.getText(), z14, h13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    h2 h2Var2 = this.K3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    u3Var.p();
                    u4();
                    return;
                }
                h2 h2Var3 = this.K3;
                if (h2Var3 != null) {
                    h2Var3.d();
                }
                if (e6.g(T4.getText(), z14, h13)) {
                    e6.m(T4.getText(), z14, h13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    h2 h2Var4 = this.K3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    u4();
                }
                T4.setSelectionOverride(z14, h13);
                u3(false);
                K4(T4);
            }
        } else if (E3()) {
            int i12 = j3Var.f22861p0;
            h1 O2 = O2(i12);
            if (O2 != null && (z13 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length4 = O2.length()), 0)) < (h12 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length4, 0))) {
                if (e6.h(O2.getText(), z13, h12)) {
                    h2 h2Var5 = this.K3;
                    if (h2Var5 != null) {
                        h2Var5.d();
                    }
                    e6.n(O2.getText(), z13, h12);
                    O2.invalidateEffects();
                    k4(i12);
                    h2 h2Var6 = this.K3;
                    if (h2Var6 != null) {
                        h2Var6.h();
                    }
                    u3Var.p();
                    u4();
                    return;
                }
                h2 h2Var7 = this.K3;
                if (h2Var7 != null) {
                    h2Var7.d();
                }
                if (e6.g(O2.getText(), z13, h12)) {
                    e6.m(O2.getText(), z13, h12);
                    O2.invalidateEffects();
                    k4(i12);
                    h2 h2Var8 = this.K3;
                    if (h2Var8 != null) {
                        h2Var8.h();
                    }
                    u4();
                }
                O2.setSelectionOverride(z13, h12);
                u3(false);
                K4(O2);
            }
        } else if (C3()) {
            int i13 = j3Var.f22861p0;
            h1 y22 = y2(i13);
            if (y22 != null && (z12 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length3 = y22.length()), 0)) < (h11 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length3, 0))) {
                if (e6.h(y22.getText(), z12, h11)) {
                    h2 h2Var9 = this.K3;
                    if (h2Var9 != null) {
                        h2Var9.d();
                    }
                    e6.n(y22.getText(), z12, h11);
                    y22.invalidateEffects();
                    j4(i13);
                    h2 h2Var10 = this.K3;
                    if (h2Var10 != null) {
                        h2Var10.h();
                    }
                    u3Var.p();
                    u4();
                    return;
                }
                h2 h2Var11 = this.K3;
                if (h2Var11 != null) {
                    h2Var11.d();
                }
                if (e6.g(y22.getText(), z12, h11)) {
                    e6.m(y22.getText(), z12, h11);
                    y22.invalidateEffects();
                    j4(i13);
                    h2 h2Var12 = this.K3;
                    if (h2Var12 != null) {
                        h2Var12.h();
                    }
                    u4();
                }
                y22.setSelectionOverride(z12, h11);
                u3(false);
                K4(y22);
            }
        } else if (M3()) {
            int i14 = j3Var.f22861p0;
            h1 p42 = p4(i14);
            if (p42 != null && (z11 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length2 = p42.length()), 0)) < (h10 = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length2, 0))) {
                if (e6.h(p42.getText(), z11, h10)) {
                    h2 h2Var13 = this.K3;
                    if (h2Var13 != null) {
                        h2Var13.d();
                    }
                    e6.n(p42.getText(), z11, h10);
                    p42.invalidateEffects();
                    l4(i14);
                    h2 h2Var14 = this.K3;
                    if (h2Var14 != null) {
                        h2Var14.h();
                    }
                    u3Var.p();
                    u4();
                    return;
                }
                h2 h2Var15 = this.K3;
                if (h2Var15 != null) {
                    h2Var15.d();
                }
                if (e6.g(p42.getText(), z11, h10)) {
                    e6.m(p42.getText(), z11, h10);
                    p42.invalidateEffects();
                    l4(i14);
                    h2 h2Var16 = this.K3;
                    if (h2Var16 != null) {
                        h2Var16.h();
                    }
                    u4();
                }
                p42.setSelectionOverride(z11, h10);
                u3(false);
                K4(p42);
            }
        } else {
            c6 M4 = M4();
            if (M4 == null || (z10 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length = M4.getEditText().length()), 0)) >= (h = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length, 0))) {
                return;
            }
            if (e6.h(M4.getEditText().getText(), z10, h)) {
                h2 h2Var17 = this.K3;
                if (h2Var17 != null) {
                    h2Var17.d();
                }
                e6.n(M4.getEditText().getText(), z10, h);
                M4.getEditText().invalidateEffects();
                M4.w();
                h2 h2Var18 = this.K3;
                if (h2Var18 != null) {
                    h2Var18.h();
                }
                u3Var.p();
                u4();
                return;
            }
            h2 h2Var19 = this.K3;
            if (h2Var19 != null) {
                h2Var19.d();
            }
            if (e6.g(M4.getEditText().getText(), z10, h)) {
                e6.m(M4.getEditText().getText(), z10, h);
                M4.getEditText().invalidateEffects();
                M4.w();
                h2 h2Var20 = this.K3;
                if (h2Var20 != null) {
                    h2Var20.h();
                }
                u4();
            }
            M4.getEditText().setSelectionOverride(z10, h);
            u3(false);
            K4(M4.getEditText());
        }
    }

    public h1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return (h1) findFocus;
        }
        return null;
    }

    public m4 getMapDelegate() {
        return this.f15650e4;
    }

    public View getOverlayView() {
        return this.f15669p3;
    }

    public o9 getTextSelectionHelper() {
        return this.f15667o3;
    }

    public final void h2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            h2 h2Var = this.K3;
            if (h2Var != null) {
                h2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            t tVar = new t();
            aVar.f15144g = tVar;
            tVar.f15570c = true;
            long j10 = document.f20349id;
            if (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    str = message.attachPath;
                } else {
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                t tVar2 = aVar.f15144g;
                tVar2.f15573i = document;
                tVar2.e = str;
                tVar2.f15568a = 1;
                tVar2.f15571f = 0.0f;
            } else {
                tVar.h = document;
                tVar.f15573i = document;
                tVar.f15568a = 2;
                pageblockaudio.audio_id = j10;
            }
            A3(aVar);
            if (z10) {
                t tVar3 = aVar.f15144g;
                String str2 = tVar3.e;
                IdentityHashMap identityHashMap = this.f15646a4;
                a5 a5Var = (a5) identityHashMap.remove(tVar3);
                if (a5Var != null) {
                    a5Var.b();
                }
                a5 a5Var2 = new a5(this.f15652g3, str2, document, new g3(aVar, tVar3, this));
                identityHashMap.put(tVar3, a5Var2);
                a5Var2.d();
            }
            h2 h2Var2 = this.K3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            this.f15656i3.onContentChanged();
        }
    }

    public final void h3(a aVar, boolean z10) {
        int i10;
        View F1 = F1(aVar);
        if (F1 instanceof g5) {
            h1 h1Var = ((g5) F1).f15343r;
            h1Var.r();
            if (z10) {
                i10 = h1Var.length();
            } else {
                i10 = 0;
            }
            h1Var.setSelection(i10);
            return;
        }
        i3(aVar, z10);
    }

    public final void h4() {
        h1 editText;
        Runnable k2Var;
        int length;
        final int z10;
        final int h;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            if (R3()) {
                int i10 = j3Var.f22861p0;
                int i11 = j3Var.f22862q0;
                if (i11 == j3Var.f22865t0) {
                    editText = T4(i10, i11);
                    k2Var = new p2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (E3()) {
                int i12 = j3Var.f22861p0;
                editText = O2(i12);
                k2Var = new j2(this, i12, 3);
            } else if (C3()) {
                int i13 = j3Var.f22861p0;
                editText = y2(i13);
                k2Var = new j2(this, i13, 0);
            } else if (M3()) {
                int i14 = j3Var.f22861p0;
                editText = p4(i14);
                k2Var = new j2(this, i14, 1);
            } else {
                c6 M4 = M4();
                if (M4 != null) {
                    editText = M4.getEditText();
                    k2Var = new k2(M4, 0);
                } else {
                    return;
                }
            }
            final h1 h1Var = editText;
            final Runnable runnable = k2Var;
            if (h1Var != null && (z10 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length = h1Var.length()), 0)) <= (h = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length, 0))) {
                Editable text = h1Var.getText();
                int i15 = s.h;
                String str = null;
                if (text != null) {
                    s[] sVarArr = (s[]) text.getSpans(z10, h, s.class);
                    if (sVarArr.length > 0) {
                        str = sVarArr[0].f15553a;
                    }
                }
                if (str == null) {
                    str = h1Var.getText().subSequence(z10, h).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = k6.G6;
                org.telegram.ui.ActionBar.g6 g6Var = this.f15654h3;
                final int w02 = k6.w0(i16, g6Var);
                q.X(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        s a2;
                        String str2 = (String) obj;
                        w3 w3Var = w3.this;
                        w3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = s.a(str2, w02, dp)) == null) {
                            return;
                        }
                        h2 h2Var = w3Var.K3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        j3 j3Var2 = w3Var.f15667o3;
                        if (j3Var2 != null) {
                            j3Var2.f(false);
                        }
                        h1 h1Var2 = h1Var;
                        h1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = h1Var2.getText();
                        int max = Math.max(0, Math.min(z10, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(h, text2.length())), spannableString);
                        runnable.run();
                        h2 h2Var2 = w3Var.K3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.f15656i3.onContentChanged();
                        int min = Math.min(max + 1, h1Var2.length());
                        h1Var2.r();
                        w3Var.post(new v2(h1Var2, min, 3));
                    }
                }, g6Var);
            }
        }
    }

    public final void h5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.h5(java.lang.CharSequence):void");
    }

    public final void i2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f20349id = 0L;
            tL_document.dc_id = 0;
            tL_document.size = file.length();
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < name.length()) {
                str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i10).toLowerCase());
            } else {
                str2 = null;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "application/octet-stream";
            }
            tL_document.mime_type = str2;
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = name;
            tL_document.attributes.add(tL_documentAttributeFilename);
            j2(tL_document, str);
        }
    }

    public final void i3(a aVar, boolean z10) {
        View F1 = F1(aVar);
        if (F1 instanceof o5) {
            o5 o5Var = (o5) F1;
            h1 h1Var = o5Var.f15491r;
            g6 g6Var = o5Var.F;
            if (g6Var != null) {
                if (!z10) {
                    h1Var.r();
                    h1Var.setSelection(0);
                    return;
                } else if (!g6Var.f15350g.isEmpty()) {
                    r5 m10 = o5Var.v.m((TL_iv.pageTableCell) i2.o1.i(1, o5Var.F.f15350g));
                    if (m10 != null) {
                        h1 h1Var2 = m10.f15551a;
                        h1Var2.r();
                        h1Var2.setSelection(h1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (F1 instanceof c6)) {
            c6 c6Var = (c6) F1;
            if (c6Var.m()) {
                c6Var.h();
                return;
            }
        }
        h1 X3 = X3(F1);
        if (X3 == null) {
            j3(aVar);
            return;
        }
        X3.r();
        if (z10) {
            X3.setSelection(X3.length());
        }
    }

    public final void i4() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.i4():void");
    }

    public final void j2(TLRPC.Document document, String str) {
        if (document != null) {
            h2 h2Var = this.K3;
            if (h2Var != null) {
                h2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            t tVar = new t();
            aVar.f15144g = tVar;
            tVar.d = true;
            long j10 = document.f20349id;
            if (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                if (!TextUtils.isEmpty(str) && si.o0.t(str)) {
                    t tVar2 = aVar.f15144g;
                    tVar2.h = document;
                    tVar2.e = str;
                    tVar2.f15568a = 1;
                    tVar2.f15571f = 0.0f;
                } else {
                    return;
                }
            } else {
                tVar.h = document;
                tVar.f15568a = 2;
                pageblockdocument.document_id = j10;
            }
            A3(aVar);
            if (z10) {
                t tVar3 = aVar.f15144g;
                IdentityHashMap identityHashMap = this.f15646a4;
                a5 a5Var = (a5) identityHashMap.remove(tVar3);
                if (a5Var != null) {
                    a5Var.b();
                }
                a5 a5Var2 = new a5(this.f15652g3, str, document, new f3(this, tVar3, aVar, str));
                identityHashMap.put(tVar3, a5Var2);
                a5Var2.d();
            }
            h2 h2Var2 = this.K3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            this.f15656i3.onContentChanged();
        }
    }

    public final void j3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof c6) {
            ((c6) F1).A();
        } else if (F1 instanceof t0) {
            ((t0) F1).d.r();
        }
    }

    public final void j4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof l0) {
            ((l0) G4).b();
        }
    }

    public final void k2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f15648c4;
            String str = null;
            this.f15648c4 = null;
            Context context = getContext();
            if (context == null) {
                return;
            }
            try {
                str = context.getContentResolver().getType(uri);
            } catch (Exception e) {
                FileLog.e(e);
            }
            String str2 = str;
            if (str2 != null) {
                contains = str2.startsWith("video");
            } else {
                contains = uri.toString().contains("video");
            }
            boolean z10 = contains;
            int i10 = this.f15676s4;
            this.f15676s4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new r2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void k3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof c6) {
            c6 c6Var = (c6) F1;
            c6Var.A();
            h1 editText = c6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (F1 instanceof t0) {
            t0 t0Var = (t0) F1;
            t0Var.d.r();
            h1 editText2 = t0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void k4(int i10) {
        a E4 = E4(i10);
        h1 O2 = O2(i10);
        if (D3(E4) && O2 != null) {
            ((TL_iv.pageBlockDetails) E4.f15141b).title = e6.f(O2.getText());
        }
    }

    public final void l2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        w3 w3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        h2 h2Var = this.K3;
        if (h2Var != null) {
            h2Var.d();
        }
        boolean c10 = w4.c(photoEntry);
        if (!photoEntry.isVideo && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f15144g = Z3(photoEntry, str2);
        A3(aVar);
        if (c10) {
            Q4(aVar, aVar.f15144g, photoEntry);
            w3Var = this;
        } else {
            w3Var = this;
            w3Var.R4(aVar, aVar.f15144g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        h2 h2Var2 = w3Var.K3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        w3Var.f15656i3.onContentChanged();
    }

    public final void l3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof c6) {
            c6 c6Var = (c6) F1;
            c6Var.A();
            c6Var.getEditText().setSelection(0);
        } else if (F1 instanceof t0) {
            t0 t0Var = (t0) F1;
            t0Var.d.r();
            t0Var.getEditText().setSelection(0);
        }
    }

    public final void l4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof c6) {
            ((c6) G4).v();
        }
    }

    public final void m2(o5 o5Var) {
        o5 o5Var2 = this.f15659j4;
        if (o5Var2 != null && o5Var2 != o5Var) {
            LinkedHashSet linkedHashSet = o5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                o5Var2.v.invalidate();
                o5Var2.s();
            }
        }
        this.f15659j4 = o5Var;
        this.D3 = false;
        this.f15664m4 = -1;
        this.l4 = -1;
        o5Var.setCellSelectionListener(this.f15666n4);
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void m4(int i10, int i11) {
        r5 m10;
        View G4 = G4(i10);
        if (G4 instanceof o5) {
            o5 o5Var = (o5) G4;
            if (i11 == 0) {
                o5Var.t();
                return;
            }
            TL_iv.pageTableCell g10 = o5Var.g(i11);
            if (g10 != null && (m10 = o5Var.getGrid().m(g10)) != null) {
                g6.d(g10, m10.f15551a.getText());
            }
        }
    }

    public final n3 n2() {
        int i10;
        int i11;
        j3 j3Var = this.f15667o3;
        if (j3Var != null && j3Var.x() && !M3()) {
            a E4 = E4(j3Var.f22861p0);
            ArrayList arrayList = this.f15663m3;
            int indexOf = arrayList.indexOf(E4);
            int indexOf2 = arrayList.indexOf(E4(j3Var.f22864s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                if (indexOf > indexOf2) {
                    i11 = indexOf;
                    i10 = indexOf2;
                } else {
                    i10 = indexOf;
                    i11 = indexOf2;
                }
                for (int i12 = i10; i12 <= i11; i12++) {
                    a aVar = (a) arrayList.get(i12);
                    if (aVar.f15145i || D3(aVar)) {
                        return null;
                    }
                }
                return new n3(this, i10, i11, j3Var.f22863r0, j3Var.f22866u0);
            }
            return null;
        }
        return null;
    }

    public final boolean n3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.n3(android.view.KeyEvent):boolean");
    }

    public final int o2(int i10) {
        h1 O2 = O2(i10);
        if (O2 != null) {
            return O2.length();
        }
        c6 A2 = A2(i10);
        if (A2 != null) {
            return A2.getEditText().length();
        }
        a E4 = E4(i10);
        if (E4 == null) {
            return 0;
        }
        return c6.y(E4.f15141b).length();
    }

    public final boolean o3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.o3(android.view.MotionEvent):boolean");
    }

    public final int o4(int i10) {
        Layout layout;
        View G4 = G4(i10);
        if (!(G4 instanceof c6) || (layout = ((c6) G4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.N3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.N3);
        this.f27541b3 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.L3;
        if (i15 > 0 && i14 < i15) {
            z11 = true;
        } else {
            z11 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (z11) {
            View findFocus = findFocus();
            if (findFocus == null) {
                F = null;
            } else {
                F = F(findFocus);
            }
            if (F != null) {
                int dp = (AndroidUtilities.dp(8.0f) + F.getBottom()) - (i14 - getPaddingBottom());
                if (dp > 0) {
                    post(new j2(this, dp, 2));
                }
            }
        }
        this.L3 = i14;
    }

    public final TL_iv.RichMessage p2() {
        if (q3()) {
            ArrayList<TL_iv.PageBlock> f32 = f3();
            if (f32.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = f32;
            richMessage.photos = H2();
            richMessage.documents = E2();
            return richMessage;
        }
        return null;
    }

    public final boolean p3(ki.o5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.p3(ki.o5, int, int):boolean");
    }

    public final h1 p4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof c6) {
            return ((c6) G4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock q2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.q2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean q3() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.q3():boolean");
    }

    public final boolean r2() {
        h1 editText;
        int length;
        int z10;
        int h;
        k4[] k4VarArr;
        j3 j3Var = this.f15667o3;
        if (j3Var == null || !j3Var.x() || j3Var.f22861p0 != j3Var.f22864s0) {
            return false;
        }
        if (R3()) {
            int i10 = j3Var.f22861p0;
            int i11 = j3Var.f22862q0;
            if (i11 != j3Var.f22865t0) {
                return false;
            }
            editText = T4(i10, i11);
        } else if (E3()) {
            editText = O2(j3Var.f22861p0);
        } else if (C3()) {
            editText = y2(j3Var.f22861p0);
        } else if (M3()) {
            editText = p4(j3Var.f22861p0);
        } else {
            c6 M4 = M4();
            if (M4 == null) {
                return false;
            }
            editText = M4.getEditText();
        }
        if (editText == null || (z10 = i2.o1.z(j3Var.f22863r0, j3Var.f22866u0, (length = editText.length()), 0)) >= (h = i2.o1.h(j3Var.f22863r0, j3Var.f22866u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && z10 < h) {
            for (k4 k4Var : (k4[]) text.getSpans(z10, h, k4.class)) {
                if (text.getSpanStart(k4Var) < h && text.getSpanEnd(k4Var) > z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean s2() {
        int[] J4 = J4();
        if (J4 == null) {
            return t2(J2());
        }
        for (int i10 = J4[0]; i10 <= J4[1]; i10++) {
            if (t2((a) this.f15663m3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15663m3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (t tVar : W3((a) arrayList.get(i10))) {
                if (tVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean s4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f15663m3;
            if (i11 < arrayList.size()) {
                h2 h2Var = this.K3;
                if (h2Var != null) {
                    h2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (w3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f15142c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f15142c < aVar.f15142c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (w3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    y4();
                    if (findFocus() instanceof h1) {
                        d2();
                    } else {
                        this.Z2.N(false);
                    }
                    h2 h2Var2 = this.K3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f15660k3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.S3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f15658j3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.O3 = new ArrayList();
        ArrayList arrayList = this.f15663m3;
        c3(arrayList, c5.b(charSequence), this.f15665n3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.O3.add((a) arrayList.get(size));
        }
        this.Z2.N(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f15663m3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f15142c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f15141b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !I3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !u2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f15142c < aVar2.f15142c) {
                return false;
            }
            if (v3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void t3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                c6Var.f15240f.hideActionMode();
                c6Var.h.hideActionMode();
            } else if (childAt instanceof o5) {
                o5 o5Var = (o5) childAt;
                q5 q5Var = o5Var.v;
                o5Var.f15491r.hideActionMode();
                for (int i11 = 0; i11 < q5Var.getChildCount(); i11++) {
                    View childAt2 = q5Var.getChildAt(i11);
                    if (childAt2 instanceof r5) {
                        ((r5) childAt2).f15551a.hideActionMode();
                    }
                }
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof t0) {
                ((t0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void t4(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof u4) {
            u4 u4Var = (u4) F1;
            ArrayList arrayList = u4Var.f15621y;
            if (u4Var.f15157a != null) {
                u4Var.m();
                if (u4Var.W >= arrayList.size()) {
                    u4Var.W = Math.max(0, arrayList.size() - 1);
                }
                u4Var.n(false);
                u4Var.requestLayout();
                u4Var.invalidate();
            }
        }
    }

    public final boolean u2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f15663m3;
            if (i10 < arrayList.size() && K3(((a) arrayList.get(i10)).f15141b) && ((a) arrayList.get(i10 - 1)).f15142c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u3(boolean z10) {
        j3 j3Var = this.f15667o3;
        if (j3Var != null) {
            if (z10) {
                j3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(j3Var.m0);
                j3Var.u();
            }
        }
        if (z10) {
            b3();
        } else {
            t3();
        }
    }

    public final void u4() {
        post(new b(this, 3));
    }

    public final boolean v2() {
        int[] J4 = J4();
        if (J4 == null) {
            return w2(J2());
        }
        for (int i10 = J4[0]; i10 <= J4[1]; i10++) {
            if (w2((a) this.f15663m3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean v3(int i10) {
        if (((a) this.f15663m3.get(i10)).f15142c + 1 <= MessagesController.getInstance(this.f15652g3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void v4(int i10) {
        ArrayList arrayList = this.f15663m3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f15142c > 0) {
                View F1 = F1(aVar);
                if (F1 instanceof c6) {
                    ((c6) F1).E();
                }
            }
        }
    }

    public final boolean w2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f15663m3).indexOf(aVar)) < 0 || aVar.f15142c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f15142c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean w3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f15663m3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f15142c > 0) {
                        z2(i10);
                        return true;
                    }
                } else if (aVar2.f15142c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f15141b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !I3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || u2(i10)) && v3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f15142c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f15142c = aVar.f15142c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.e = false;
                        aVar2.f15143f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f15142c >= aVar2.f15142c)) && v3(i10)) {
                    aVar2.f15142c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void w4(a aVar, t tVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (H3(aVar.f15141b)) {
            ArrayList m32 = m3(aVar.f15141b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(tVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (m32 != null && i10 < m32.size()) {
                    m32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                x4(aVar);
                return;
            }
            int size = aVar.h.size();
            b71 b71Var = this.Z2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f15141b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) m32.get(0);
                aVar.f15141b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f15144g = (t) aVar.h.get(0);
                aVar.h = null;
                b71Var.N(true);
                t4(aVar);
                return;
            }
            b71Var.N(true);
            t4(aVar);
            return;
        }
        x4(aVar);
    }

    public final boolean x2() {
        h2 h2Var = this.K3;
        if (h2Var != null) {
            if (h2Var.e || !h2Var.f15368b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void x3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] J4 = J4();
        if (J4 != null && (i10 = J4[0]) != (i11 = J4[1])) {
            s4(i10, i11, z10);
            return;
        }
        if (J4 == null) {
            aVar = J2();
        } else {
            aVar = (a) this.f15663m3.get(J4[0]);
        }
        if (aVar != null) {
            c4(aVar, z10);
        }
    }

    public final void x4(a aVar) {
        ArrayList arrayList = this.f15663m3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.Z2.N(true);
        }
    }

    public final h1 y2(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof l0) {
            return ((l0) G4).getCaptionEditText();
        }
        return null;
    }

    public final void y3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f15147k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f15665n3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f15156t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f15147k.add((Long) arrayList3.get(i12));
                }
                int i13 = f5.f15324a;
                m61 J = m61.J(f5.class);
                J.G = aVar2;
                J.H = this.f15653g4;
                arrayList2.add(J);
                this.f15672q4.add(aVar2);
            }
        }
    }

    public final void y4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15663m3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f15142c > 0 && aVar.d > 0 && !K3(aVar.f15141b)) {
                    int i11 = aVar.f15142c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f15142c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !K3(aVar2.f15141b)) {
                            if (aVar2.d <= 0) {
                                break;
                            }
                            i12++;
                        }
                    }
                    aVar.d = i12;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void z2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f15663m3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f15142c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f15142c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.e = false;
                aVar2.f15143f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f15142c) > i12) {
                    aVar.f15142c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void z3() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.z3():void");
    }

    public final void z4(String str) {
        j3 j3Var = this.f15667o3;
        c2(j3Var.f22861p0, j3Var.f22863r0, j3Var.f22864s0, j3Var.f22866u0, str.split("\n", -1));
    }
}
