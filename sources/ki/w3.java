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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.t61;
public final class w3 extends b71 {
    public static final ArrayList f15586q4 = new ArrayList();
    public boolean A3;
    public TL_iv.pageTableCell B3;
    public TL_iv.pageTableCell C3;
    public long D3;
    public float E3;
    public float F3;
    public boolean G3;
    public h2 H3;
    public int I3;
    public h1 J3;
    public final i K3;
    public ArrayList L3;
    public int M3;
    public int N3;
    public int O3;
    public boolean P3;
    public a Q3;
    public boolean R3;
    public final o3 S3;
    public final s2 T3;
    public final p3 U3;
    public final q3 V3;
    public final r3 W3;
    public final IdentityHashMap X3;
    public final IdentityHashMap Y3;
    public a Z3;
    public a f15587a4;
    public final s3 f15588b4;
    public final a3 f15589c4;
    public final int f15590d3;
    public final b3 f15591d4;
    public final org.telegram.ui.ActionBar.d6 f15592e3;
    public final c3 f15593e4;
    public final u3 f15594f3;
    public final d3 f15595f4;
    public MessageObject f15596g3;
    public o5 f15597g4;
    public boolean f15598h3;
    public i80 f15599h4;
    public TL_iv.RichMessage f15600i3;
    public int f15601i4;
    public final ArrayList f15602j3;
    public int f15603j4;
    public final HashMap f15604k3;
    public final t2 f15605k4;
    public final j3 f15606l3;
    public final e3 l4;
    public final z9 f15607m3;
    public final k2.w0 f15608m4;
    public int f15609n3;
    public final ArrayList f15610n4;
    public int f15611o3;
    public pm0 f15612o4;
    public int f15613p3;
    public int f15614p4;
    public boolean f15615q3;
    public float f15616r3;
    public float f15617s3;
    public float f15618t3;
    public float f15619u3;
    public View f15620v3;
    public b f15621w3;
    public boolean f15622x3;
    public boolean y3;
    public boolean f15623z3;

    public w3(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, u3 u3Var) {
        super(context, i10, 0, false, new hg.o(r1, 15), new j5.b(r1, 5), null, d6Var);
        this.f15598h3 = true;
        this.f15602j3 = new ArrayList();
        this.f15604k3 = new HashMap();
        this.f15609n3 = -1;
        this.f15611o3 = -1;
        this.f15613p3 = 0;
        this.K3 = new i(this, 2);
        this.P3 = true;
        this.S3 = new o3(this);
        this.T3 = new s2(this);
        this.U3 = new p3(this);
        this.V3 = new q3(this);
        this.W3 = new r3(this);
        this.X3 = new IdentityHashMap();
        this.Y3 = new IdentityHashMap();
        this.f15588b4 = new s3(this);
        this.f15589c4 = new a3(this);
        this.f15591d4 = new b3(this);
        this.f15593e4 = new c3(this);
        this.f15595f4 = new d3(this);
        this.f15601i4 = -1;
        this.f15603j4 = -1;
        this.f15605k4 = new t2(this);
        this.l4 = new e3(this);
        k2.w0 w0Var = new k2.w0(this, 2);
        this.f15608m4 = w0Var;
        this.f15610n4 = new ArrayList();
        this.f15614p4 = -1;
        w3[] w3VarArr = {this};
        this.f15590d3 = i10;
        this.f15592e3 = d6Var;
        this.f15594f3 = u3Var;
        this.W2.f30438r = false;
        setClipToPadding(false);
        setClipChildren(false);
        C1(new hg.o(this, 16), false);
        setReorderLongPressEnabled(false);
        x1(true);
        j3 j3Var = new j3(this, u3Var);
        this.f15606l3 = j3Var;
        j3Var.S(this);
        j3Var.f22666z0 = this.V2;
        z9 n10 = j3Var.n(context);
        this.f15607m3 = n10;
        AndroidUtilities.removeFromParent(n10);
        j3Var.D = new l3(this, u3Var);
        j(new m3(0, this, u3Var));
        this.H3 = new h2(w0Var);
    }

    public static boolean A3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || F3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !c6.z(pageBlock).isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean B3(TL_iv.PageBlock pageBlock) {
        if (!F3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean C3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            return false;
        }
        return true;
    }

    public static boolean D3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockHeading1) && !(pageBlock instanceof TL_iv.pageBlockHeading2) && !(pageBlock instanceof TL_iv.pageBlockHeading3) && !(pageBlock instanceof TL_iv.pageBlockHeading4) && !(pageBlock instanceof TL_iv.pageBlockHeading5) && !(pageBlock instanceof TL_iv.pageBlockHeading6)) {
            return false;
        }
        return true;
    }

    public static boolean E3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !C3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockDivider) && !(pageBlock instanceof TL_iv.pageBlockPhoto) && !(pageBlock instanceof TL_iv.pageBlockVideo) && !(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !(pageBlock instanceof TL_iv.pageBlockMath) && !(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockTable) && !(pageBlock instanceof TL_iv.pageBlockButtonRow) && !(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
            return false;
        }
        return true;
    }

    public static boolean G3(a aVar) {
        if (aVar != null && !aVar.f15101i && !y3(aVar) && (aVar.f15097b instanceof TL_iv.pageBlockParagraph) && aVar.f15098c == 0 && aVar.d == 0 && !aVar.e && aVar.f15103k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void J1(ki.w3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.t61 r22) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.J1(ki.w3[], java.util.ArrayList, org.telegram.ui.Components.t61):void");
    }

    public static void K2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f15097b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            t tVar = aVar.f15100g;
            if (tVar != null && tVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f15097b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f15097b.caption.text = new TL_iv.textEmpty();
                        aVar.f15097b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f15097b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            t tVar2 = aVar.f15100g;
            if (tVar2 != null && tVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f15097b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f15097b.caption.text = new TL_iv.textEmpty();
                        aVar.f15097b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f15097b);
                }
            }
        } else if (C3(pageBlock)) {
            ArrayList h32 = h3(aVar.f15097b);
            List R3 = R3(aVar);
            ArrayList<TL_iv.PageBlock> arrayList2 = new ArrayList<>();
            for (int i12 = 0; h32 != null && i12 < h32.size() && i12 < R3.size(); i12++) {
                TL_iv.PageBlock pageBlock4 = (TL_iv.PageBlock) h32.get(i12);
                if (((t) R3.get(i12)).b()) {
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
                if (aVar.f15097b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f15097b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f15097b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                k0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f15097b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                t tVar3 = aVar.f15100g;
                if (tVar3 != null && tVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f15097b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f15097b.caption.text = new TL_iv.textEmpty();
                            aVar.f15097b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f15097b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                t tVar4 = aVar.f15100g;
                if (tVar4 != null && (document = tVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f20281id;
                }
                if (tVar4 != null && tVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f15097b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        k0.d(pageBlock7);
                        arrayList.add(aVar.f15097b);
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
                    arrayList.add(aVar.f15097b);
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
                if (P4(pageblocktable)) {
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

    public static void L1(w3 w3Var, int i10, int i11, int i12) {
        h1 editText;
        if (i10 >= 0) {
            View m10 = w3Var.V2.m(i10);
            if (m10 instanceof c6) {
                c6 c6Var = (c6) m10;
                if (i11 == 1 && c6Var.n()) {
                    editText = c6Var.getAuthorEditText();
                } else {
                    editText = c6Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof o5) {
                o5 o5Var = (o5) m10;
                h1 l4 = o5Var.l(i11);
                if (l4 == null) {
                    l4 = o5Var.l(0);
                }
                if (l4 != null) {
                    l4.s();
                    l4.setSelection(Math.max(0, Math.min(i12, l4.length())));
                }
            } else if (m10 instanceof l0) {
                h1 captionEditText = ((l0) m10).getCaptionEditText();
                captionEditText.s();
                captionEditText.setSelection(Math.max(0, Math.min(i12, captionEditText.length())));
            }
        }
    }

    public static boolean L2(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockBlockquote) && !(pageBlock instanceof TL_iv.pageBlockPullquote)) {
            return false;
        }
        return true;
    }

    public static org.telegram.tgnet.tl.TL_iv.PageBlock M1(ki.w3 r2, ki.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.M1(ki.w3, ki.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public static void M2(TL_iv.PageBlock pageBlock) {
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

    public static void N1(w3 w3Var, h1 h1Var) {
        if (h1Var == null) {
            w3Var.getClass();
            return;
        }
        h1Var.adaptiveCreateLinkDialog = w3Var.f15598h3;
        h1Var.setInlineButtonContext(w3Var.f15590d3);
        h1Var.setInlineButtonClickListener(new t2(w3Var));
    }

    public static void O1(a aVar, t tVar, w3 w3Var) {
        u3 u3Var = w3Var.f15594f3;
        IdentityHashMap identityHashMap = w3Var.Y3;
        IdentityHashMap identityHashMap2 = w3Var.X3;
        if (tVar == null) {
            ArrayList arrayList = w3Var.f15602j3;
            for (t tVar2 : R3(aVar)) {
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
                h2 h2Var = w3Var.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                arrayList.remove(indexOf);
                w3Var.W2.N(true);
                h2 h2Var2 = w3Var.H3;
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
        h2 h2Var3 = w3Var.H3;
        if (h2Var3 != null) {
            h2Var3.d();
        }
        w3Var.r4(aVar, tVar);
        h2 h2Var4 = w3Var.H3;
        if (h2Var4 != null) {
            h2Var4.h();
        }
        u3Var.onContentChanged();
    }

    public static void O2(ArrayList arrayList, ArrayList arrayList2, int i10, boolean z10, int i11, boolean z11, boolean z12) {
        boolean z13 = false;
        if (arrayList2 != null) {
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList2.get(i12);
                if (!(pageBlock instanceof TL_iv.pageBlockList) && !(pageBlock instanceof TL_iv.pageBlockOrderedList)) {
                    if (!z13) {
                        if (pageBlock instanceof TL_iv.pageBlockParagraph) {
                            T1(arrayList, ((TL_iv.pageBlockParagraph) pageBlock).text, i10, i11, z11, z12);
                        } else {
                            a aVar = new a(pageBlock, i10, i11);
                            aVar.e = z11;
                            aVar.f15099f = z12;
                            arrayList.add(aVar);
                        }
                        z13 = true;
                    } else {
                        arrayList.add(new a(pageBlock, i10, z10 ? 1 : 0));
                    }
                } else {
                    if (!z13) {
                        T1(arrayList, null, i10, i11, z11, z12);
                        z13 = true;
                    }
                    P2(arrayList, pageBlock, i10 + 1);
                }
            }
        }
        if (!z13) {
            T1(arrayList, null, i10, i11, z11, z12);
        }
    }

    public static TL_iv.PageBlock O3(a aVar, t tVar) {
        int i10;
        if (C3(aVar.f15097b)) {
            ArrayList h32 = h3(aVar.f15097b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(tVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0 && h32 != null && i10 < h32.size()) {
                return (TL_iv.PageBlock) h32.get(i10);
            }
            return null;
        }
        return aVar.f15097b;
    }

    public static void P1(w3 w3Var) {
        if (w3Var.G3) {
            return;
        }
        h2 h2Var = w3Var.H3;
        if (h2Var != null) {
            h2Var.h();
        }
        w3Var.f15594f3.p();
        w3Var.p4();
    }

    public static void P2(ArrayList arrayList, TL_iv.PageBlock pageBlock, int i10) {
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
                    T1(arrayList, ((TL_iv.TL_pageListOrderedItemText) pageListOrderedItem2).text, i10, i12, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
                } else if (pageListOrderedItem2 instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    int i13 = i12;
                    O2(arrayList, ((TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem2).blocks, i10, true, i13, pageListOrderedItem2.checkbox, pageListOrderedItem2.checked);
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
                T1(arrayList, ((TL_iv.TL_pageListItemText) pageListItem2).text, i10, 0, pageListItem2.checkbox, pageListItem2.checked);
            } else if (pageListItem2 instanceof TL_iv.TL_pageListItemBlocks) {
                O2(arrayList, ((TL_iv.TL_pageListItemBlocks) pageListItem2).blocks, i10, false, 0, pageListItem2.checkbox, pageListItem2.checked);
            }
        }
    }

    public static boolean P4(TL_iv.pageBlockTable pageblocktable) {
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

    public static void Q1(w3 w3Var, a aVar) {
        ArrayList arrayList = w3Var.f15602j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        h2 h2Var = w3Var.H3;
        if (h2Var != null) {
            h2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f15103k.addAll(aVar.f15103k);
        arrayList.add(indexOf + 1, aVar2);
        w3Var.t4();
        w3Var.W2.N(false);
        h2 h2Var2 = w3Var.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        w3Var.post(new o2(w3Var, aVar2, 23));
    }

    public static FrameLayout Q4(o5 o5Var, boolean z10) {
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

    public static boolean R1(ki.w3 r16, ki.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.R1(ki.w3, ki.a, boolean):boolean");
    }

    public static List R3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (C3(aVar.f15097b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        t tVar = aVar.f15100g;
        if (tVar != null) {
            return Collections.singletonList(tVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static h1 S3(View view) {
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

    public static void T1(ArrayList arrayList, TL_iv.RichText richText, int i10, int i11, boolean z10, boolean z11) {
        TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
        if (richText == null) {
            richText = new TL_iv.textEmpty();
        }
        pageblockparagraph.text = richText;
        a aVar = new a(pageblockparagraph, i10, i11);
        aVar.e = z10;
        aVar.f15099f = z11;
        arrayList.add(aVar);
    }

    public static TL_iv.PageBlock T3(TL_iv.PageBlock pageBlock) {
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

    public static t U3(MediaController.PhotoEntry photoEntry, String str) {
        boolean z10;
        int i10;
        t tVar = new t();
        tVar.f15511b = photoEntry.isVideo;
        tVar.e = str;
        tVar.f15516j = photoEntry.width;
        tVar.f15517k = photoEntry.height;
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
        tVar.f15518l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        tVar.f15519m = i11;
        tVar.f15510a = 1;
        tVar.f15513f = 0.0f;
        return tVar;
    }

    public static o5 V2(h1 h1Var) {
        for (ViewParent parent = h1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof o5) {
                return (o5) parent;
            }
        }
        return null;
    }

    public static void X2(ArrayList arrayList, ArrayList arrayList2, Map map) {
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
                        X2(arrayList, pageblockdetails.blocks, map);
                        if (arrayList.size() == size2) {
                            arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                        }
                        a aVar = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                        aVar.f15101i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = p0.a();
                        X2(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f15103k.add(0, Long.valueOf(a2));
                        }
                        if (map != null && (richText = pageblockblockquoteblocks.caption) != null && !(richText instanceof TL_iv.textEmpty)) {
                            map.put(Long.valueOf(a2), pageblockblockquoteblocks.caption);
                        }
                    } else {
                        arrayList.add(new a(pageBlock, 0, 0));
                    }
                } else {
                    P2(arrayList, pageBlock, 1);
                }
            }
        }
    }

    public static ArrayList Y2(TL_iv.RichMessage richMessage, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        X2(arrayList, richMessage.blocks, hashMap);
        return arrayList;
    }

    public static void a2(TL_iv.pageBlockParagraph pageblockparagraph, String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        pageblockparagraph.text = textplain;
    }

    public static int[] b5(o5 o5Var) {
        int i10;
        int i11;
        g6 g6Var = o5Var.F;
        if (g6Var != null) {
            i10 = g6Var.f15294g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            h1 l4 = o5Var.l(i10);
            if (l4 != null) {
                i11 = l4.length();
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

    public static ArrayList h3(TL_iv.PageBlock pageBlock) {
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            return ((TL_iv.pageBlockCollage) pageBlock).items;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            return ((TL_iv.pageBlockSlideshow) pageBlock).items;
        }
        return null;
    }

    public static boolean i4(h1 h1Var, float f7, float f10) {
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

    public static int l4(int i10, a aVar, boolean z10) {
        int i11;
        if (aVar == null) {
            return AndroidUtilities.dp(2.0f);
        }
        if (z10) {
            i11 = aVar.f15104l;
        } else {
            i11 = aVar.f15105m;
        }
        int size = aVar.f15103k.size() - i11;
        return org.telegram.messenger.g0.D(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean m3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !E3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int m4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f15103k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f15103k;
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

    public static boolean w3(int i10) {
        if (i10 != 21 && i10 != 22 && i10 != 19 && i10 != 20) {
            return false;
        }
        return true;
    }

    public static int x2(int i10) {
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

    public static boolean y3(a aVar) {
        if (aVar != null && (aVar.f15097b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public final ArrayList A2(int i10, int i11) {
        TLRPC.Document document;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f15602j3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : R3((a) arrayList2.get(i10))) {
                if (tVar.b() && (document = tVar.h) != null && hashSet.add(Long.valueOf(document.f20281id))) {
                    arrayList.add(tVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void A4() {
        ArrayList arrayList = this.f15602j3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.W2.N(false);
    }

    @Override
    public final boolean B1() {
        return this.R3;
    }

    public final ArrayList B2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f15602j3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : R3((a) arrayList2.get(i10))) {
                if (tVar.b() && (photo = tVar.f15514g) != null && hashSet.add(Long.valueOf(photo.f20299id))) {
                    arrayList.add(tVar.f15514g);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final View B4(int i10) {
        if (i10 < 0) {
            return null;
        }
        return this.V2.m(i10);
    }

    public final ArrayList C2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15602j3;
            if (i10 < arrayList2.size()) {
                for (t tVar : R3((a) arrayList2.get(i10))) {
                    if (tVar.b() && (photo = tVar.f15514g) != null && hashSet.add(Long.valueOf(photo.f20299id))) {
                        arrayList.add(tVar.f15514g);
                    }
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final int[] C4() {
        int i10;
        ArrayList arrayList = this.f15602j3;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            int indexOf = arrayList.indexOf(z4(j3Var.f22656p0));
            int indexOf2 = arrayList.indexOf(z4(j3Var.f22659s0));
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new int[]{Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2)};
            }
            return null;
        }
        a R2 = R2();
        if (R2 != null) {
            i10 = arrayList.indexOf(R2);
        } else {
            i10 = -1;
        }
        if (i10 >= 0) {
            return new int[]{i10, i10};
        }
        return null;
    }

    @Override
    public final void D1() {
        u3 u3Var = this.f15594f3;
        if (u3Var != null) {
            u3Var.x();
        }
    }

    public final void D2() {
        h2 h2Var = this.H3;
        if (h2Var != null) {
            h2Var.h();
        }
        ArrayList arrayList = this.f15602j3;
        SpannableStringBuilder k10 = c5.k(arrayList);
        H2();
        arrayList.clear();
        HashMap hashMap = this.f15604k3;
        hashMap.clear();
        this.f15600i3 = null;
        X2(arrayList, c5.b(k10), hashMap);
        this.W2.N(false);
        h2 h2Var2 = this.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        u3 u3Var = this.f15594f3;
        if (u3Var != null) {
            u3Var.onContentChanged();
            u3Var.P();
        }
    }

    public final boolean D4() {
        int i10;
        int i11;
        int i12;
        int i13;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            if (M3()) {
                int i14 = j3Var.f22656p0;
                int i15 = j3Var.f22657q0;
                int i16 = j3Var.f22660t0;
                int i17 = j3Var.f22658r0;
                int i18 = j3Var.f22661u0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    h1 O4 = O4(i14, i19);
                    if (O4 != null) {
                        int length = O4.length();
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
            } else if (z3()) {
                h1 J2 = J2(j3Var.f22656p0);
                if (J2 != null && Math.max(0, Math.min(Math.min(j3Var.f22658r0, j3Var.f22661u0), J2.length())) < Math.max(0, Math.min(Math.max(j3Var.f22658r0, j3Var.f22661u0), J2.length()))) {
                    return true;
                }
            } else if (x3()) {
                h1 t22 = t2(j3Var.f22656p0);
                if (t22 != null) {
                    int i20 = j3Var.f22658r0;
                    int i21 = j3Var.f22661u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), t22.length())) < Math.max(0, Math.min(Math.max(i20, i21), t22.length()))) {
                        return true;
                    }
                }
            } else if (H3()) {
                h1 k42 = k4(j3Var.f22656p0);
                if (k42 != null) {
                    int i22 = j3Var.f22658r0;
                    int i23 = j3Var.f22661u0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), k42.length())) < Math.max(0, Math.min(Math.max(i22, i23), k42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = j3Var.f22656p0;
                int i25 = j3Var.f22659s0;
                int i26 = j3Var.f22658r0;
                int i27 = j3Var.f22661u0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f15610n4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a z42 = z4(i28);
                        if (z42 != null) {
                            if (z42.f15112t == 0) {
                                TL_iv.PageBlock pageBlock = z42.f15097b;
                                if (!B3(pageBlock)) {
                                    continue;
                                } else if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                                    continue;
                                }
                            }
                            int j22 = j2(i28);
                            if (i28 == i24) {
                                i10 = i26;
                            } else {
                                i10 = 0;
                            }
                            if (i28 == i25) {
                                i11 = i27;
                            } else {
                                i11 = j22;
                            }
                            if (Math.max(0, Math.min(i10, j22)) < Math.max(0, Math.min(i11, j22))) {
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
    public final void E1() {
        u3 u3Var = this.f15594f3;
        if (u3Var != null) {
            u3Var.J();
        }
        y4();
    }

    public final a E2() {
        int i10;
        a z42;
        a R2 = R2();
        if (R2 != null) {
            return R2;
        }
        j3 j3Var = this.f15606l3;
        if (j3Var != null && (i10 = j3Var.f22656p0) >= 0 && (z42 = z4(i10)) != null) {
            return z42;
        }
        return null;
    }

    public final int[] E4() {
        j3 j3Var = this.f15606l3;
        if (j3Var != null) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22659s0;
            if (i10 >= 0 && i11 >= 0) {
                a z42 = z4(i10);
                a z43 = z4(i11);
                if (z42 != null && z43 != null) {
                    ArrayList arrayList = this.f15602j3;
                    int indexOf = arrayList.indexOf(z42);
                    int indexOf2 = arrayList.indexOf(z43);
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
    public final void F1(s4.b1 b1Var) {
        u3 u3Var = this.f15594f3;
        if (u3Var != null && b1Var != null) {
            View view = b1Var.f45910a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.R3 = u3Var.e(view.getHeight() + iArr[1]);
        }
    }

    public final void F2() {
        ArrayList arrayList;
        j3 j3Var = this.f15606l3;
        int i10 = j3Var.f22656p0;
        int i11 = j3Var.f22658r0;
        int i12 = j3Var.f22659s0;
        if (!X1(i10, i11, i12, j3Var.f22661u0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f15602j3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f15610n4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f15112t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                h2 h2Var = this.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f15604k3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f15103k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                y2();
                W3();
                t4();
                j3Var.f(false);
                this.W2.N(false);
                h2 h2Var2 = this.H3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                post(new o2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void F4(h1 h1Var) {
        h1Var.adaptiveCreateLinkDialog = this.f15598h3;
        h1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void G1(s4.b1 b1Var) {
        a aVar = this.Q3;
        this.Q3 = null;
        this.R3 = false;
        if (aVar != null) {
            h2 h2Var = this.H3;
            if (h2Var != null) {
                h2Var.d();
            }
            s4(aVar);
            h2 h2Var2 = this.H3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            u3 u3Var = this.f15594f3;
            if (u3Var != null) {
                u3Var.onContentChanged();
            }
        } else if (b1Var != null) {
            View view = b1Var.f45910a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean G2() {
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
            return true;
        } else if (this.f15597g4 == null) {
            return false;
        } else {
            N2();
            return true;
        }
    }

    public final void G4(ki.o5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.G4(ki.o5):void");
    }

    @Override
    public final void H1(s4.b1 b1Var) {
        int b10;
        g61 G;
        a aVar = null;
        if (b1Var != null && (b10 = b1Var.b()) >= 0 && (G = this.W2.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.Q3 = aVar;
        this.R3 = false;
        u3 u3Var = this.f15594f3;
        if (u3Var != null) {
            u3Var.r();
        }
    }

    public final void H2() {
        j3 j3Var = this.f15606l3;
        if (j3Var != null) {
            j3Var.f(true);
        }
        N2();
        o3();
        IdentityHashMap identityHashMap = this.X3;
        for (a5 a5Var : identityHashMap.values()) {
            a5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.Y3;
        for (w4 w4Var : identityHashMap2.values()) {
            w4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean H3() {
        int i10;
        a z42;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f22656p0) == j3Var.f22659s0 && i10 >= 0 && i10 < this.f15610n4.size() && j3Var.f22657q0 == 1 && j3Var.f22660t0 == 1 && (z42 = z4(i10)) != null && c6.p(z42.f15097b)) {
            return true;
        }
        return false;
    }

    public final c6 H4() {
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22659s0;
            a z42 = z4(i10);
            if (i10 == i11 && z42 != null && B3(z42.f15097b)) {
                return v2(i10);
            }
            return null;
        }
        return null;
    }

    public final int I2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f15602j3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (y3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f15101i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean I3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f15602j3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f15101i && !y3(aVar)) {
                        if (!aVar.f15103k.isEmpty() || c6.p(aVar.f15097b)) {
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

    public final Editable I4(int i10, int i11, int i12, int i13) {
        if (i10 == i12) {
            if (y3(z4(i10))) {
                h1 J2 = J2(i10);
                if (J2 != null) {
                    return J2.getText();
                }
                return null;
            } else if (H3()) {
                h1 k42 = k4(i10);
                if (k42 != null) {
                    return k42.getText();
                }
                return null;
            } else {
                a z42 = z4(i10);
                if (z42 != null && B3(z42.f15097b)) {
                    int j22 = j2(i10);
                    if (i2.e.z(i11, i13, j22, 0) < i2.e.g(i11, i13, j22, 0)) {
                        c6 v22 = v2(i10);
                        if (v22 != null) {
                            return v22.getEditText().getText();
                        }
                        return c6.A(z42.f15097b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final h1 J2(int i10) {
        if (!y3(z4(i10))) {
            return null;
        }
        View B4 = B4(i10);
        if (!(B4 instanceof t0)) {
            return null;
        }
        return ((t0) B4).getEditText();
    }

    public final boolean J3() {
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22659s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a z42 = z4(i10);
                    if (z42 != null) {
                        if (D3(z42.f15097b)) {
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

    public final boolean J4(int r10, int r11, int r12, int r13, java.util.ArrayList r14) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.J4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean K3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.K3(int, int, int, int, int):boolean");
    }

    public final void K4(View view) {
        s4.b1 T;
        int b10;
        if (view != null && this.X2 != null && this.f24825a3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.W2.H(b10) >= 0) {
            this.y3 = true;
            j3 j3Var = this.f15606l3;
            if (j3Var.x()) {
                j3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.X2.r(T);
        }
    }

    public final boolean L3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            h1 O4 = O4(i11, i18);
            if (O4 != null) {
                int length = O4.length();
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
                } else if ((O4.getCurrentStyle(max, max2) & i10) == 0) {
                    return false;
                } else {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void L4(a aVar, t tVar, MediaController.PhotoEntry photoEntry) {
        int i10;
        float f7;
        a5 a5Var = (a5) this.X3.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        IdentityHashMap identityHashMap = this.Y3;
        w4 w4Var = (w4) identityHashMap.remove(tVar);
        if (w4Var != null) {
            w4Var.a();
        }
        tVar.f15510a = 1;
        tVar.f15513f = 0.0f;
        w4 w4Var2 = new w4(this.f15590d3, photoEntry, new h3(aVar, tVar, this));
        identityHashMap.put(tVar, w4Var2);
        if (!w4Var2.f15627f && !w4Var2.h && !w4Var2.f15628n) {
            w4Var2.f15627f = true;
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
                tL_message.f20296id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                w4Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(w4Var2.f15624a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                w4Var2.f15626c = messageObject;
                messageObject.videoEditedInfo = w4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(w4Var2.f15624a);
                notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(w4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(w4Var2.f15626c, false, false, false);
                return;
            }
            w4Var2.b();
        }
    }

    public final boolean M3() {
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22659s0;
            a z42 = z4(i10);
            if (i10 == i11 && z42 != null && (z42.f15097b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void M4(a aVar, t tVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.X3;
        a5 a5Var = (a5) identityHashMap.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        a5 a5Var2 = new a5(this.f15590d3, str, z10, i10, i11, i12, new i3(aVar, tVar, this));
        identityHashMap.put(tVar, a5Var2);
        a5Var2.d();
    }

    public final void N2() {
        if (this.f15623z3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.f15623z3 = false;
        this.A3 = false;
        this.B3 = null;
        this.C3 = null;
        i80 i80Var = this.f15599h4;
        if (i80Var != null) {
            this.f15599h4 = null;
            i80Var.u();
        }
        o5 o5Var = this.f15597g4;
        if (o5Var != null) {
            LinkedHashSet linkedHashSet = o5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                o5Var.v.invalidate();
                o5Var.t();
            }
            this.f15597g4 = null;
        }
        this.f15603j4 = -1;
        this.f15601i4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean N3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f15590d3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f15602j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += R3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList a32 = a3();
        ?? obj = new Object();
        obj.d = i11;
        obj.f15332b = a32.size() + obj.f15332b;
        for (int i12 = 0; i12 < a32.size(); i12++) {
            i2.b((TL_iv.PageBlock) a32.get(i12), 1, obj);
        }
        if (obj.f15331a > appGlobalConfig.richMessageLengthLimit.get() || obj.f15332b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f15333c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable N4(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof c6) {
            return ((c6) A1).getEditText().getText();
        }
        return c6.A(aVar.f15097b);
    }

    public final h1 O4(int i10, int i11) {
        View B4 = B4(i10);
        if (!(B4 instanceof o5)) {
            return null;
        }
        return ((o5) B4).l(i11);
    }

    public final int[] P3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.L3.size(); i12++) {
            int length = c6.z(((a) this.L3.get(i12)).f15097b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.L3.size() - 1;
        return new int[]{size, c6.z(((a) this.L3.get(size)).f15097b).length()};
    }

    public final h1 Q2() {
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

    public final int Q3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f15602j3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (y3(aVar)) {
                    i11++;
                } else if (aVar.f15101i && i11 - 1 == 0) {
                    return i12;
                }
                i12++;
            } else {
                return arrayList.size();
            }
        }
    }

    public final a R2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                if (c6Var.getEditText().isFocused() || (c6Var.n() && c6Var.h.isFocused())) {
                    return c6Var.getRow();
                }
            }
        }
        return null;
    }

    public final void R4() {
        boolean z10;
        int[] C4 = C4();
        if (C4 != null) {
            int i10 = C4[0];
            int i11 = C4[1];
            if (i10 >= 0) {
                ArrayList arrayList = this.f15602j3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    h2 h2Var = this.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    if (I3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f15101i;
                            ArrayList arrayList2 = aVar.f15103k;
                            if (!z11 && !y3(aVar)) {
                                if (c6.p(aVar.f15097b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f15097b.text;
                                    aVar.f15097b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a1.g.y(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = p0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f15101i;
                            ArrayList arrayList3 = aVar2.f15103k;
                            if (!z12 && !y3(aVar2)) {
                                if (c6.p(aVar2.f15097b)) {
                                    long a10 = p0.a();
                                    TL_iv.RichText k10 = c6.k(aVar2.f15097b);
                                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                                        this.f15604k3.put(Long.valueOf(a10), k10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f15097b.text;
                                    aVar2.f15097b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    y2();
                    W3();
                    t4();
                    j3 j3Var = this.f15606l3;
                    if (j3Var != null && j3Var.x()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.W2.N(false);
                    h2 h2Var2 = this.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    if (z10) {
                        post(new ig.e2(this, aVar3, aVar4, 4));
                    } else {
                        post(new o2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void S1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.S1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final o5 S2() {
        View findFocus = findFocus();
        if (findFocus instanceof h1) {
            return V2((h1) findFocus);
        }
        return null;
    }

    public final void S4(ki.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.S4(ki.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
    }

    public final TLRPC.Document T2(long j10) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        TLRPC.Document document2 = null;
        if (i10 == 0) {
            return null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f15602j3.size(); i12++) {
            for (t tVar : R3((a) this.f15602j3.get(i12))) {
                if (tVar != null && (document = tVar.h) != null && document.f20281id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f15600i3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f20281id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = v4.f15581a;
        synchronized (v4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) v4.f15582b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean T4() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.T4():boolean");
    }

    public final void U1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        w3 w3Var;
        if (aVar != null && E3(aVar.f15097b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                h2 h2Var = this.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                t U3 = U3(photoEntry, str2);
                boolean c10 = w4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (C3(aVar.f15097b)) {
                    h3(aVar.f15097b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(U3);
                } else {
                    t tVar = aVar.f15100g;
                    if (tVar != null && tVar.f15510a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f15097b.caption;
                        k0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f15097b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f15100g);
                        aVar.h.add(U3);
                        aVar.f15100g = null;
                        aVar.f15097b = pageblockcollage;
                    } else {
                        aVar.f15097b = pageblockvideo;
                        aVar.f15100g = U3;
                    }
                }
                this.W2.N(false);
                o4(aVar);
                if (c10) {
                    L4(aVar, U3, photoEntry);
                    w3Var = this;
                } else {
                    w3Var = this;
                    w3Var.M4(aVar, U3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                h2 h2Var2 = w3Var.H3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                w3Var.f15594f3.onContentChanged();
            }
        }
    }

    public final int U2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f15602j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f15101i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (y3(aVar2)) {
                        i13++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.f15097b).open) {
                            i12 = i13;
                        }
                    } else if (aVar2.f15101i) {
                        if (i12 != -1 && i13 == i12) {
                            i12 = -1;
                        }
                        i13--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f15097b;
                    if (!F3(pageBlock) || m3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockTable)) {
                        return i10;
                    }
                }
            }
            i10 += i11;
        }
        return -1;
    }

    public final boolean U4(android.view.View r11, float r12, float r13) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.U4(android.view.View, float, float):boolean");
    }

    public final void V1(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            h2 h2Var = this.H3;
            if (h2Var != null) {
                h2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f15600i3;
            if (richMessage2 == null) {
                this.f15600i3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f15600i3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            X2(arrayList4, richMessage.blocks, this.f15604k3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    w4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f15602j3;
                int size = arrayList5.size();
                a R2 = R2();
                if (R2 != null && (indexOf = arrayList5.indexOf(R2)) >= 0) {
                    TL_iv.PageBlock pageBlock = R2.f15097b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && c6.z(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                W3();
                t4();
                this.W2.N(false);
                h2 h2Var2 = this.H3;
                if (h2Var2 != null) {
                    h2Var2.h();
                }
                u3 u3Var = this.f15594f3;
                if (u3Var != null) {
                    u3Var.onContentChanged();
                }
            }
        }
    }

    public final a V3(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f15610n4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f15101i) {
                    if (aVar.f15112t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f15097b;
                        if (F3(pageBlock) && !m3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockTable)) {
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

    public final void V4(a aVar, TL_iv.PageBlock pageBlock, int i10, int i11, boolean z10, boolean z11) {
        Editable A;
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 != null && pageBlock != null) {
            ArrayList arrayList = this.f15602j3;
            if (arrayList.indexOf(aVar2) >= 0 && !y3(aVar2) && !aVar2.f15101i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f15097b;
                if (pageBlock != pageBlock2 && B3(pageBlock2) && B3(pageBlock)) {
                    c6 v22 = v2(arrayList.indexOf(aVar2));
                    if (v22 != null) {
                        A = v22.getEditText().getText();
                    } else {
                        A = c6.A(aVar2.f15097b);
                    }
                    c6.e(pageBlock, A);
                    TL_iv.RichText k10 = c6.k(aVar2.f15097b);
                    if (k10 != null && c6.k(pageBlock) != null) {
                        if (pageBlock instanceof TL_iv.pageBlockBlockquote) {
                            ((TL_iv.pageBlockBlockquote) pageBlock).caption = k10;
                        } else if (pageBlock instanceof TL_iv.pageBlockPullquote) {
                            ((TL_iv.pageBlockPullquote) pageBlock).caption = k10;
                        }
                    }
                }
                S4(aVar2, pageBlock, i10, i11, z10, z11);
            }
        }
    }

    public final a W1(a aVar, int i10) {
        int i11;
        ArrayList arrayList = this.f15610n4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f15112t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void W2() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                c6Var.f15184f.n();
                c6Var.h.n();
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof t0) {
                ((t0) childAt).getEditText().n();
            }
        }
    }

    public final void W3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15602j3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f15103k.isEmpty() && c6.p(aVar.f15097b)) {
                    long a2 = p0.a();
                    TL_iv.RichText k10 = c6.k(aVar.f15097b);
                    if (k10 != null && !(k10 instanceof TL_iv.textEmpty)) {
                        this.f15604k3.put(Long.valueOf(a2), k10);
                    }
                    aVar.f15103k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f15097b.text;
                    aVar.f15097b = pageblockparagraph;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void W4(a aVar, TL_iv.PageBlock pageBlock) {
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        V4(aVar2, pageBlock, aVar2.f15098c, aVar2.d, aVar2.e, aVar2.f15099f);
    }

    public final boolean X1(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.X1(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean X3(ki.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.X3(ki.a, boolean):boolean");
    }

    public final void X4(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        w3 w3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = Y4();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            V4(aVar2, aVar2.f15097b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f15098c);
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
        TL_iv.PageBlock pageBlock2 = aVar2.f15097b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f15099f) {
            z11 = true;
            pageBlock = pageBlock2;
            w3Var = this;
        } else {
            z11 = false;
            w3Var = this;
            pageBlock = pageBlock2;
        }
        w3Var.V4(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void Y1() {
        c6 c6Var;
        a aVar;
        z5 z5Var;
        this.W2.S();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof c6) && (aVar = (c6Var = (c6) childAt).f15189x) != null && (z5Var = c6Var.f15190y) != null) {
                c6Var.g(aVar, z5Var, c6Var.E);
            }
        }
    }

    public final void Y3() {
        int length;
        int z10;
        int g10;
        int length2;
        int z11;
        int g11;
        int length3;
        int z12;
        int g12;
        int length4;
        int z13;
        int g13;
        h1 O4;
        int length5;
        int z14;
        int g14;
        boolean M3 = M3();
        j3 j3Var = this.f15606l3;
        if (M3) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22657q0;
            if (i11 == j3Var.f22660t0 && (O4 = O4(i10, i11)) != null && (z14 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length5 = O4.length()), 0)) < (g14 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length5, 0))) {
                h2 h2Var = this.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                if (e6.h(O4.getText(), z14, g14)) {
                    e6.n(O4.getText(), z14, g14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    h2 h2Var2 = this.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    p4();
                }
                O4.setSelectionOverride(z14, g14);
                O4.makeSelectedDate();
            }
        } else if (z3()) {
            int i12 = j3Var.f22656p0;
            h1 J2 = J2(i12);
            if (J2 != null && (z13 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length4 = J2.length()), 0)) < (g13 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length4, 0))) {
                h2 h2Var3 = this.H3;
                if (h2Var3 != null) {
                    h2Var3.d();
                }
                if (e6.h(J2.getText(), z13, g13)) {
                    e6.n(J2.getText(), z13, g13);
                    J2.invalidateEffects();
                    f4(i12);
                    h2 h2Var4 = this.H3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    p4();
                }
                J2.setSelectionOverride(z13, g13);
                J2.makeSelectedDate();
            }
        } else if (x3()) {
            int i13 = j3Var.f22656p0;
            h1 t22 = t2(i13);
            if (t22 != null && (z12 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length3 = t22.length()), 0)) < (g12 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length3, 0))) {
                h2 h2Var5 = this.H3;
                if (h2Var5 != null) {
                    h2Var5.d();
                }
                if (e6.h(t22.getText(), z12, g12)) {
                    e6.n(t22.getText(), z12, g12);
                    t22.invalidateEffects();
                    e4(i13);
                    h2 h2Var6 = this.H3;
                    if (h2Var6 != null) {
                        h2Var6.h();
                    }
                    p4();
                }
                t22.setSelectionOverride(z12, g12);
                t22.makeSelectedDate();
            }
        } else if (H3()) {
            int i14 = j3Var.f22656p0;
            h1 k42 = k4(i14);
            if (k42 != null && (z11 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length2 = k42.length()), 0)) < (g11 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length2, 0))) {
                h2 h2Var7 = this.H3;
                if (h2Var7 != null) {
                    h2Var7.d();
                }
                if (e6.h(k42.getText(), z11, g11)) {
                    e6.n(k42.getText(), z11, g11);
                    k42.invalidateEffects();
                    g4(i14);
                    h2 h2Var8 = this.H3;
                    if (h2Var8 != null) {
                        h2Var8.h();
                    }
                    p4();
                }
                k42.setSelectionOverride(z11, g11);
                k42.makeSelectedDate();
            }
        } else {
            c6 H4 = H4();
            if (H4 == null || (z10 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length = H4.getEditText().length()), 0)) >= (g10 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length, 0))) {
                return;
            }
            h2 h2Var9 = this.H3;
            if (h2Var9 != null) {
                h2Var9.d();
            }
            if (e6.h(H4.getEditText().getText(), z10, g10)) {
                e6.n(H4.getEditText().getText(), z10, g10);
                H4.getEditText().invalidateEffects();
                H4.x();
                h2 h2Var10 = this.H3;
                if (h2Var10 != null) {
                    h2Var10.h();
                }
                p4();
            }
            H4.getEditText().setSelectionOverride(z10, g10);
            H4.getEditText().makeSelectedDate();
        }
    }

    public final a Y4() {
        j3 j3Var;
        int i10;
        a R2 = R2();
        if (R2 == null && (j3Var = this.f15606l3) != null && j3Var.x() && (i10 = j3Var.f22656p0) == j3Var.f22659s0) {
            return z4(i10);
        }
        return R2;
    }

    public final boolean Z1(int i10, int i11) {
        j3 j3Var;
        ArrayList arrayList = this.L3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] P3 = P3(max);
            int[] P32 = P3(max2);
            a aVar = (a) this.L3.get(P3[0]);
            if (P3[0] != P32[0] && max != max2) {
                View A1 = A1(aVar);
                View A12 = A1(this.L3.get(P32[0]));
                if ((A1 instanceof c6) && (A12 instanceof c6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f15602j3;
                        int size = arrayList2.size();
                        j3Var = this.f15606l3;
                        if (i12 >= size) {
                            break;
                        }
                        j3Var.X(i12, c6.z(((a) arrayList2.get(i12)).f15097b));
                        i12++;
                    }
                    c6 c6Var = (c6) A1;
                    int length = c6Var.getEditText().length();
                    if (P3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!j3Var.j0(c6Var, 0, P3[1], length)) {
                        c6Var.B();
                        return true;
                    }
                    j3Var.b0(0, P32[1], (c6) A12);
                    return true;
                }
            } else {
                View A13 = A1(aVar);
                if (A13 instanceof c6) {
                    c6 c6Var2 = (c6) A13;
                    c6Var2.B();
                    h1 editText = c6Var2.getEditText();
                    int length2 = editText.length();
                    editText.setSelection(Math.min(P3[1], length2), Math.min(P32[1], length2));
                }
            }
            return false;
        }
        return true;
    }

    public final ArrayList Z2(int i10, int i11, int i12, boolean z10) {
        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks;
        TL_iv.RichText textempty;
        boolean z11;
        w3 w3Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f15602j3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f15101i;
            ArrayList arrayList3 = aVar.f15103k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f15103k.size() <= i12 || ((Long) aVar2.f15103k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> Z2 = Z2(i15, i16, i12 + 1, true);
                if (Z2.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f15604k3.get(l4);
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    if (Z2.size() == 1 && (Z2.get(0) instanceof TL_iv.pageBlockParagraph)) {
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        if (Z2.get(0).text != null) {
                            textempty = Z2.get(0).text;
                        } else {
                            textempty = new TL_iv.textEmpty();
                        }
                        pageblockblockquote.text = textempty;
                        pageblockblockquote.caption = richText;
                        pageblockblockquoteblocks = pageblockblockquote;
                    } else {
                        pageblockblockquoteblocks = new TL_iv.pageBlockBlockquoteBlocks();
                        pageblockblockquoteblocks.blocks = Z2;
                        pageblockblockquoteblocks.caption = richText;
                    }
                }
                if (pageblockblockquoteblocks != null) {
                    arrayList.add(pageblockblockquoteblocks);
                }
                i15 = i16;
            } else if (y3(aVar)) {
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f15097b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int Q3 = Q3(i15);
                pageblockdetails.blocks = Z2(i15 + 1, Math.min(Q3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = Q3 + 1;
            } else {
                int i17 = aVar.f15098c;
                if (i17 <= 0) {
                    K2(arrayList, aVar);
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
                    TL_iv.PageBlock l22 = w3Var.l2(i15, i17, i13, i14, z11, iArr);
                    if (l22 != null) {
                        arrayList.add(l22);
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
            while (!arrayList.isEmpty() && A3((TL_iv.PageBlock) arrayList.get(0))) {
                arrayList.remove(0);
            }
            while (!arrayList.isEmpty() && A3((TL_iv.PageBlock) i2.e.h(1, arrayList))) {
                a1.g.y(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void Z3(int i10) {
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
        int g10;
        boolean z12;
        int i16;
        int length2;
        int z13;
        int g11;
        boolean z14;
        int i17;
        int length3;
        int z15;
        int g12;
        boolean z16;
        int i18;
        h2 h2Var2;
        int i19;
        int i20;
        int i21;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            boolean M3 = M3();
            u3 u3Var = this.f15594f3;
            int i22 = 0;
            if (M3) {
                int i23 = j3Var.f22656p0;
                int i24 = j3Var.f22657q0;
                int i25 = j3Var.f22660t0;
                int i26 = j3Var.f22658r0;
                int i27 = j3Var.f22661u0;
                boolean L3 = L3(i10, i23, i24, i26, i25, i27);
                if (!L3) {
                    i18 = x2(i10);
                } else {
                    i18 = 0;
                }
                h2 h2Var3 = this.H3;
                if (h2Var3 != null) {
                    h2Var3.d();
                }
                this.G3 = true;
                int i28 = i24;
                boolean z17 = false;
                while (i28 <= i25) {
                    h1 O4 = O4(i23, i28);
                    if (O4 == null) {
                        i21 = i24;
                    } else {
                        int length4 = O4.length();
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
                            if (!L3) {
                                if (i18 != 0) {
                                    O4.removeStyle(i18, max, max2);
                                }
                                O4.addStyle(i10, max, max2);
                            } else {
                                O4.removeStyle(i10, max, max2);
                            }
                            O4.invalidateEffects();
                            O4.requestLayout();
                            h4(i23, i28);
                            z17 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.G3 = false;
                if (z17 && (h2Var2 = this.H3) != null) {
                    h2Var2.h();
                }
                u3Var.p();
                if (z17) {
                    p4();
                }
            } else if (z3()) {
                int i30 = j3Var.f22656p0;
                h1 J2 = J2(i30);
                if (J2 != null && (z15 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length3 = J2.length()), 0)) < (g12 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length3, 0))) {
                    if ((J2.getCurrentStyle(z15, g12) & i10) == 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    h2 h2Var4 = this.H3;
                    if (h2Var4 != null) {
                        h2Var4.d();
                    }
                    this.G3 = true;
                    if (z16) {
                        int x22 = x2(i10);
                        if (x22 != 0) {
                            J2.removeStyle(x22, z15, g12);
                        }
                        J2.addStyle(i10, z15, g12);
                    } else {
                        J2.removeStyle(i10, z15, g12);
                    }
                    this.G3 = false;
                    f4(i30);
                    J2.invalidateEffects();
                    J2.requestLayout();
                    h2 h2Var5 = this.H3;
                    if (h2Var5 != null) {
                        h2Var5.h();
                    }
                    u3Var.p();
                    p4();
                }
            } else if (x3()) {
                int i31 = j3Var.f22656p0;
                h1 t22 = t2(i31);
                if (t22 != null && (z13 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length2 = t22.length()), 0)) < (g11 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length2, 0))) {
                    if ((t22.getCurrentStyle(z13, g11) & i10) == 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        i17 = x2(i10);
                    } else {
                        i17 = 0;
                    }
                    h2 h2Var6 = this.H3;
                    if (h2Var6 != null) {
                        h2Var6.d();
                    }
                    this.G3 = true;
                    if (z14) {
                        if (i17 != 0) {
                            t22.removeStyle(i17, z13, g11);
                        }
                        t22.addStyle(i10, z13, g11);
                    } else {
                        t22.removeStyle(i10, z13, g11);
                    }
                    t22.invalidateEffects();
                    t22.requestLayout();
                    e4(i31);
                    this.G3 = false;
                    h2 h2Var7 = this.H3;
                    if (h2Var7 != null) {
                        h2Var7.h();
                    }
                    u3Var.p();
                    p4();
                }
            } else if (H3()) {
                int i32 = j3Var.f22656p0;
                h1 k42 = k4(i32);
                if (k42 != null && (z11 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length = k42.length()), 0)) < (g10 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length, 0))) {
                    if ((k42.getCurrentStyle(z11, g10) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i16 = x2(i10);
                    } else {
                        i16 = 0;
                    }
                    h2 h2Var8 = this.H3;
                    if (h2Var8 != null) {
                        h2Var8.d();
                    }
                    this.G3 = true;
                    if (z12) {
                        if (i16 != 0) {
                            k42.removeStyle(i16, z11, g10);
                        }
                        k42.addStyle(i10, z11, g10);
                    } else {
                        k42.removeStyle(i10, z11, g10);
                    }
                    k42.invalidateEffects();
                    k42.requestLayout();
                    g4(i32);
                    this.G3 = false;
                    h2 h2Var9 = this.H3;
                    if (h2Var9 != null) {
                        h2Var9.h();
                    }
                    u3Var.p();
                    p4();
                }
            } else {
                int i33 = j3Var.f22656p0;
                int i34 = j3Var.f22659s0;
                int i35 = j3Var.f22658r0;
                int i36 = j3Var.f22661u0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f15610n4.size()) {
                    int i37 = i10;
                    boolean K3 = K3(i37, i33, i35, i34, i36);
                    boolean z18 = !K3;
                    if (!K3) {
                        i11 = x2(i37);
                    } else {
                        i11 = 0;
                    }
                    h2 h2Var10 = this.H3;
                    if (h2Var10 != null) {
                        h2Var10.d();
                    }
                    this.G3 = true;
                    int i38 = i33;
                    boolean z19 = false;
                    while (i38 <= i34) {
                        a z42 = z4(i38);
                        if (z42 != null) {
                            TL_iv.PageBlock pageBlock = z42.f15097b;
                            if (B3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int j22 = j2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = i22;
                                }
                                z10 = z19;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = j22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, j22));
                                int max4 = Math.max(i22, Math.min(i14, j22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z19 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    c6 v22 = v2(i38);
                                    if (v22 != null) {
                                        org.telegram.ui.ActionBar.w4 styleDelegate = v22.getStyleDelegate();
                                        if (!K3) {
                                            if (i11 != 0) {
                                                styleDelegate.removeStyle(i11, max3, max4);
                                            }
                                            styleDelegate.addStyle(i37, max3, max4);
                                        } else {
                                            styleDelegate.removeStyle(i37, max3, max4);
                                        }
                                        v22.getEditText().invalidateEffects();
                                        v22.getEditText().requestLayout();
                                        v22.x();
                                        i12 = i11;
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(c6.A(z42.f15097b));
                                        if (!K3 && i11 != 0) {
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
                                        c6.e(z42.f15097b, spannableStringBuilder);
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
                    this.G3 = i22;
                    if (z20 && (h2Var = this.H3) != null) {
                        h2Var.h();
                    }
                    u3Var.p();
                    if (z20) {
                        p4();
                    }
                }
            }
        }
    }

    public final void Z4(float f7, float f10) {
        TL_iv.pageTableCell m10;
        o5 o5Var = this.f15597g4;
        if (this.f15623z3 && o5Var != null && this.f15620v3 == o5Var && (m10 = o5Var.m((int) ((f7 - o5Var.getLeft()) - getLeft()), (int) ((f10 - o5Var.getTop()) - getTop()))) != null && m10 != this.C3) {
            this.C3 = m10;
            o5Var.w(this.B3, m10);
        }
    }

    public final ArrayList a3() {
        return Z2(0, this.f15602j3.size(), 0, false);
    }

    public final void a4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.a4(android.view.View):void");
    }

    public final void a5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f15097b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    h2 h2Var = this.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    c6 v22 = v2(this.f15602j3.indexOf(aVar));
                    if (v22 != null && (aVar2 = v22.f15189x) != null) {
                        v22.I(aVar2.f15097b, true);
                        v22.H = null;
                        v22.C();
                    }
                    h2 h2Var2 = this.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                }
            }
        }
    }

    public final void b2() {
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
            ArrayList arrayList6 = this.f15602j3;
            if (i18 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i18);
                ArrayList arrayList7 = aVar.f15102j;
                ArrayList arrayList8 = aVar.f15103k;
                arrayList7.clear();
                int i19 = 1;
                if (aVar.f15101i) {
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
                    int max = Math.max(i17, aVar.f15098c);
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
                                if (((Long) arrayList5.get(i23)).longValue() != 0 && F3(aVar.f15097b)) {
                                    i15 = i12;
                                } else {
                                    i15 = i14;
                                }
                                if (i15 != 0) {
                                    arrayList4.set(i23, Integer.valueOf(((Integer) arrayList4.get(i23)).intValue() + 1));
                                    arrayList5.set(i23, Long.valueOf(aVar.f15096a));
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
                    if (y3(aVar)) {
                        boolean z11 = ((TL_iv.pageBlockDetails) aVar.f15097b).open;
                        p0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (c6.p(aVar.f15097b)) {
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

    public final boolean b3() {
        a aVar;
        ArrayList arrayList = this.f15602j3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) i2.e.h(1, arrayList);
        }
        if (aVar != null && !F3(aVar.f15097b) && !aVar.f15101i && !y3(aVar) && !L2(aVar.f15097b)) {
            if (!(A1(aVar) instanceof c6)) {
                return false;
            }
            f3(aVar);
            return true;
        }
        h2 h2Var = this.H3;
        if (h2Var != null) {
            h2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.W2.N(false);
        h2 h2Var2 = this.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        post(new o2(this, aVar2, 21));
        return true;
    }

    public final void b4() {
        int length;
        int z10;
        int g10;
        int length2;
        int z11;
        int g11;
        int length3;
        int z12;
        int g12;
        int length4;
        int z13;
        int g13;
        h1 O4;
        int length5;
        int z14;
        int g14;
        boolean M3 = M3();
        u3 u3Var = this.f15594f3;
        j3 j3Var = this.f15606l3;
        if (M3) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22657q0;
            if (i11 == j3Var.f22660t0 && (O4 = O4(i10, i11)) != null && (z14 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length5 = O4.length()), 0)) < (g14 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length5, 0))) {
                if (e6.h(O4.getText(), z14, g14)) {
                    h2 h2Var = this.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    e6.n(O4.getText(), z14, g14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    h2 h2Var2 = this.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    u3Var.p();
                    p4();
                    return;
                }
                h2 h2Var3 = this.H3;
                if (h2Var3 != null) {
                    h2Var3.d();
                }
                if (e6.g(O4.getText(), z14, g14)) {
                    e6.m(O4.getText(), z14, g14);
                    O4.invalidateEffects();
                    h4(i10, i11);
                    h2 h2Var4 = this.H3;
                    if (h2Var4 != null) {
                        h2Var4.h();
                    }
                    p4();
                }
                O4.setSelectionOverride(z14, g14);
                p3(false);
                F4(O4);
            }
        } else if (z3()) {
            int i12 = j3Var.f22656p0;
            h1 J2 = J2(i12);
            if (J2 != null && (z13 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length4 = J2.length()), 0)) < (g13 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length4, 0))) {
                if (e6.h(J2.getText(), z13, g13)) {
                    h2 h2Var5 = this.H3;
                    if (h2Var5 != null) {
                        h2Var5.d();
                    }
                    e6.n(J2.getText(), z13, g13);
                    J2.invalidateEffects();
                    f4(i12);
                    h2 h2Var6 = this.H3;
                    if (h2Var6 != null) {
                        h2Var6.h();
                    }
                    u3Var.p();
                    p4();
                    return;
                }
                h2 h2Var7 = this.H3;
                if (h2Var7 != null) {
                    h2Var7.d();
                }
                if (e6.g(J2.getText(), z13, g13)) {
                    e6.m(J2.getText(), z13, g13);
                    J2.invalidateEffects();
                    f4(i12);
                    h2 h2Var8 = this.H3;
                    if (h2Var8 != null) {
                        h2Var8.h();
                    }
                    p4();
                }
                J2.setSelectionOverride(z13, g13);
                p3(false);
                F4(J2);
            }
        } else if (x3()) {
            int i13 = j3Var.f22656p0;
            h1 t22 = t2(i13);
            if (t22 != null && (z12 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length3 = t22.length()), 0)) < (g12 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length3, 0))) {
                if (e6.h(t22.getText(), z12, g12)) {
                    h2 h2Var9 = this.H3;
                    if (h2Var9 != null) {
                        h2Var9.d();
                    }
                    e6.n(t22.getText(), z12, g12);
                    t22.invalidateEffects();
                    e4(i13);
                    h2 h2Var10 = this.H3;
                    if (h2Var10 != null) {
                        h2Var10.h();
                    }
                    u3Var.p();
                    p4();
                    return;
                }
                h2 h2Var11 = this.H3;
                if (h2Var11 != null) {
                    h2Var11.d();
                }
                if (e6.g(t22.getText(), z12, g12)) {
                    e6.m(t22.getText(), z12, g12);
                    t22.invalidateEffects();
                    e4(i13);
                    h2 h2Var12 = this.H3;
                    if (h2Var12 != null) {
                        h2Var12.h();
                    }
                    p4();
                }
                t22.setSelectionOverride(z12, g12);
                p3(false);
                F4(t22);
            }
        } else if (H3()) {
            int i14 = j3Var.f22656p0;
            h1 k42 = k4(i14);
            if (k42 != null && (z11 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length2 = k42.length()), 0)) < (g11 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length2, 0))) {
                if (e6.h(k42.getText(), z11, g11)) {
                    h2 h2Var13 = this.H3;
                    if (h2Var13 != null) {
                        h2Var13.d();
                    }
                    e6.n(k42.getText(), z11, g11);
                    k42.invalidateEffects();
                    g4(i14);
                    h2 h2Var14 = this.H3;
                    if (h2Var14 != null) {
                        h2Var14.h();
                    }
                    u3Var.p();
                    p4();
                    return;
                }
                h2 h2Var15 = this.H3;
                if (h2Var15 != null) {
                    h2Var15.d();
                }
                if (e6.g(k42.getText(), z11, g11)) {
                    e6.m(k42.getText(), z11, g11);
                    k42.invalidateEffects();
                    g4(i14);
                    h2 h2Var16 = this.H3;
                    if (h2Var16 != null) {
                        h2Var16.h();
                    }
                    p4();
                }
                k42.setSelectionOverride(z11, g11);
                p3(false);
                F4(k42);
            }
        } else {
            c6 H4 = H4();
            if (H4 == null || (z10 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length = H4.getEditText().length()), 0)) >= (g10 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length, 0))) {
                return;
            }
            if (e6.h(H4.getEditText().getText(), z10, g10)) {
                h2 h2Var17 = this.H3;
                if (h2Var17 != null) {
                    h2Var17.d();
                }
                e6.n(H4.getEditText().getText(), z10, g10);
                H4.getEditText().invalidateEffects();
                H4.x();
                h2 h2Var18 = this.H3;
                if (h2Var18 != null) {
                    h2Var18.h();
                }
                u3Var.p();
                p4();
                return;
            }
            h2 h2Var19 = this.H3;
            if (h2Var19 != null) {
                h2Var19.d();
            }
            if (e6.g(H4.getEditText().getText(), z10, g10)) {
                e6.m(H4.getEditText().getText(), z10, g10);
                H4.getEditText().invalidateEffects();
                H4.x();
                h2 h2Var20 = this.H3;
                if (h2Var20 != null) {
                    h2Var20.h();
                }
                p4();
            }
            H4.getEditText().setSelectionOverride(z10, g10);
            p3(false);
            F4(H4.getEditText());
        }
    }

    public final void c2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            h2 h2Var = this.H3;
            if (h2Var != null) {
                h2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            t tVar = new t();
            aVar.f15100g = tVar;
            tVar.f15512c = true;
            long j10 = document.f20281id;
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
                t tVar2 = aVar.f15100g;
                tVar2.f15515i = document;
                tVar2.e = str;
                tVar2.f15510a = 1;
                tVar2.f15513f = 0.0f;
            } else {
                tVar.h = document;
                tVar.f15515i = document;
                tVar.f15510a = 2;
                pageblockaudio.audio_id = j10;
            }
            v3(aVar);
            if (z10) {
                t tVar3 = aVar.f15100g;
                String str2 = tVar3.e;
                IdentityHashMap identityHashMap = this.X3;
                a5 a5Var = (a5) identityHashMap.remove(tVar3);
                if (a5Var != null) {
                    a5Var.b();
                }
                a5 a5Var2 = new a5(this.f15590d3, str2, document, new g3(aVar, tVar3, this));
                identityHashMap.put(tVar3, a5Var2);
                a5Var2.d();
            }
            h2 h2Var2 = this.H3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            this.f15594f3.onContentChanged();
        }
    }

    public final void c3(a aVar, boolean z10) {
        int i10;
        View A1 = A1(aVar);
        if (A1 instanceof g5) {
            h1 h1Var = ((g5) A1).f15287r;
            h1Var.r();
            if (z10) {
                i10 = h1Var.length();
            } else {
                i10 = 0;
            }
            h1Var.setSelection(i10);
            return;
        }
        d3(aVar, z10);
    }

    public final void c4() {
        h1 editText;
        Runnable k2Var;
        int length;
        final int z10;
        final int g10;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            if (M3()) {
                int i10 = j3Var.f22656p0;
                int i11 = j3Var.f22657q0;
                if (i11 == j3Var.f22660t0) {
                    editText = O4(i10, i11);
                    k2Var = new p2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (z3()) {
                int i12 = j3Var.f22656p0;
                editText = J2(i12);
                k2Var = new j2(this, i12, 3);
            } else if (x3()) {
                int i13 = j3Var.f22656p0;
                editText = t2(i13);
                k2Var = new j2(this, i13, 0);
            } else if (H3()) {
                int i14 = j3Var.f22656p0;
                editText = k4(i14);
                k2Var = new j2(this, i14, 1);
            } else {
                c6 H4 = H4();
                if (H4 != null) {
                    editText = H4.getEditText();
                    k2Var = new k2(H4, 0);
                } else {
                    return;
                }
            }
            final h1 h1Var = editText;
            final Runnable runnable = k2Var;
            if (h1Var != null && (z10 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length = h1Var.length()), 0)) <= (g10 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length, 0))) {
                Editable text = h1Var.getText();
                int i15 = s.h;
                String str = null;
                if (text != null) {
                    s[] sVarArr = (s[]) text.getSpans(z10, g10, s.class);
                    if (sVarArr.length > 0) {
                        str = sVarArr[0].f15495a;
                    }
                }
                if (str == null) {
                    str = h1Var.getText().subSequence(z10, g10).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = h6.G6;
                org.telegram.ui.ActionBar.d6 d6Var = this.f15592e3;
                final int w02 = h6.w0(i16, d6Var);
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
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        j3 j3Var2 = w3Var.f15606l3;
                        if (j3Var2 != null) {
                            j3Var2.f(false);
                        }
                        h1 h1Var2 = h1Var;
                        h1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = h1Var2.getText();
                        int max = Math.max(0, Math.min(z10, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(g10, text2.length())), spannableString);
                        runnable.run();
                        h2 h2Var2 = w3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.f15594f3.onContentChanged();
                        int min = Math.min(max + 1, h1Var2.length());
                        h1Var2.r();
                        w3Var.post(new v2(h1Var2, min, 3));
                    }
                }, d6Var);
            }
        }
    }

    public final void c5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.c5(java.lang.CharSequence):void");
    }

    public final void d2(String str) {
        String str2;
        int i10;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                return;
            }
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.f20281id = 0L;
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
            e2(tL_document, str);
        }
    }

    public final void d3(a aVar, boolean z10) {
        View A1 = A1(aVar);
        if (A1 instanceof o5) {
            o5 o5Var = (o5) A1;
            h1 h1Var = o5Var.f15433r;
            g6 g6Var = o5Var.F;
            if (g6Var != null) {
                if (!z10) {
                    h1Var.r();
                    h1Var.setSelection(0);
                    return;
                } else if (!g6Var.f15294g.isEmpty()) {
                    r5 m10 = o5Var.v.m((TL_iv.pageTableCell) i2.e.h(1, o5Var.F.f15294g));
                    if (m10 != null) {
                        h1 h1Var2 = m10.f15493a;
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
        if (z10 && (A1 instanceof c6)) {
            c6 c6Var = (c6) A1;
            if (c6Var.n()) {
                c6Var.i();
                return;
            }
        }
        h1 S3 = S3(A1);
        if (S3 == null) {
            e3(aVar);
            return;
        }
        S3.r();
        if (z10) {
            S3.setSelection(S3.length());
        }
    }

    public final void d4() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.d4():void");
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
                arrayList = this.f15610n4;
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
                    ArrayList arrayList3 = aVar5.f15103k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f15612o4 == null) {
                    pm0 pm0Var = new pm0(this);
                    this.f15612o4 = pm0Var;
                    pm0Var.a(null, null, null, this.f15592e3, 1);
                    w7.i.a(this.f15612o4, this.f15592e3);
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
                                ArrayList arrayList4 = aVar.f15103k;
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
                            int l42 = l4(i15, aVar6, true);
                            l10 = l4;
                            int l43 = l4(i15, aVar7, false);
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
                                int B = org.telegram.messenger.g0.B(16.0f, getWidth(), dp);
                                if (B - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, l42 + f10, B, f12 - l43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.f15612o4.b(floor, floor, floor, f11, canvas, rectF);
                                    f7 = f11;
                                    this.f15612o4.e(canvas, rectF, f7);
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
                            if (aVar != null && aVar == this.Q3) {
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

    public final void e2(TLRPC.Document document, String str) {
        if (document != null) {
            h2 h2Var = this.H3;
            if (h2Var != null) {
                h2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            t tVar = new t();
            aVar.f15100g = tVar;
            tVar.d = true;
            long j10 = document.f20281id;
            if (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                if (!TextUtils.isEmpty(str) && r4.c.t(str)) {
                    t tVar2 = aVar.f15100g;
                    tVar2.h = document;
                    tVar2.e = str;
                    tVar2.f15510a = 1;
                    tVar2.f15513f = 0.0f;
                } else {
                    return;
                }
            } else {
                tVar.h = document;
                tVar.f15510a = 2;
                pageblockdocument.document_id = j10;
            }
            v3(aVar);
            if (z10) {
                t tVar3 = aVar.f15100g;
                IdentityHashMap identityHashMap = this.X3;
                a5 a5Var = (a5) identityHashMap.remove(tVar3);
                if (a5Var != null) {
                    a5Var.b();
                }
                a5 a5Var2 = new a5(this.f15590d3, str, document, new f3(this, tVar3, aVar, str));
                identityHashMap.put(tVar3, a5Var2);
                a5Var2.d();
            }
            h2 h2Var2 = this.H3;
            if (h2Var2 != null) {
                h2Var2.h();
            }
            this.f15594f3.onContentChanged();
        }
    }

    public final void e3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof c6) {
            ((c6) A1).B();
        } else if (A1 instanceof t0) {
            ((t0) A1).d.r();
        }
    }

    public final void e4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof l0) {
            ((l0) B4).b();
        }
    }

    public final void f2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.Z3;
            String str = null;
            this.Z3 = null;
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
            int i10 = this.f15614p4;
            this.f15614p4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new r2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void f3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof c6) {
            c6 c6Var = (c6) A1;
            c6Var.B();
            h1 editText = c6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (A1 instanceof t0) {
            t0 t0Var = (t0) A1;
            t0Var.d.r();
            h1 editText2 = t0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void f4(int i10) {
        a z42 = z4(i10);
        h1 J2 = J2(i10);
        if (y3(z42) && J2 != null) {
            ((TL_iv.pageBlockDetails) z42.f15097b).title = e6.f(J2.getText());
        }
    }

    public final void g2(MediaController.PhotoEntry photoEntry) {
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
        h2 h2Var = this.H3;
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
        aVar.f15100g = U3(photoEntry, str2);
        v3(aVar);
        if (c10) {
            L4(aVar, aVar.f15100g, photoEntry);
            w3Var = this;
        } else {
            w3Var = this;
            w3Var.M4(aVar, aVar.f15100g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        h2 h2Var2 = w3Var.H3;
        if (h2Var2 != null) {
            h2Var2.h();
        }
        w3Var.f15594f3.onContentChanged();
    }

    public final void g3(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof c6) {
            c6 c6Var = (c6) A1;
            c6Var.B();
            c6Var.getEditText().setSelection(0);
        } else if (A1 instanceof t0) {
            t0 t0Var = (t0) A1;
            t0Var.d.r();
            t0Var.getEditText().setSelection(0);
        }
    }

    public final void g4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof c6) {
            ((c6) B4).w();
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
        return this.f15588b4;
    }

    public View getOverlayView() {
        return this.f15607m3;
    }

    public n9 getTextSelectionHelper() {
        return this.f15606l3;
    }

    public final void h2(o5 o5Var) {
        o5 o5Var2 = this.f15597g4;
        if (o5Var2 != null && o5Var2 != o5Var) {
            LinkedHashSet linkedHashSet = o5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                o5Var2.v.invalidate();
                o5Var2.t();
            }
        }
        this.f15597g4 = o5Var;
        this.A3 = false;
        this.f15603j4 = -1;
        this.f15601i4 = -1;
        o5Var.setCellSelectionListener(this.f15605k4);
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void h4(int i10, int i11) {
        r5 m10;
        View B4 = B4(i10);
        if (B4 instanceof o5) {
            o5 o5Var = (o5) B4;
            if (i11 == 0) {
                o5Var.u();
                return;
            }
            TL_iv.pageTableCell h = o5Var.h(i11);
            if (h != null && (m10 = o5Var.getGrid().m(h)) != null) {
                g6.d(h, m10.f15493a.getText());
            }
        }
    }

    public final n3 i2() {
        int i10;
        int i11;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x() && !H3()) {
            a z42 = z4(j3Var.f22656p0);
            ArrayList arrayList = this.f15602j3;
            int indexOf = arrayList.indexOf(z42);
            int indexOf2 = arrayList.indexOf(z4(j3Var.f22659s0));
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
                    if (aVar.f15101i || y3(aVar)) {
                        return null;
                    }
                }
                return new n3(this, i10, i11, j3Var.f22658r0, j3Var.f22661u0);
            }
            return null;
        }
        return null;
    }

    public final boolean i3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.i3(android.view.KeyEvent):boolean");
    }

    public final int j2(int i10) {
        h1 J2 = J2(i10);
        if (J2 != null) {
            return J2.length();
        }
        c6 v22 = v2(i10);
        if (v22 != null) {
            return v22.getEditText().length();
        }
        a z42 = z4(i10);
        if (z42 == null) {
            return 0;
        }
        return c6.z(z42.f15097b).length();
    }

    public final boolean j3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.j3(android.view.MotionEvent):boolean");
    }

    public final int j4(int i10) {
        Layout layout;
        View B4 = B4(i10);
        if (!(B4 instanceof c6) || (layout = ((c6) B4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    public final TL_iv.RichMessage k2() {
        if (l3()) {
            ArrayList<TL_iv.PageBlock> a32 = a3();
            if (a32.isEmpty()) {
                return null;
            }
            TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
            richMessage.blocks = a32;
            richMessage.photos = C2();
            richMessage.documents = z2();
            return richMessage;
        }
        return null;
    }

    public final boolean k3(ki.o5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.k3(ki.o5, int, int):boolean");
    }

    public final h1 k4(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof c6) {
            return ((c6) B4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock l2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.l2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean l3() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.l3():boolean");
    }

    public final boolean m2() {
        h1 editText;
        int length;
        int z10;
        int g10;
        k4[] k4VarArr;
        j3 j3Var = this.f15606l3;
        if (j3Var == null || !j3Var.x() || j3Var.f22656p0 != j3Var.f22659s0) {
            return false;
        }
        if (M3()) {
            int i10 = j3Var.f22656p0;
            int i11 = j3Var.f22657q0;
            if (i11 != j3Var.f22660t0) {
                return false;
            }
            editText = O4(i10, i11);
        } else if (z3()) {
            editText = J2(j3Var.f22656p0);
        } else if (x3()) {
            editText = t2(j3Var.f22656p0);
        } else if (H3()) {
            editText = k4(j3Var.f22656p0);
        } else {
            c6 H4 = H4();
            if (H4 == null) {
                return false;
            }
            editText = H4.getEditText();
        }
        if (editText == null || (z10 = i2.e.z(j3Var.f22658r0, j3Var.f22661u0, (length = editText.length()), 0)) >= (g10 = i2.e.g(j3Var.f22658r0, j3Var.f22661u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && z10 < g10) {
            for (k4 k4Var : (k4[]) text.getSpans(z10, g10, k4.class)) {
                if (text.getSpanStart(k4Var) < g10 && text.getSpanEnd(k4Var) > z10) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean n2() {
        int[] E4 = E4();
        if (E4 == null) {
            return o2(E2());
        }
        for (int i10 = E4[0]; i10 <= E4[1]; i10++) {
            if (o2((a) this.f15602j3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean n3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15602j3;
            if (i10 >= arrayList.size()) {
                return false;
            }
            for (t tVar : R3((a) arrayList.get(i10))) {
                if (tVar.a()) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean n4(int i10, int i11, boolean z10) {
        boolean z11;
        if (i10 >= 0 && i11 >= i10) {
            ArrayList arrayList = this.f15602j3;
            if (i11 < arrayList.size()) {
                h2 h2Var = this.H3;
                if (h2Var != null) {
                    h2Var.d();
                }
                if (z10) {
                    z11 = false;
                    while (i11 >= i10) {
                        if (r3(i11, true, true)) {
                            z11 = true;
                        }
                        i11--;
                    }
                } else {
                    a aVar = (a) arrayList.get(i10);
                    if (aVar.f15098c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f15098c < aVar.f15098c)) {
                        return false;
                    }
                    z11 = false;
                    while (i10 <= i11) {
                        if (r3(i10, false, true)) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                if (z11) {
                    t4();
                    if (findFocus() instanceof h1) {
                        Y1();
                    } else {
                        this.W2.N(false);
                    }
                    h2 h2Var2 = this.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public final boolean o2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f15602j3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f15098c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f15097b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !p2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f15098c < aVar2.f15098c) {
                return false;
            }
            if (q3(indexOf)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof c6) {
                c6 c6Var = (c6) childAt;
                c6Var.f15184f.hideActionMode();
                c6Var.h.hideActionMode();
            } else if (childAt instanceof o5) {
                o5 o5Var = (o5) childAt;
                q5 q5Var = o5Var.v;
                o5Var.f15433r.hideActionMode();
                for (int i11 = 0; i11 < q5Var.getChildCount(); i11++) {
                    View childAt2 = q5Var.getChildAt(i11);
                    if (childAt2 instanceof r5) {
                        ((r5) childAt2).f15493a.hideActionMode();
                    }
                }
            } else if (childAt instanceof l0) {
                ((l0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof t0) {
                ((t0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void o4(a aVar) {
        View A1 = A1(aVar);
        if (A1 instanceof u4) {
            u4 u4Var = (u4) A1;
            ArrayList arrayList = u4Var.f15562y;
            if (u4Var.f15113a != null) {
                u4Var.n();
                if (u4Var.W >= arrayList.size()) {
                    u4Var.W = Math.max(0, arrayList.size() - 1);
                }
                u4Var.o(false);
                u4Var.requestLayout();
                u4Var.invalidate();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.K3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.K3);
        this.Y2 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.I3;
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
        this.I3 = i14;
    }

    public final boolean p2(int i10) {
        if (i10 > 0) {
            ArrayList arrayList = this.f15602j3;
            if (i10 < arrayList.size() && F3(((a) arrayList.get(i10)).f15097b) && ((a) arrayList.get(i10 - 1)).f15098c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p3(boolean z10) {
        j3 j3Var = this.f15606l3;
        if (j3Var != null) {
            if (z10) {
                j3Var.f(false);
            } else {
                AndroidUtilities.cancelRunOnUIThread(j3Var.m0);
                j3Var.u();
            }
        }
        if (z10) {
            W2();
        } else {
            o3();
        }
    }

    public final void p4() {
        post(new b(this, 3));
    }

    public final boolean q2() {
        int[] E4 = E4();
        if (E4 == null) {
            return r2(E2());
        }
        for (int i10 = E4[0]; i10 <= E4[1]; i10++) {
            if (r2((a) this.f15602j3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean q3(int i10) {
        if (((a) this.f15602j3.get(i10)).f15098c + 1 <= MessagesController.getInstance(this.f15590d3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void q4(int i10) {
        ArrayList arrayList = this.f15602j3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f15098c > 0) {
                View A1 = A1(aVar);
                if (A1 instanceof c6) {
                    ((c6) A1).F();
                }
            }
        }
    }

    public final boolean r2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f15602j3).indexOf(aVar)) < 0 || aVar.f15098c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f15098c <= 0) {
            return false;
        }
        return true;
    }

    public final boolean r3(int i10, boolean z10, boolean z11) {
        boolean z12;
        a aVar;
        int i11;
        int i12 = 0;
        if (i10 >= 0) {
            ArrayList arrayList = this.f15602j3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f15098c > 0) {
                        u2(i10);
                        return true;
                    }
                } else if (aVar2.f15098c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f15097b;
                    if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !D3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if ((z12 || p2(i10)) && q3(i10)) {
                        if (i10 > 0) {
                            aVar = (a) arrayList.get(i10 - 1);
                        } else {
                            aVar = null;
                        }
                        if (z12) {
                            aVar2.f15098c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f15098c = aVar.f15098c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.e = false;
                        aVar2.f15099f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f15098c >= aVar2.f15098c)) && q3(i10)) {
                    aVar2.f15098c++;
                    return true;
                }
            }
        }
        return false;
    }

    public final void r4(a aVar, t tVar) {
        int i10;
        if (aVar == null) {
            return;
        }
        if (C3(aVar.f15097b)) {
            ArrayList h32 = h3(aVar.f15097b);
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                i10 = arrayList.indexOf(tVar);
            } else {
                i10 = -1;
            }
            if (i10 >= 0) {
                aVar.h.remove(i10);
                if (h32 != null && i10 < h32.size()) {
                    h32.remove(i10);
                }
            }
            if (aVar.h.isEmpty()) {
                s4(aVar);
                return;
            }
            int size = aVar.h.size();
            t61 t61Var = this.W2;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f15097b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) h32.get(0);
                aVar.f15097b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f15100g = (t) aVar.h.get(0);
                aVar.h = null;
                t61Var.N(true);
                o4(aVar);
                return;
            }
            t61Var.N(true);
            o4(aVar);
            return;
        }
        s4(aVar);
    }

    public final boolean s2() {
        h2 h2Var = this.H3;
        if (h2Var != null) {
            if (h2Var.e || !h2Var.f15310b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void s3(boolean z10) {
        a aVar;
        int i10;
        int i11;
        int[] E4 = E4();
        if (E4 != null && (i10 = E4[0]) != (i11 = E4[1])) {
            n4(i10, i11, z10);
            return;
        }
        if (E4 == null) {
            aVar = E2();
        } else {
            aVar = (a) this.f15602j3.get(E4[0]);
        }
        if (aVar != null) {
            X3(aVar, z10);
        }
    }

    public final void s4(a aVar) {
        ArrayList arrayList = this.f15602j3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.W2.N(true);
        }
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f15598h3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.P3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f15596g3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.L3 = new ArrayList();
        ArrayList arrayList = this.f15602j3;
        X2(arrayList, c5.b(charSequence), this.f15604k3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.L3.add((a) arrayList.get(size));
        }
        this.W2.N(false);
    }

    public final h1 t2(int i10) {
        View B4 = B4(i10);
        if (B4 instanceof l0) {
            return ((l0) B4).getCaptionEditText();
        }
        return null;
    }

    public final void t3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f15103k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f15604k3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f15112t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f15103k.add((Long) arrayList3.get(i12));
                }
                int i13 = f5.f15268a;
                g61 J = g61.J(f5.class);
                J.G = aVar2;
                J.H = this.f15591d4;
                arrayList2.add(J);
                this.f15610n4.add(aVar2);
            }
        }
    }

    public final void t4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15602j3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f15098c > 0 && aVar.d > 0 && !F3(aVar.f15097b)) {
                    int i11 = aVar.f15098c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f15098c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !F3(aVar2.f15097b)) {
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

    public final void u2(int i10) {
        a aVar;
        int i11;
        ArrayList arrayList = this.f15602j3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f15098c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f15098c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.e = false;
                aVar2.f15099f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f15098c) > i12) {
                    aVar.f15098c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void u3() {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.u3():void");
    }

    public final void u4(String str) {
        j3 j3Var = this.f15606l3;
        X1(j3Var.f22656p0, j3Var.f22658r0, j3Var.f22659s0, j3Var.f22661u0, str.split("\n", -1));
    }

    public final c6 v2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.V2.m(i10);
        if (!(m10 instanceof c6)) {
            return null;
        }
        return (c6) m10;
    }

    public final void v3(ki.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: ki.w3.v3(ki.a):void");
    }

    public final t v4(TL_iv.PageBlock pageBlock) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.Photo> arrayList;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TLRPC.Document T2 = T2(((TL_iv.pageBlockAudio) pageBlock).audio_id);
            if (T2 == null) {
                return null;
            }
            t tVar = new t();
            tVar.f15512c = true;
            tVar.f15510a = 2;
            tVar.h = T2;
            tVar.f15515i = T2;
            return tVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document T22 = T2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (T22 == null) {
                return null;
            }
            t tVar2 = new t();
            tVar2.d = true;
            tVar2.f15510a = 2;
            tVar2.h = T22;
            return tVar2;
        } else {
            int i10 = 0;
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                TLRPC.Document T23 = T2(pageblockvideo.video_id);
                if (T23 == null) {
                    return null;
                }
                t tVar3 = new t();
                tVar3.f15511b = true;
                tVar3.f15510a = 2;
                tVar3.h = T23;
                tVar3.f15520n = pageblockvideo.spoiler;
                while (i10 < T23.attributes.size()) {
                    if (T23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) T23.attributes.get(i10);
                        tVar3.f15516j = tL_documentAttributeVideo.f20282w;
                        tVar3.f15517k = tL_documentAttributeVideo.h;
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
                        if (i12 < this.f15602j3.size()) {
                            for (t tVar4 : R3((a) this.f15602j3.get(i12))) {
                                if (tVar4 != null && (photo = tVar4.f15514g) != null && photo.f20299id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f15600i3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f20299id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = v4.f15581a;
                            synchronized (v4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) v4.f15581a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                t tVar5 = new t();
                tVar5.f15510a = 2;
                tVar5.f15514g = photo;
                tVar5.f15520n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    tVar5.f15516j = closestPhotoSizeWithSize.f20300w;
                    tVar5.f15517k = closestPhotoSizeWithSize.h;
                }
                return tVar5;
            }
        }
    }

    public final void w2() {
        H2();
        this.f15600i3 = null;
        this.Z3 = null;
        this.f15587a4 = null;
        this.H3 = new h2(this.f15608m4);
        A4();
        this.H3.j();
        u3 u3Var = this.f15594f3;
        if (u3Var != null) {
            u3Var.P();
        }
    }

    public final void w4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f15600i3 != null && aVar != null && (pageBlock = aVar.f15097b) != null) {
            if (C3(pageBlock)) {
                ArrayList h32 = h3(aVar.f15097b);
                aVar.h = new ArrayList();
                if (h32 != null) {
                    for (int i10 = 0; i10 < h32.size(); i10++) {
                        t v42 = v4((TL_iv.PageBlock) h32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (v42 == null) {
                            v42 = new t();
                        }
                        arrayList.add(v42);
                    }
                    return;
                }
                return;
            }
            t v43 = v4(aVar.f15097b);
            if (v43 != null) {
                aVar.f15100g = v43;
            }
        }
    }

    public final boolean x3() {
        int i10;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f22656p0) == j3Var.f22659s0 && i10 >= 0 && i10 < this.f15610n4.size()) {
            return B4(i10) instanceof l0;
        }
        return false;
    }

    public final ArrayList x4(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a aVar = (a) obj;
            if (C3(aVar.f15097b)) {
                ArrayList h32 = h3(aVar.f15097b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (h32 != null) {
                    int size2 = h32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = h32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        t v42 = v4(pageBlock);
                        if (v42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(v42);
                        }
                    }
                    h32.clear();
                    h32.addAll(arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    aVar.h = arrayList4;
                    arrayList2.add(aVar);
                }
            } else {
                TL_iv.PageBlock pageBlock2 = aVar.f15097b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    t v43 = v4(pageBlock2);
                    if (v43 != null) {
                        aVar.f15100g = v43;
                        arrayList2.add(aVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final boolean y2() {
        ArrayList arrayList;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.f15602j3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f15101i;
            ArrayList arrayList2 = aVar.f15103k;
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
            ArrayList arrayList3 = aVar2.f15103k;
            if (arrayList3.size() == 1 && (aVar2.f15097b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f15097b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f15604k3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f15097b = pageblockblockquote;
                    arrayList3.clear();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final void y4() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof l4) {
                a0 a0Var = (a0) ((l4) childAt);
                a0Var.f15114b.a(a0Var.f15113a, new j5.b(a0Var, 2));
            }
        }
        invalidate();
    }

    public final ArrayList z2() {
        TLRPC.Document document;
        t tVar;
        TLRPC.Document document2;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f15602j3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f15097b instanceof TL_iv.pageBlockDocument) && (tVar = aVar.f15100g) != null && tVar.b() && (document2 = aVar.f15100g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f15097b).document_id = document2.f20281id;
                }
                for (t tVar2 : R3(aVar)) {
                    if (tVar2.b() && (document = tVar2.h) != null) {
                        long j10 = document.f20281id;
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

    public final boolean z3() {
        int i10;
        j3 j3Var = this.f15606l3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f22656p0) == j3Var.f22659s0 && y3(z4(i10))) {
            return true;
        }
        return false;
    }

    public final a z4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f15610n4;
            if (i10 < arrayList.size()) {
                return (a) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }
}
