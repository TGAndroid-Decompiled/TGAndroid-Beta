package li;

import a8.zd;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.xm0;
public final class v3 extends s71 {
    public static final ArrayList A4 = new ArrayList();
    public boolean A3;
    public float B3;
    public float C3;
    public float D3;
    public float E3;
    public View F3;
    public b G3;
    public boolean H3;
    public boolean I3;
    public boolean J3;
    public boolean K3;
    public TL_iv.pageTableCell L3;
    public TL_iv.pageTableCell M3;
    public long N3;
    public float O3;
    public float P3;
    public boolean Q3;
    public f2 R3;
    public int S3;
    public g1 T3;
    public final i U3;
    public ArrayList V3;
    public int W3;
    public int X3;
    public int Y3;
    public boolean Z3;
    public a f17540a4;
    public boolean f17541b4;
    public final n3 f17542c4;
    public final q2 f17543d4;
    public final o3 f17544e4;
    public final p3 f17545f4;
    public final q3 f17546g4;
    public final IdentityHashMap f17547h4;
    public final IdentityHashMap f17548i4;
    public a f17549j4;
    public a f17550k4;
    public final r3 l4;
    public final z2 f17551m4;
    public final int f17552n3;
    public final a3 f17553n4;
    public final u6 f17554o3;
    public final b3 f17555o4;
    public final t3 f17556p3;
    public final c3 f17557p4;
    public MessageObject f17558q3;
    public p5 f17559q4;
    public boolean f17560r3;
    public l80 f17561r4;
    public TL_iv.RichMessage f17562s3;
    public int f17563s4;
    public final ArrayList f17564t3;
    public int f17565t4;
    public final HashMap f17566u3;
    public final r2 f17567u4;
    public final j3 f17568v3;
    public final d3 f17569v4;
    public final ea f17570w3;
    public final e3 f17571w4;
    public int f17572x3;
    public final ArrayList f17573x4;
    public int y3;
    public xm0 f17574y4;
    public int f17575z3;
    public int f17576z4;

    public v3(Context context, int i10, u6 u6Var, t3 t3Var) {
        super(context, i10, 0, false, new hi.e2(r1, 18), new jg.e1(r1, 9), null, u6Var);
        this.f17560r3 = true;
        this.f17564t3 = new ArrayList();
        this.f17566u3 = new HashMap();
        this.f17572x3 = -1;
        this.y3 = -1;
        this.f17575z3 = 0;
        this.U3 = new i(this, 2);
        this.Z3 = true;
        this.f17542c4 = new n3(this);
        this.f17543d4 = new q2(this);
        this.f17544e4 = new o3(this);
        this.f17545f4 = new p3(this);
        this.f17546g4 = new q3(this);
        this.f17547h4 = new IdentityHashMap();
        this.f17548i4 = new IdentityHashMap();
        this.l4 = new r3(this);
        this.f17551m4 = new z2(this);
        this.f17553n4 = new a3(this);
        this.f17555o4 = new b3(this);
        this.f17557p4 = new c3(this);
        this.f17563s4 = -1;
        this.f17565t4 = -1;
        this.f17567u4 = new r2(this);
        this.f17569v4 = new d3(this);
        e3 e3Var = new e3(this, 0);
        this.f17571w4 = e3Var;
        this.f17573x4 = new ArrayList();
        this.f17576z4 = -1;
        v3[] v3VarArr = {this};
        this.f17552n3 = i10;
        this.f17554o3 = u6Var;
        this.f17556p3 = t3Var;
        this.f32504g3.f29878r = false;
        setClipToPadding(false);
        setClipChildren(false);
        H1(new hi.e2(this, 19), false);
        setReorderLongPressEnabled(false);
        C1(true);
        j3 j3Var = new j3(this, t3Var);
        this.f17568v3 = j3Var;
        j3Var.S(this);
        j3Var.f25422z0 = this.f32503f3;
        ea n10 = j3Var.n(context);
        this.f17570w3 = n10;
        AndroidUtilities.removeFromParent(n10);
        j3Var.D = new l3(this, t3Var);
        j(new ai.u0(1, this, t3Var));
        this.R3 = new f2(e3Var);
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
        if (aVar != null && (aVar.f17053b instanceof TL_iv.pageBlockDetails)) {
            return true;
        }
        return false;
    }

    public static boolean F3(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) || (pageBlock instanceof TL_iv.pageBlockPullquote) || K3(pageBlock) || (pageBlock instanceof TL_iv.pageBlockDetails) || !d6.y(pageBlock).isEmpty()) {
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
        if (aVar != null && !aVar.f17057i && !D3(aVar) && (aVar.f17053b instanceof TL_iv.pageBlockParagraph) && aVar.f17054c == 0 && aVar.d == 0 && !aVar.e && aVar.f17059k.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void O1(li.v3[] r20, java.util.ArrayList r21, org.telegram.ui.Components.k71 r22) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.O1(li.v3[], java.util.ArrayList, org.telegram.ui.Components.k71):void");
    }

    public static void P2(ArrayList arrayList, a aVar) {
        int i10;
        int i11;
        TLRPC.Document document;
        TL_iv.pageBlockCollage pageblockcollage;
        long j10;
        TL_iv.PageBlock pageBlock = aVar.f17053b;
        if (pageBlock instanceof TL_iv.pageBlockDivider) {
            arrayList.add(pageBlock);
        } else if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            t tVar = aVar.f17056g;
            if (tVar != null && tVar.b()) {
                TL_iv.PageBlock pageBlock2 = aVar.f17053b;
                if (((TL_iv.pageBlockPhoto) pageBlock2).photo_id != 0) {
                    if (pageBlock2.caption == null) {
                        pageBlock2.caption = new TL_iv.PageCaption();
                        aVar.f17053b.caption.text = new TL_iv.textEmpty();
                        aVar.f17053b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f17053b);
                }
            }
        } else if (pageBlock instanceof TL_iv.pageBlockVideo) {
            t tVar2 = aVar.f17056g;
            if (tVar2 != null && tVar2.b()) {
                TL_iv.PageBlock pageBlock3 = aVar.f17053b;
                if (((TL_iv.pageBlockVideo) pageBlock3).video_id != 0) {
                    if (pageBlock3.caption == null) {
                        pageBlock3.caption = new TL_iv.PageCaption();
                        aVar.f17053b.caption.text = new TL_iv.textEmpty();
                        aVar.f17053b.caption.credit = new TL_iv.textEmpty();
                    }
                    arrayList.add(aVar.f17053b);
                }
            }
        } else if (H3(pageBlock)) {
            ArrayList m32 = m3(aVar.f17053b);
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
                        j0.d(pageBlock4);
                        arrayList2.add(pageBlock4);
                    }
                }
            }
            if (arrayList2.size() >= 2) {
                if (aVar.f17053b instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = new TL_iv.pageBlockSlideshow();
                    pageblockslideshow.items = arrayList2;
                    pageblockslideshow.caption = aVar.f17053b.caption;
                    pageblockcollage = pageblockslideshow;
                } else {
                    TL_iv.pageBlockCollage pageblockcollage2 = new TL_iv.pageBlockCollage();
                    pageblockcollage2.items = arrayList2;
                    pageblockcollage2.caption = aVar.f17053b.caption;
                    pageblockcollage = pageblockcollage2;
                }
                j0.d(pageblockcollage);
                arrayList.add(pageblockcollage);
            } else if (arrayList2.size() == 1) {
                arrayList.add(arrayList2.get(0));
            }
        } else {
            TL_iv.PageBlock pageBlock5 = aVar.f17053b;
            if (pageBlock5 instanceof TL_iv.pageBlockAudio) {
                t tVar3 = aVar.f17056g;
                if (tVar3 != null && tVar3.b()) {
                    TL_iv.PageBlock pageBlock6 = aVar.f17053b;
                    if (((TL_iv.pageBlockAudio) pageBlock6).audio_id != 0) {
                        if (pageBlock6.caption == null) {
                            pageBlock6.caption = new TL_iv.PageCaption();
                            aVar.f17053b.caption.text = new TL_iv.textEmpty();
                            aVar.f17053b.caption.credit = new TL_iv.textEmpty();
                        }
                        arrayList.add(aVar.f17053b);
                    }
                }
            } else if (pageBlock5 instanceof TL_iv.pageBlockDocument) {
                t tVar4 = aVar.f17056g;
                if (tVar4 != null && (document = tVar4.h) != null) {
                    ((TL_iv.pageBlockDocument) pageBlock5).document_id = document.f22034id;
                }
                if (tVar4 != null && tVar4.b()) {
                    TL_iv.PageBlock pageBlock7 = aVar.f17053b;
                    if (((TL_iv.pageBlockDocument) pageBlock7).document_id != 0) {
                        j0.d(pageBlock7);
                        arrayList.add(aVar.f17053b);
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
                    arrayList.add(aVar.f17053b);
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
                                    h6.c(pagetablecell, "");
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

    public static void Q1(v3 v3Var, int i10, int i11, int i12) {
        g1 editText;
        if (i10 >= 0) {
            View m10 = v3Var.f32503f3.m(i10);
            if (m10 instanceof d6) {
                d6 d6Var = (d6) m10;
                if (i11 == 1 && d6Var.m()) {
                    editText = d6Var.getAuthorEditText();
                } else {
                    editText = d6Var.getEditText();
                }
                editText.s();
                editText.setSelection(Math.max(0, Math.min(i12, editText.length())));
            } else if (m10 instanceof p5) {
                p5 p5Var = (p5) m10;
                g1 k10 = p5Var.k(i11);
                if (k10 == null) {
                    k10 = p5Var.k(0);
                }
                if (k10 != null) {
                    k10.s();
                    k10.setSelection(Math.max(0, Math.min(i12, k10.length())));
                }
            } else if (m10 instanceof k0) {
                g1 captionEditText = ((k0) m10).getCaptionEditText();
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

    public static org.telegram.tgnet.tl.TL_iv.PageBlock R1(li.v3 r2, li.a r3, int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.R1(li.v3, li.a, int, int):org.telegram.tgnet.tl.TL_iv$PageBlock");
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

    public static void S1(v3 v3Var, g1 g1Var) {
        if (g1Var == null) {
            v3Var.getClass();
            return;
        }
        g1Var.adaptiveCreateLinkDialog = v3Var.f17560r3;
        g1Var.setInlineButtonContext(v3Var.f17552n3);
        g1Var.setInlineButtonClickListener(new r2(v3Var));
    }

    public static void T1(a aVar, t tVar, v3 v3Var) {
        t3 t3Var = v3Var.f17556p3;
        IdentityHashMap identityHashMap = v3Var.f17548i4;
        IdentityHashMap identityHashMap2 = v3Var.f17547h4;
        if (tVar == null) {
            ArrayList arrayList = v3Var.f17564t3;
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
                f2 f2Var = v3Var.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                arrayList.remove(indexOf);
                v3Var.f32504g3.O(true);
                f2 f2Var2 = v3Var.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
            }
            t3Var.onContentChanged();
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
        f2 f2Var3 = v3Var.R3;
        if (f2Var3 != null) {
            f2Var3.d();
        }
        v3Var.w4(aVar, tVar);
        f2 f2Var4 = v3Var.R3;
        if (f2Var4 != null) {
            f2Var4.h();
        }
        t3Var.onContentChanged();
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
                            aVar.f17055f = z12;
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
        if (H3(aVar.f17053b)) {
            ArrayList m32 = m3(aVar.f17053b);
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
        return aVar.f17053b;
    }

    public static void U1(v3 v3Var) {
        if (v3Var.Q3) {
            return;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.h();
        }
        v3Var.f17556p3.n();
        v3Var.u4();
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
        if (richText != null && !TextUtils.isEmpty(f6.l(richText))) {
            return true;
        }
        if (pageblocktable.rows == null) {
            return false;
        }
        for (int i10 = 0; i10 < pageblocktable.rows.size(); i10++) {
            TL_iv.pageTableRow pagetablerow = pageblocktable.rows.get(i10);
            for (int i11 = 0; i11 < pagetablerow.cells.size(); i11++) {
                if (!h6.g(pagetablerow.cells.get(i11)).isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void V1(v3 v3Var, a aVar) {
        ArrayList arrayList = v3Var.f17564t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0) {
            return;
        }
        f2 f2Var = v3Var.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        aVar2.f17059k.addAll(aVar.f17059k);
        arrayList.add(indexOf + 1, aVar2);
        v3Var.y4();
        v3Var.f32504g3.O(false);
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        v3Var.post(new m2(v3Var, aVar2, 23));
    }

    public static FrameLayout V4(p5 p5Var, boolean z10) {
        int i10;
        s5 m10;
        h6 model = p5Var.getModel();
        if (model != null) {
            int i11 = Integer.MAX_VALUE;
            if (z10) {
                i10 = -1;
            } else {
                i10 = Integer.MAX_VALUE;
            }
            TL_iv.pageTableCell pagetablecell = null;
            for (TL_iv.pageTableCell pagetablecell2 : p5Var.getSelectedCells()) {
                int a2 = model.a(pagetablecell2);
                int o10 = z10 ? (h6.o(pagetablecell2) + model.b(pagetablecell2)) - 1 : model.b(pagetablecell2);
                if (!z10 ? o10 < i10 || (o10 == i10 && a2 < i11) : o10 > i10 || (o10 == i10 && a2 < i11)) {
                    pagetablecell = pagetablecell2;
                    i11 = a2;
                    i10 = o10;
                }
            }
            if (pagetablecell != null && (m10 = p5Var.getGrid().m(pagetablecell)) != null) {
                return m10;
            }
        }
        return p5Var;
    }

    public static boolean W1(li.v3 r16, li.a r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.W1(li.v3, li.a, boolean):boolean");
    }

    public static List W3(a aVar) {
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (H3(aVar.f17053b)) {
            ArrayList arrayList = aVar.h;
            if (arrayList != null) {
                return arrayList;
            }
            return Collections.EMPTY_LIST;
        }
        t tVar = aVar.f17056g;
        if (tVar != null) {
            return Collections.singletonList(tVar);
        }
        return Collections.EMPTY_LIST;
    }

    public static g1 X3(View view) {
        if (view instanceof d6) {
            return ((d6) view).getEditText();
        }
        if (view instanceof k0) {
            return ((k0) view).getCaptionEditText();
        }
        if (view instanceof s0) {
            return ((s0) view).getEditText();
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
        aVar.f17055f = z11;
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
        tVar.f17477b = photoEntry.isVideo;
        tVar.e = str;
        tVar.f17482j = photoEntry.width;
        tVar.f17483k = photoEntry.height;
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
        tVar.f17484l = i10;
        if (!z10) {
            i11 = photoEntry.invert;
        }
        tVar.f17485m = i11;
        tVar.f17476a = 1;
        tVar.f17479f = 0.0f;
        return tVar;
    }

    public static p5 a3(g1 g1Var) {
        for (ViewParent parent = g1Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof p5) {
                return (p5) parent;
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
                        aVar.f17057i = true;
                        arrayList.add(aVar);
                    } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
                        TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
                        long a2 = o0.a();
                        c3(arrayList, pageblockblockquoteblocks.blocks, map);
                        for (int size3 = arrayList.size(); size3 < arrayList.size(); size3++) {
                            ((a) arrayList.get(size3)).f17059k.add(0, Long.valueOf(a2));
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

    public static int[] g5(p5 p5Var) {
        int i10;
        int i11;
        h6 h6Var = p5Var.F;
        if (h6Var != null) {
            i10 = h6Var.f17289g.size();
        } else {
            i10 = 0;
        }
        while (i10 >= 0) {
            g1 k10 = p5Var.k(i10);
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

    public static boolean n4(g1 g1Var, float f7, float f10) {
        int[] iArr;
        if (g1Var != null && g1Var.getVisibility() == 0) {
            g1Var.getLocationOnScreen(new int[2]);
            float f11 = f7 - iArr[0];
            float f12 = f10 - iArr[1];
            if (f11 >= 0.0f && f12 >= 0.0f && f11 <= g1Var.getWidth() && f12 <= g1Var.getHeight()) {
                int offsetForPosition = g1Var.getOffsetForPosition(f11, f12);
                if (offsetForPosition < 0) {
                    offsetForPosition = 0;
                }
                g1Var.s();
                g1Var.setSelection(Math.max(0, Math.min(offsetForPosition, g1Var.length())));
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
            i11 = aVar.f17060l;
        } else {
            i11 = aVar.f17061m;
        }
        int size = aVar.f17059k.size() - i11;
        return wh.b(16.0f, Math.max(0, i10 - size), AndroidUtilities.dp(2.0f));
    }

    public static boolean r3(TL_iv.PageBlock pageBlock) {
        if (!(pageBlock instanceof TL_iv.pageBlockMap) && !(pageBlock instanceof TL_iv.pageBlockAudio) && !(pageBlock instanceof TL_iv.pageBlockDocument) && !J3(pageBlock)) {
            return false;
        }
        return true;
    }

    public static int r4(a aVar, a aVar2) {
        ArrayList arrayList = aVar.f17059k;
        int i10 = 0;
        if (aVar2 == null) {
            return 0;
        }
        ArrayList arrayList2 = aVar2.f17059k;
        int min = Math.min(arrayList.size(), arrayList2.size());
        while (i10 < min && ((Long) arrayList.get(i10)).equals(arrayList2.get(i10))) {
            i10++;
        }
        return i10;
    }

    public void setEditTextsLocked(boolean z10) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                ((d6) childAt).setLocked(z10);
            } else if (childAt instanceof p5) {
                ((p5) childAt).setLocked(z10);
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().setLocked(z10);
            } else if (childAt instanceof s0) {
                ((s0) childAt).setLocked(z10);
            } else if (childAt instanceof w0) {
                childAt.invalidate();
            }
        }
    }

    public final d6 A2(int i10) {
        if (i10 < 0) {
            return null;
        }
        View m10 = this.f32503f3.m(i10);
        if (!(m10 instanceof d6)) {
            return null;
        }
        return (d6) m10;
    }

    public final void A3(li.a r12) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.A3(li.a):void");
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
            tVar.f17478c = true;
            tVar.f17476a = 2;
            tVar.h = Y2;
            tVar.f17481i = Y2;
            return tVar;
        } else if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document Y22 = Y2(((TL_iv.pageBlockDocument) pageBlock).document_id);
            if (Y22 == null) {
                return null;
            }
            t tVar2 = new t();
            tVar2.d = true;
            tVar2.f17476a = 2;
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
                tVar3.f17477b = true;
                tVar3.f17476a = 2;
                tVar3.h = Y23;
                tVar3.f17486n = pageblockvideo.spoiler;
                while (i10 < Y23.attributes.size()) {
                    if (Y23.attributes.get(i10) instanceof TLRPC.TL_documentAttributeVideo) {
                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) Y23.attributes.get(i10);
                        tVar3.f17482j = tL_documentAttributeVideo.f22035w;
                        tVar3.f17483k = tL_documentAttributeVideo.h;
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
                        if (i12 < this.f17564t3.size()) {
                            for (t tVar4 : W3((a) this.f17564t3.get(i12))) {
                                if (tVar4 != null && (photo = tVar4.f17480g) != null && photo.f22052id == j10) {
                                    break loop1;
                                }
                            }
                            i12++;
                        } else {
                            TL_iv.RichMessage richMessage = this.f17562s3;
                            if (richMessage != null && (arrayList = richMessage.photos) != null) {
                                int size = arrayList.size();
                                while (i10 < size) {
                                    TLRPC.Photo photo2 = arrayList.get(i10);
                                    i10++;
                                    photo = photo2;
                                    if (photo != null && photo.f22052id == j10) {
                                        break;
                                    }
                                }
                            }
                            HashMap hashMap = v4.f17577a;
                            synchronized (v4.class) {
                                if (i11 == 0) {
                                    photo = null;
                                } else {
                                    photo = (TLRPC.Photo) v4.f17577a.get(Long.valueOf(j10));
                                }
                            }
                        }
                    }
                }
                if (photo == null) {
                    return null;
                }
                t tVar5 = new t();
                tVar5.f17476a = 2;
                tVar5.f17480g = photo;
                tVar5.f17486n = pageblockphoto.spoiler;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                if (closestPhotoSizeWithSize != null) {
                    tVar5.f17482j = closestPhotoSizeWithSize.f22053w;
                    tVar5.f17483k = closestPhotoSizeWithSize.h;
                }
                return tVar5;
            }
        }
    }

    public final void B2() {
        M2();
        this.f17562s3 = null;
        this.f17549j4 = null;
        this.f17550k4 = null;
        this.R3 = new f2(this.f17571w4);
        F4();
        this.R3.j();
        t3 t3Var = this.f17556p3;
        if (t3Var != null) {
            t3Var.Q();
        }
    }

    public final void B4(a aVar) {
        TL_iv.PageBlock pageBlock;
        if (this.f17562s3 != null && aVar != null && (pageBlock = aVar.f17053b) != null) {
            if (H3(pageBlock)) {
                ArrayList m32 = m3(aVar.f17053b);
                aVar.h = new ArrayList();
                if (m32 != null) {
                    for (int i10 = 0; i10 < m32.size(); i10++) {
                        t A42 = A4((TL_iv.PageBlock) m32.get(i10));
                        ArrayList arrayList = aVar.h;
                        if (A42 == null) {
                            A42 = new t();
                        }
                        arrayList.add(A42);
                    }
                    return;
                }
                return;
            }
            t A43 = A4(aVar.f17053b);
            if (A43 != null) {
                aVar.f17056g = A43;
            }
        }
    }

    public final boolean C3() {
        int i10;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f25412p0) == j3Var.f25415s0 && i10 >= 0 && i10 < this.f17573x4.size()) {
            return G4(i10) instanceof k0;
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
            if (H3(aVar.f17053b)) {
                ArrayList m32 = m3(aVar.f17053b);
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                if (m32 != null) {
                    int size2 = m32.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = m32.get(i11);
                        i11++;
                        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj2;
                        t A42 = A4(pageBlock);
                        if (A42 != null) {
                            arrayList3.add(pageBlock);
                            arrayList4.add(A42);
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
                TL_iv.PageBlock pageBlock2 = aVar.f17053b;
                if (!(pageBlock2 instanceof TL_iv.pageBlockPhoto) && !(pageBlock2 instanceof TL_iv.pageBlockVideo) && !(pageBlock2 instanceof TL_iv.pageBlockAudio) && !(pageBlock2 instanceof TL_iv.pageBlockDocument)) {
                    arrayList2.add(aVar);
                } else {
                    t A43 = A4(pageBlock2);
                    if (A43 != null) {
                        aVar.f17056g = A43;
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
            arrayList = this.f17564t3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            boolean z10 = aVar.f17057i;
            ArrayList arrayList2 = aVar.f17059k;
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
            ArrayList arrayList3 = aVar2.f17059k;
            if (arrayList3.size() == 1 && (aVar2.f17053b instanceof TL_iv.pageBlockParagraph)) {
                Long l4 = (Long) arrayList3.get(0);
                l4.getClass();
                Integer num = (Integer) hashMap.get(l4);
                if (num != null && num.intValue() == 1) {
                    TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                    TL_iv.RichText richText = aVar2.f17053b.text;
                    if (richText == null) {
                        richText = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.text = richText;
                    TL_iv.RichText richText2 = (TL_iv.RichText) this.f17566u3.remove(l4);
                    if (richText2 == null) {
                        richText2 = new TL_iv.textEmpty();
                    }
                    pageblockblockquote.caption = richText2;
                    aVar2.f17053b = pageblockblockquote;
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
                z zVar = (z) ((l4) childAt);
                zVar.f17653b.a(zVar.f17652a, new jg.e1(zVar, 6));
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
            ArrayList arrayList2 = this.f17564t3;
            if (i10 < arrayList2.size()) {
                a aVar = (a) arrayList2.get(i10);
                if ((aVar.f17053b instanceof TL_iv.pageBlockDocument) && (tVar = aVar.f17056g) != null && tVar.b() && (document2 = aVar.f17056g.h) != null) {
                    ((TL_iv.pageBlockDocument) aVar.f17053b).document_id = document2.f22034id;
                }
                for (t tVar2 : W3(aVar)) {
                    if (tVar2.b() && (document = tVar2.h) != null) {
                        long j10 = document.f22034id;
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
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f25412p0) == j3Var.f25415s0 && D3(E4(i10))) {
            return true;
        }
        return false;
    }

    public final a E4(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f17573x4;
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
            ArrayList arrayList2 = this.f17564t3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (document = tVar.h) != null && hashSet.add(Long.valueOf(document.f22034id))) {
                    arrayList.add(tVar.h);
                }
            }
            i10++;
        }
        return arrayList;
    }

    public final void F4() {
        ArrayList arrayList = this.f17564t3;
        arrayList.clear();
        arrayList.add(new a(new TL_iv.pageBlockHeading1(), 0, 0));
        arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
        this.f32504g3.O(false);
    }

    @Override
    public final boolean G1() {
        return this.f17541b4;
    }

    public final ArrayList G2(int i10, int i11) {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        while (i10 <= i11) {
            ArrayList arrayList2 = this.f17564t3;
            if (i10 >= arrayList2.size()) {
                break;
            }
            for (t tVar : W3((a) arrayList2.get(i10))) {
                if (tVar.b() && (photo = tVar.f17480g) != null && hashSet.add(Long.valueOf(photo.f22052id))) {
                    arrayList.add(tVar.f17480g);
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
        return this.f32503f3.m(i10);
    }

    public final ArrayList H2() {
        TLRPC.Photo photo;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f17564t3;
            if (i10 < arrayList2.size()) {
                for (t tVar : W3((a) arrayList2.get(i10))) {
                    if (tVar.b() && (photo = tVar.f17480g) != null && hashSet.add(Long.valueOf(photo.f22052id))) {
                        arrayList.add(tVar.f17480g);
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
        ArrayList arrayList = this.f17564t3;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            int indexOf = arrayList.indexOf(E4(j3Var.f25412p0));
            int indexOf2 = arrayList.indexOf(E4(j3Var.f25415s0));
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
        t3 t3Var = this.f17556p3;
        if (t3Var != null) {
            t3Var.u();
        }
    }

    public final void I2() {
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.h();
        }
        ArrayList arrayList = this.f17564t3;
        SpannableStringBuilder k10 = c5.k(arrayList);
        M2();
        arrayList.clear();
        HashMap hashMap = this.f17566u3;
        hashMap.clear();
        this.f17562s3 = null;
        c3(arrayList, c5.b(k10), hashMap);
        this.f32504g3.O(false);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        t3 t3Var = this.f17556p3;
        if (t3Var != null) {
            t3Var.onContentChanged();
            t3Var.Q();
        }
    }

    public final boolean I4() {
        int i10;
        int i11;
        int i12;
        int i13;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            if (R3()) {
                int i14 = j3Var.f25412p0;
                int i15 = j3Var.f25413q0;
                int i16 = j3Var.f25416t0;
                int i17 = j3Var.f25414r0;
                int i18 = j3Var.f25417u0;
                for (int i19 = i15; i19 <= i16; i19++) {
                    g1 T4 = T4(i14, i19);
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
                g1 O2 = O2(j3Var.f25412p0);
                if (O2 != null && Math.max(0, Math.min(Math.min(j3Var.f25414r0, j3Var.f25417u0), O2.length())) < Math.max(0, Math.min(Math.max(j3Var.f25414r0, j3Var.f25417u0), O2.length()))) {
                    return true;
                }
            } else if (C3()) {
                g1 y22 = y2(j3Var.f25412p0);
                if (y22 != null) {
                    int i20 = j3Var.f25414r0;
                    int i21 = j3Var.f25417u0;
                    if (Math.max(0, Math.min(Math.min(i20, i21), y22.length())) < Math.max(0, Math.min(Math.max(i20, i21), y22.length()))) {
                        return true;
                    }
                }
            } else if (M3()) {
                g1 p42 = p4(j3Var.f25412p0);
                if (p42 != null) {
                    int i22 = j3Var.f25414r0;
                    int i23 = j3Var.f25417u0;
                    if (Math.max(0, Math.min(Math.min(i22, i23), p42.length())) < Math.max(0, Math.min(Math.max(i22, i23), p42.length()))) {
                        return true;
                    }
                }
            } else {
                int i24 = j3Var.f25412p0;
                int i25 = j3Var.f25415s0;
                int i26 = j3Var.f25414r0;
                int i27 = j3Var.f25417u0;
                if (i24 >= 0 && i25 >= 0 && i25 >= i24 && i25 < this.f17573x4.size()) {
                    for (int i28 = i24; i28 <= i25; i28++) {
                        a E4 = E4(i28);
                        if (E4 != null) {
                            if (E4.f17068t == 0) {
                                TL_iv.PageBlock pageBlock = E4.f17053b;
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
        t3 t3Var = this.f17556p3;
        if (t3Var != null) {
            t3Var.H();
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
        j3 j3Var = this.f17568v3;
        if (j3Var != null && (i10 = j3Var.f25412p0) >= 0 && (E4 = E4(i10)) != null) {
            return E4;
        }
        return null;
    }

    public final int[] J4() {
        j3 j3Var = this.f17568v3;
        if (j3Var != null) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25415s0;
            if (i10 >= 0 && i11 >= 0) {
                a E4 = E4(i10);
                a E42 = E4(i11);
                if (E4 != null && E42 != null) {
                    ArrayList arrayList = this.f17564t3;
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
    public final void K1(s4.e1 e1Var) {
        t3 t3Var = this.f17556p3;
        if (t3Var != null && e1Var != null) {
            View view = e1Var.f47773a;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            view.getWidth();
            this.f17541b4 = t3Var.c(view.getHeight() + iArr[1]);
        }
    }

    public final void K2() {
        ArrayList arrayList;
        j3 j3Var = this.f17568v3;
        int i10 = j3Var.f25412p0;
        int i11 = j3Var.f25414r0;
        int i12 = j3Var.f25415s0;
        if (!c2(i10, i11, i12, j3Var.f25417u0, new String[]{""})) {
            if (i10 > i12) {
                i12 = i10;
                i10 = i12;
            }
            ArrayList arrayList2 = new ArrayList();
            int max = Math.max(0, i10);
            while (true) {
                arrayList = this.f17564t3;
                if (max > i12) {
                    break;
                }
                ArrayList arrayList3 = this.f17573x4;
                if (max >= arrayList3.size()) {
                    break;
                }
                a aVar = (a) arrayList3.get(max);
                if (aVar.f17068t == 0 && arrayList.indexOf(aVar) >= 0) {
                    arrayList2.add(aVar);
                }
                max++;
            }
            if (!arrayList2.isEmpty()) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                int indexOf = arrayList.indexOf(arrayList2.get(0));
                arrayList.removeAll(arrayList2);
                if (arrayList.isEmpty()) {
                    arrayList.add(new a(new TL_iv.pageBlockParagraph(), 0, 0));
                }
                HashMap hashMap = this.f17566u3;
                if (!hashMap.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        hashSet.addAll(((a) arrayList.get(i13)).f17059k);
                    }
                    hashMap.keySet().retainAll(hashSet);
                }
                D2();
                b4();
                y4();
                j3Var.f(false);
                this.f32504g3.O(false);
                f2 f2Var2 = this.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                post(new m2(this, (a) arrayList.get(Math.max(0, Math.min(indexOf, arrayList.size() - 1))), 0));
            }
        }
    }

    public final void K4(g1 g1Var) {
        g1Var.adaptiveCreateLinkDialog = this.f17560r3;
        g1Var.makeSelectedUrl(new b(this, 4));
    }

    @Override
    public final void L1(s4.e1 e1Var) {
        a aVar = this.f17540a4;
        this.f17540a4 = null;
        this.f17541b4 = false;
        if (aVar != null) {
            f2 f2Var = this.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            x4(aVar);
            f2 f2Var2 = this.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            t3 t3Var = this.f17556p3;
            if (t3Var != null) {
                t3Var.onContentChanged();
            }
        } else if (e1Var != null) {
            View view = e1Var.f47773a;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }
    }

    public final boolean L2() {
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
            return true;
        } else if (this.f17559q4 == null) {
            return false;
        } else {
            S2();
            return true;
        }
    }

    public final void L4(li.p5 r34) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.L4(li.p5):void");
    }

    @Override
    public final void M1(s4.e1 e1Var) {
        int b10;
        u61 G;
        a aVar = null;
        if (e1Var != null && (b10 = e1Var.b()) >= 0 && (G = this.f32504g3.G(b10)) != null) {
            Object obj = G.G;
            if (obj instanceof a) {
                aVar = (a) obj;
            }
        }
        this.f17540a4 = aVar;
        this.f17541b4 = false;
        t3 t3Var = this.f17556p3;
        if (t3Var != null) {
            t3Var.q();
        }
    }

    public final void M2() {
        j3 j3Var = this.f17568v3;
        if (j3Var != null) {
            j3Var.f(true);
        }
        S2();
        t3();
        IdentityHashMap identityHashMap = this.f17547h4;
        for (a5 a5Var : identityHashMap.values()) {
            a5Var.b();
        }
        identityHashMap.clear();
        IdentityHashMap identityHashMap2 = this.f17548i4;
        for (w4 w4Var : identityHashMap2.values()) {
            w4Var.a();
        }
        identityHashMap2.clear();
    }

    public final boolean M3() {
        int i10;
        a E4;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x() && (i10 = j3Var.f25412p0) == j3Var.f25415s0 && i10 >= 0 && i10 < this.f17573x4.size() && j3Var.f25413q0 == 1 && j3Var.f25416t0 == 1 && (E4 = E4(i10)) != null && d6.o(E4.f17053b)) {
            return true;
        }
        return false;
    }

    public final d6 M4() {
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25415s0;
            a E4 = E4(i10);
            if (i10 == i11 && E4 != null && G3(E4.f17053b)) {
                return A2(i10);
            }
            return null;
        }
        return null;
    }

    public final int N2(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            ArrayList arrayList = this.f17564t3;
            if (i12 >= arrayList.size()) {
                break;
            }
            if (D3((a) arrayList.get(i12))) {
                i11++;
            } else if (((a) arrayList.get(i12)).f17057i) {
                i11--;
            }
        }
        return i11;
    }

    public final boolean N3(int i10, int i11) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f17564t3;
            if (i11 < arrayList.size() && i10 <= i11) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a aVar = (a) arrayList.get(i10);
                    if (!aVar.f17057i && !D3(aVar)) {
                        if (!aVar.f17059k.isEmpty() || d6.o(aVar.f17053b)) {
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
                g1 O2 = O2(i10);
                if (O2 != null) {
                    return O2.getText();
                }
                return null;
            } else if (M3()) {
                g1 p42 = p4(i10);
                if (p42 != null) {
                    return p42.getText();
                }
                return null;
            } else {
                a E4 = E4(i10);
                if (E4 != null && G3(E4.f17053b)) {
                    int o22 = o2(i10);
                    if (ic.a.x(i11, i13, o22, 0) < ic.a.e(i11, i13, o22, 0)) {
                        d6 A2 = A2(i10);
                        if (A2 != null) {
                            return A2.getEditText().getText();
                        }
                        return d6.z(E4.f17053b);
                    }
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public final g1 O2(int i10) {
        if (!D3(E4(i10))) {
            return null;
        }
        View G4 = G4(i10);
        if (!(G4 instanceof s0)) {
            return null;
        }
        return ((s0) G4).getEditText();
    }

    public final boolean O3() {
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25415s0;
            if (i10 >= 0 && i11 >= 0 && i11 >= i10) {
                boolean z10 = false;
                while (i10 <= i11) {
                    a E4 = E4(i10);
                    if (E4 != null) {
                        if (I3(E4.f17053b)) {
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
        throw new UnsupportedOperationException("Method not decompiled: li.v3.O4(int, int, int, int, java.util.ArrayList):boolean");
    }

    public final boolean P3(int r8, int r9, int r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.P3(int, int, int, int, int):boolean");
    }

    public final void P4(View view) {
        s4.e1 T;
        int b10;
        if (view != null && this.f32505h3 != null && this.f32508k3 && (T = T(view)) != null && (b10 = T.b()) >= 0 && this.f32504g3.H(b10) >= 0) {
            this.I3 = true;
            j3 j3Var = this.f17568v3;
            if (j3Var.x()) {
                j3Var.f(false);
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            this.f32505h3.t(T);
        }
    }

    public final boolean Q3(int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        boolean z10 = false;
        for (int i18 = i12; i18 <= i14; i18++) {
            g1 T4 = T4(i11, i18);
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
        a5 a5Var = (a5) this.f17547h4.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        IdentityHashMap identityHashMap = this.f17548i4;
        w4 w4Var = (w4) identityHashMap.remove(tVar);
        if (w4Var != null) {
            w4Var.a();
        }
        tVar.f17476a = 1;
        tVar.f17479f = 0.0f;
        w4 w4Var2 = new w4(this.f17552n3, photoEntry, new h3(aVar, tVar, this));
        identityHashMap.put(tVar, w4Var2);
        if (!w4Var2.f17606f && !w4Var2.h && !w4Var2.f17607n) {
            w4Var2.f17606f = true;
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
                tL_message.f22049id = 1;
                String absolutePath = new File(FileLoader.getDirectory(4), "rich_anim_" + SharedConfig.getLastLocalId() + ".mp4").getAbsolutePath();
                w4Var2.e = absolutePath;
                tL_message.attachPath = absolutePath;
                MessageObject messageObject = new MessageObject(w4Var2.f17603a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                w4Var2.f17605c = messageObject;
                messageObject.videoEditedInfo = w4Var2.d;
                NotificationCenter notificationCenter = NotificationCenter.getInstance(w4Var2.f17603a);
                notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingStarted);
                notificationCenter.addObserver(w4Var2, NotificationCenter.fileNewChunkAvailable);
                notificationCenter.addObserver(w4Var2, NotificationCenter.filePreparingFailed);
                MediaController.getInstance().scheduleVideoConvert(w4Var2.f17605c, false, false, false);
                return;
            }
            w4Var2.b();
        }
    }

    public final boolean R3() {
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25415s0;
            a E4 = E4(i10);
            if (i10 == i11 && E4 != null && (E4.f17053b instanceof TL_iv.pageBlockTable)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void R4(a aVar, t tVar, String str, boolean z10, int i10, int i11, int i12) {
        IdentityHashMap identityHashMap = this.f17547h4;
        a5 a5Var = (a5) identityHashMap.remove(tVar);
        if (a5Var != null) {
            a5Var.b();
        }
        a5 a5Var2 = new a5(this.f17552n3, str, z10, i10, i11, i12, new i3(aVar, tVar, this));
        identityHashMap.put(tVar, a5Var2);
        a5Var2.d();
    }

    public final void S2() {
        if (this.J3) {
            requestDisallowInterceptTouchEvent(false);
        }
        this.J3 = false;
        this.K3 = false;
        this.L3 = null;
        this.M3 = null;
        l80 l80Var = this.f17561r4;
        if (l80Var != null) {
            this.f17561r4 = null;
            l80Var.u();
        }
        p5 p5Var = this.f17559q4;
        if (p5Var != null) {
            LinkedHashSet linkedHashSet = p5Var.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var.v.invalidate();
                p5Var.s();
            }
            this.f17559q4 = null;
        }
        this.f17565t4 = -1;
        this.f17563s4 = -1;
        setEditTextsLocked(false);
    }

    public final boolean S3() {
        AppGlobalConfig appGlobalConfig = MessagesController.getInstance(this.f17552n3).config;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f17564t3;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 += W3((a) arrayList.get(i10)).size();
            i10++;
        }
        ArrayList f32 = f3();
        ?? obj = new Object();
        obj.d = i11;
        obj.f17256b = f32.size() + obj.f17256b;
        for (int i12 = 0; i12 < f32.size(); i12++) {
            g2.b((TL_iv.PageBlock) f32.get(i12), 1, obj);
        }
        if (obj.f17255a > appGlobalConfig.richMessageLengthLimit.get() || obj.f17256b > appGlobalConfig.richMessageMaxBlocks.get() || obj.f17257c > appGlobalConfig.richMessageMaxDepth.get() || obj.d > appGlobalConfig.richMessageMaxMedia.get() || obj.e > appGlobalConfig.richMessageMaxTableCols.get()) {
            return false;
        }
        return true;
    }

    public final Editable S4(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            return ((d6) F1).getEditText().getText();
        }
        return d6.z(aVar.f17053b);
    }

    public final g1 T4(int i10, int i11) {
        View G4 = G4(i10);
        if (!(G4 instanceof p5)) {
            return null;
        }
        return ((p5) G4).k(i11);
    }

    public final int[] U3(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.V3.size(); i12++) {
            int length = d6.y(((a) this.V3.get(i12)).f17053b).length();
            if (i10 <= i11 + length) {
                return new int[]{i12, i10 - i11};
            }
            i11 += length + 1;
        }
        int size = this.V3.size() - 1;
        return new int[]{size, d6.y(((a) this.V3.get(size)).f17053b).length()};
    }

    public final g1 V2() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return (g1) findFocus;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                return ((d6) childAt).getEditText();
            }
        }
        return null;
    }

    public final int V3(int i10) {
        int i11 = 1;
        int i12 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f17564t3;
            if (i12 < arrayList.size()) {
                a aVar = (a) arrayList.get(i12);
                if (D3(aVar)) {
                    i11++;
                } else if (aVar.f17057i && i11 - 1 == 0) {
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
            if (childAt instanceof d6) {
                d6 d6Var = (d6) childAt;
                if (d6Var.getEditText().isFocused() || (d6Var.m() && d6Var.h.isFocused())) {
                    return d6Var.getRow();
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
                ArrayList arrayList = this.f17564t3;
                if (i11 < arrayList.size() && i10 <= i11) {
                    f2 f2Var = this.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    if (N3(i10, i11)) {
                        for (int i12 = i10; i12 <= i11; i12++) {
                            a aVar = (a) arrayList.get(i12);
                            boolean z11 = aVar.f17057i;
                            ArrayList arrayList2 = aVar.f17059k;
                            if (!z11 && !D3(aVar)) {
                                if (d6.o(aVar.f17053b)) {
                                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph.text = aVar.f17053b.text;
                                    aVar.f17053b = pageblockparagraph;
                                } else if (!arrayList2.isEmpty()) {
                                    a1.g.A(1, arrayList2);
                                }
                            }
                        }
                    } else {
                        long a2 = o0.a();
                        for (int i13 = i10; i13 <= i11; i13++) {
                            a aVar2 = (a) arrayList.get(i13);
                            boolean z12 = aVar2.f17057i;
                            ArrayList arrayList3 = aVar2.f17059k;
                            if (!z12 && !D3(aVar2)) {
                                if (d6.o(aVar2.f17053b)) {
                                    long a10 = o0.a();
                                    TL_iv.RichText j10 = d6.j(aVar2.f17053b);
                                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                                        this.f17566u3.put(Long.valueOf(a10), j10);
                                    }
                                    arrayList3.add(Long.valueOf(a10));
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    pageblockparagraph2.text = aVar2.f17053b.text;
                                    aVar2.f17053b = pageblockparagraph2;
                                }
                                arrayList3.add(0, Long.valueOf(a2));
                            }
                        }
                    }
                    D2();
                    b4();
                    y4();
                    j3 j3Var = this.f17568v3;
                    if (j3Var != null && j3Var.x()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    a aVar3 = (a) arrayList.get(Math.max(0, Math.min(i10, arrayList.size() - 1)));
                    a aVar4 = (a) arrayList.get(Math.max(0, Math.min(i11, arrayList.size() - 1)));
                    this.f32504g3.O(false);
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    if (z10) {
                        post(new jg.f1(this, aVar3, aVar4, 5));
                    } else {
                        post(new m2(this, aVar3, 9));
                    }
                }
            }
        }
    }

    public final void X1(org.telegram.tgnet.tl.TL_iv.PageBlock r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.X1(org.telegram.tgnet.tl.TL_iv$PageBlock):void");
    }

    public final p5 X2() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return a3((g1) findFocus);
        }
        return null;
    }

    public final void X4(li.a r4, org.telegram.tgnet.tl.TL_iv.PageBlock r5, int r6, int r7, boolean r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.X4(li.a, org.telegram.tgnet.tl.TL_iv$PageBlock, int, int, boolean, boolean):void");
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
        for (int i12 = 0; i12 < this.f17564t3.size(); i12++) {
            for (t tVar : W3((a) this.f17564t3.get(i12))) {
                if (tVar != null && (document = tVar.h) != null && document.f22034id == j10) {
                    return document;
                }
            }
        }
        TL_iv.RichMessage richMessage = this.f17562s3;
        if (richMessage != null && (arrayList = richMessage.documents) != null) {
            int size = arrayList.size();
            while (i11 < size) {
                TLRPC.Document document3 = arrayList.get(i11);
                i11++;
                TLRPC.Document document4 = document3;
                if (document4 != null && document4.f22034id == j10) {
                    return document4;
                }
            }
        }
        HashMap hashMap = v4.f17577a;
        synchronized (v4.class) {
            if (i10 != 0) {
                document2 = (TLRPC.Document) v4.f17578b.get(Long.valueOf(j10));
            }
        }
        return document2;
    }

    public final boolean Y4() {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.Y4():boolean");
    }

    public final void Z1(a aVar, MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        v3 v3Var;
        if (aVar != null && J3(aVar.f17053b)) {
            String str = photoEntry.imagePath;
            if (str == null) {
                str = photoEntry.path;
            }
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                t Z3 = Z3(photoEntry, str2);
                boolean c10 = w4.c(photoEntry);
                if (!photoEntry.isVideo && !c10) {
                    pageblockvideo = new TL_iv.pageBlockPhoto();
                } else {
                    pageblockvideo = new TL_iv.pageBlockVideo();
                }
                if (H3(aVar.f17053b)) {
                    m3(aVar.f17053b).add(pageblockvideo);
                    if (aVar.h == null) {
                        aVar.h = new ArrayList();
                    }
                    aVar.h.add(Z3);
                } else {
                    t tVar = aVar.f17056g;
                    if (tVar != null && tVar.f17476a != 0) {
                        TL_iv.pageBlockCollage pageblockcollage = new TL_iv.pageBlockCollage();
                        pageblockcollage.caption = aVar.f17053b.caption;
                        j0.d(pageblockcollage);
                        ArrayList<TL_iv.PageBlock> arrayList = new ArrayList<>();
                        pageblockcollage.items = arrayList;
                        arrayList.add(aVar.f17053b);
                        pageblockcollage.items.add(pageblockvideo);
                        ArrayList arrayList2 = new ArrayList();
                        aVar.h = arrayList2;
                        arrayList2.add(aVar.f17056g);
                        aVar.h.add(Z3);
                        aVar.f17056g = null;
                        aVar.f17053b = pageblockcollage;
                    } else {
                        aVar.f17053b = pageblockvideo;
                        aVar.f17056g = Z3;
                    }
                }
                this.f32504g3.O(false);
                t4(aVar);
                if (c10) {
                    Q4(aVar, Z3, photoEntry);
                    v3Var = this;
                } else {
                    v3Var = this;
                    v3Var.R4(aVar, Z3, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
                }
                f2 f2Var2 = v3Var.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                v3Var.f17556p3.onContentChanged();
            }
        }
    }

    public final int Z2(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f17564t3;
            if (i10 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i10);
            if (!aVar.f17057i) {
                int i12 = -1;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    a aVar2 = (a) arrayList.get(i14);
                    if (D3(aVar2)) {
                        i13++;
                        if (i12 == -1 && !((TL_iv.pageBlockDetails) aVar2.f17053b).open) {
                            i12 = i13;
                        }
                    } else if (aVar2.f17057i) {
                        if (i12 != -1 && i13 == i12) {
                            i12 = -1;
                        }
                        i13--;
                    }
                }
                if (i12 != -1) {
                    continue;
                } else {
                    TL_iv.PageBlock pageBlock = aVar.f17053b;
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
        throw new UnsupportedOperationException("Method not decompiled: li.v3.Z4(android.view.View, float, float):boolean");
    }

    public final void a2(TL_iv.RichMessage richMessage) {
        ArrayList<TL_iv.PageBlock> arrayList;
        int indexOf;
        if (richMessage != null && (arrayList = richMessage.blocks) != null && !arrayList.isEmpty()) {
            f2 f2Var = this.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_iv.RichMessage richMessage2 = this.f17562s3;
            if (richMessage2 == null) {
                this.f17562s3 = richMessage;
            } else {
                ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                if (arrayList2 != null) {
                    richMessage2.photos.addAll(arrayList2);
                }
                ArrayList<TLRPC.Document> arrayList3 = richMessage.documents;
                if (arrayList3 != null) {
                    this.f17562s3.documents.addAll(arrayList3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            c3(arrayList4, richMessage.blocks, this.f17566u3);
            if (!arrayList4.isEmpty()) {
                for (int i10 = 0; i10 < arrayList4.size(); i10++) {
                    B4((a) arrayList4.get(i10));
                }
                ArrayList arrayList5 = this.f17564t3;
                int size = arrayList5.size();
                a W2 = W2();
                if (W2 != null && (indexOf = arrayList5.indexOf(W2)) >= 0) {
                    TL_iv.PageBlock pageBlock = W2.f17053b;
                    if ((pageBlock instanceof TL_iv.pageBlockParagraph) && d6.y(pageBlock).isEmpty()) {
                        arrayList5.remove(indexOf);
                        size = indexOf;
                    } else {
                        size = indexOf + 1;
                    }
                }
                arrayList5.addAll(size, arrayList4);
                b4();
                y4();
                this.f32504g3.O(false);
                f2 f2Var2 = this.R3;
                if (f2Var2 != null) {
                    f2Var2.h();
                }
                t3 t3Var = this.f17556p3;
                if (t3Var != null) {
                    t3Var.onContentChanged();
                }
            }
        }
    }

    public final a a4(int i10, int i11) {
        while (i10 >= 0) {
            ArrayList arrayList = this.f17573x4;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f17057i) {
                    if (aVar.f17068t == 0) {
                        TL_iv.PageBlock pageBlock = aVar.f17053b;
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
            ArrayList arrayList = this.f17564t3;
            if (arrayList.indexOf(aVar2) >= 0 && !D3(aVar2) && !aVar2.f17057i) {
                TL_iv.PageBlock pageBlock2 = aVar2.f17053b;
                if (pageBlock != pageBlock2 && G3(pageBlock2) && G3(pageBlock)) {
                    d6 A2 = A2(arrayList.indexOf(aVar2));
                    if (A2 != null) {
                        z12 = A2.getEditText().getText();
                    } else {
                        z12 = d6.z(aVar2.f17053b);
                    }
                    d6.d(pageBlock, z12);
                    TL_iv.RichText j10 = d6.j(aVar2.f17053b);
                    if (j10 != null && d6.j(pageBlock) != null) {
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
        ArrayList arrayList = this.f17573x4;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0 && (i11 = indexOf + i10) >= 0 && i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if (aVar2.f17068t != 0) {
                return aVar2;
            }
            return null;
        }
        return null;
    }

    public final void b3() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d6) {
                d6 d6Var = (d6) childAt;
                d6Var.f17196f.n();
                d6Var.h.n();
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().n();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().n();
            }
        }
    }

    public final void b4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17564t3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (!aVar.f17059k.isEmpty() && d6.o(aVar.f17053b)) {
                    long a2 = o0.a();
                    TL_iv.RichText j10 = d6.j(aVar.f17053b);
                    if (j10 != null && !(j10 instanceof TL_iv.textEmpty)) {
                        this.f17566u3.put(Long.valueOf(a2), j10);
                    }
                    aVar.f17059k.add(Long.valueOf(a2));
                    TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                    pageblockparagraph.text = aVar.f17053b.text;
                    aVar.f17053b = pageblockparagraph;
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
        a5(aVar2, pageBlock, aVar2.f17054c, aVar2.d, aVar2.e, aVar2.f17055f);
    }

    public final boolean c2(int r21, int r22, int r23, int r24, java.lang.String[] r25) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.c2(int, int, int, int, java.lang.String[]):boolean");
    }

    public final boolean c4(li.a r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.c4(li.a, boolean):boolean");
    }

    public final void c5(a aVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        v3 v3Var;
        TL_iv.PageBlock pageBlock;
        if (aVar == null) {
            aVar = d5();
        }
        a aVar2 = aVar;
        if (aVar2 == null) {
            return;
        }
        if (i10 == 0) {
            a5(aVar2, aVar2.f17053b, 0, 0, false, false);
            return;
        }
        int max = Math.max(1, aVar2.f17054c);
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
        TL_iv.PageBlock pageBlock2 = aVar2.f17053b;
        if (!(pageBlock2 instanceof TL_iv.pageBlockParagraph)) {
            pageBlock2 = new TL_iv.pageBlockParagraph();
        }
        if (z10 && aVar2.f17055f) {
            z11 = true;
            pageBlock = pageBlock2;
            v3Var = this;
        } else {
            z11 = false;
            v3Var = this;
            pageBlock = pageBlock2;
        }
        v3Var.a5(aVar2, pageBlock, max, i11, z10, z11);
    }

    public final void d2() {
        d6 d6Var;
        a aVar;
        a6 a6Var;
        this.f32504g3.T();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if ((childAt instanceof d6) && (aVar = (d6Var = (d6) childAt).f17201x) != null && (a6Var = d6Var.f17202y) != null) {
                d6Var.f(aVar, a6Var, d6Var.E);
            }
        }
    }

    public final void d4() {
        int length;
        int x9;
        int e;
        int length2;
        int x10;
        int e10;
        int length3;
        int x11;
        int e11;
        int length4;
        int x12;
        int e12;
        g1 T4;
        int length5;
        int x13;
        int e13;
        boolean R3 = R3();
        j3 j3Var = this.f17568v3;
        if (R3) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25413q0;
            if (i11 == j3Var.f25416t0 && (T4 = T4(i10, i11)) != null && (x13 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length5 = T4.length()), 0)) < (e13 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length5, 0))) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
                }
                if (f6.h(T4.getText(), x13, e13)) {
                    f6.n(T4.getText(), x13, e13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    u4();
                }
                T4.setSelectionOverride(x13, e13);
                T4.makeSelectedDate();
            }
        } else if (E3()) {
            int i12 = j3Var.f25412p0;
            g1 O2 = O2(i12);
            if (O2 != null && (x12 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length4 = O2.length()), 0)) < (e12 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length4, 0))) {
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                if (f6.h(O2.getText(), x12, e12)) {
                    f6.n(O2.getText(), x12, e12);
                    O2.invalidateEffects();
                    k4(i12);
                    f2 f2Var4 = this.R3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    u4();
                }
                O2.setSelectionOverride(x12, e12);
                O2.makeSelectedDate();
            }
        } else if (C3()) {
            int i13 = j3Var.f25412p0;
            g1 y22 = y2(i13);
            if (y22 != null && (x11 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length3 = y22.length()), 0)) < (e11 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length3, 0))) {
                f2 f2Var5 = this.R3;
                if (f2Var5 != null) {
                    f2Var5.d();
                }
                if (f6.h(y22.getText(), x11, e11)) {
                    f6.n(y22.getText(), x11, e11);
                    y22.invalidateEffects();
                    j4(i13);
                    f2 f2Var6 = this.R3;
                    if (f2Var6 != null) {
                        f2Var6.h();
                    }
                    u4();
                }
                y22.setSelectionOverride(x11, e11);
                y22.makeSelectedDate();
            }
        } else if (M3()) {
            int i14 = j3Var.f25412p0;
            g1 p42 = p4(i14);
            if (p42 != null && (x10 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length2 = p42.length()), 0)) < (e10 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length2, 0))) {
                f2 f2Var7 = this.R3;
                if (f2Var7 != null) {
                    f2Var7.d();
                }
                if (f6.h(p42.getText(), x10, e10)) {
                    f6.n(p42.getText(), x10, e10);
                    p42.invalidateEffects();
                    l4(i14);
                    f2 f2Var8 = this.R3;
                    if (f2Var8 != null) {
                        f2Var8.h();
                    }
                    u4();
                }
                p42.setSelectionOverride(x10, e10);
                p42.makeSelectedDate();
            }
        } else {
            d6 M4 = M4();
            if (M4 == null || (x9 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length = M4.getEditText().length()), 0)) >= (e = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length, 0))) {
                return;
            }
            f2 f2Var9 = this.R3;
            if (f2Var9 != null) {
                f2Var9.d();
            }
            if (f6.h(M4.getEditText().getText(), x9, e)) {
                f6.n(M4.getEditText().getText(), x9, e);
                M4.getEditText().invalidateEffects();
                M4.w();
                f2 f2Var10 = this.R3;
                if (f2Var10 != null) {
                    f2Var10.h();
                }
                u4();
            }
            M4.getEditText().setSelectionOverride(x9, e);
            M4.getEditText().makeSelectedDate();
        }
    }

    public final a d5() {
        j3 j3Var;
        int i10;
        a W2 = W2();
        if (W2 == null && (j3Var = this.f17568v3) != null && j3Var.x() && (i10 = j3Var.f25412p0) == j3Var.f25415s0) {
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
                arrayList = this.f17573x4;
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
                    ArrayList arrayList3 = aVar5.f17059k;
                    if (arrayList3.size() > i14) {
                        i14 = arrayList3.size();
                    }
                }
                i13++;
            }
            if (i14 != 0) {
                if (this.f17574y4 == null) {
                    xm0 xm0Var = new xm0(this);
                    this.f17574y4 = xm0Var;
                    xm0Var.a(null, null, null, this.f17554o3, 1);
                    zd.a(this.f17574y4, this.f17554o3);
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
                                ArrayList arrayList4 = aVar.f17059k;
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
                                int C = org.telegram.messenger.t.C(16.0f, getWidth(), dp);
                                if (C - dp2 > AndroidUtilities.dp(8.0f)) {
                                    float floor = (float) Math.floor(SharedConfig.bubbleRadius / 3.0f);
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    rectF.set(dp2, q42 + f10, C, f12 - q43);
                                    aVar2 = aVar6;
                                    aVar3 = aVar7;
                                    this.f17574y4.c(floor, floor, floor, f11, canvas, rectF);
                                    f7 = f11;
                                    this.f17574y4.f(canvas, rectF, f7);
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
                            if (aVar != null && aVar == this.f17540a4) {
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
        ArrayList arrayList = this.V3;
        if (arrayList != null && !arrayList.isEmpty()) {
            int max = Math.max(0, Math.min(i10, i11));
            int max2 = Math.max(0, Math.max(i10, i11));
            int[] U3 = U3(max);
            int[] U32 = U3(max2);
            a aVar = (a) this.V3.get(U3[0]);
            if (U3[0] != U32[0] && max != max2) {
                View F1 = F1(aVar);
                View F12 = F1(this.V3.get(U32[0]));
                if ((F1 instanceof d6) && (F12 instanceof d6)) {
                    int i12 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.f17564t3;
                        int size = arrayList2.size();
                        j3Var = this.f17568v3;
                        if (i12 >= size) {
                            break;
                        }
                        j3Var.X(i12, d6.y(((a) arrayList2.get(i12)).f17053b));
                        i12++;
                    }
                    d6 d6Var = (d6) F1;
                    int length = d6Var.getEditText().length();
                    if (U3[1] >= length) {
                        length = Math.max(0, length - 1);
                    }
                    if (!j3Var.j0(d6Var, 0, U3[1], length)) {
                        d6Var.A();
                        return true;
                    }
                    j3Var.b0(0, U32[1], (d6) F12);
                    return true;
                }
            } else {
                View F13 = F1(aVar);
                if (F13 instanceof d6) {
                    d6 d6Var2 = (d6) F13;
                    d6Var2.A();
                    g1 editText = d6Var2.getEditText();
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
        v3 v3Var;
        int i13;
        int i14;
        ArrayList arrayList = new ArrayList();
        int i15 = i10;
        while (i15 < i11) {
            ArrayList arrayList2 = this.f17564t3;
            a aVar = (a) arrayList2.get(i15);
            boolean z12 = aVar.f17057i;
            ArrayList arrayList3 = aVar.f17059k;
            if (z12) {
                i15++;
            } else if (arrayList3.size() > i12) {
                Long l4 = (Long) arrayList3.get(i12);
                long longValue = l4.longValue();
                int i16 = i15 + 1;
                while (i16 < i11) {
                    a aVar2 = (a) arrayList2.get(i16);
                    if (aVar2.f17059k.size() <= i12 || ((Long) aVar2.f17059k.get(i12)).longValue() != longValue) {
                        break;
                    }
                    i16++;
                }
                ArrayList<TL_iv.PageBlock> e32 = e3(i15, i16, i12 + 1, true);
                if (e32.isEmpty()) {
                    pageblockblockquoteblocks = null;
                } else {
                    TL_iv.RichText richText = (TL_iv.RichText) this.f17566u3.get(l4);
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
                TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) aVar.f17053b;
                if (pageblockdetails.title == null) {
                    pageblockdetails.title = new TL_iv.textEmpty();
                }
                int V3 = V3(i15);
                pageblockdetails.blocks = e3(i15 + 1, Math.min(V3, i11), i12, true);
                arrayList.add(pageblockdetails);
                i15 = V3 + 1;
            } else {
                int i17 = aVar.f17054c;
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
                        v3Var = this;
                    } else {
                        z11 = false;
                        v3Var = this;
                        i13 = i11;
                        i14 = i12;
                    }
                    TL_iv.PageBlock q22 = v3Var.q2(i15, i17, i13, i14, z11, iArr);
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
            while (!arrayList.isEmpty() && F3((TL_iv.PageBlock) ic.a.g(1, arrayList))) {
                a1.g.A(1, arrayList);
            }
        }
        return arrayList;
    }

    public final void e4(int i10) {
        int i11;
        f2 f2Var;
        int i12;
        boolean z10;
        int i13;
        int i14;
        SpannableStringBuilder spannableStringBuilder;
        int i15;
        int length;
        int x9;
        int e;
        boolean z11;
        int i16;
        int length2;
        int x10;
        int e10;
        boolean z12;
        int i17;
        int length3;
        int x11;
        int e11;
        boolean z13;
        int i18;
        f2 f2Var2;
        int i19;
        int i20;
        int i21;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            boolean R3 = R3();
            t3 t3Var = this.f17556p3;
            int i22 = 0;
            if (R3) {
                int i23 = j3Var.f25412p0;
                int i24 = j3Var.f25413q0;
                int i25 = j3Var.f25416t0;
                int i26 = j3Var.f25414r0;
                int i27 = j3Var.f25417u0;
                boolean Q3 = Q3(i10, i23, i24, i26, i25, i27);
                if (!Q3) {
                    i18 = C2(i10);
                } else {
                    i18 = 0;
                }
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                this.Q3 = true;
                int i28 = i24;
                boolean z14 = false;
                while (i28 <= i25) {
                    g1 T4 = T4(i23, i28);
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
                            z14 = true;
                        }
                    }
                    i28++;
                    i24 = i21;
                }
                this.Q3 = false;
                if (z14 && (f2Var2 = this.R3) != null) {
                    f2Var2.h();
                }
                t3Var.n();
                if (z14) {
                    u4();
                }
            } else if (E3()) {
                int i30 = j3Var.f25412p0;
                g1 O2 = O2(i30);
                if (O2 != null && (x11 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length3 = O2.length()), 0)) < (e11 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length3, 0))) {
                    if ((O2.getCurrentStyle(x11, e11) & i10) == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    f2 f2Var4 = this.R3;
                    if (f2Var4 != null) {
                        f2Var4.d();
                    }
                    this.Q3 = true;
                    if (z13) {
                        int C2 = C2(i10);
                        if (C2 != 0) {
                            O2.removeStyle(C2, x11, e11);
                        }
                        O2.addStyle(i10, x11, e11);
                    } else {
                        O2.removeStyle(i10, x11, e11);
                    }
                    this.Q3 = false;
                    k4(i30);
                    O2.invalidateEffects();
                    O2.requestLayout();
                    f2 f2Var5 = this.R3;
                    if (f2Var5 != null) {
                        f2Var5.h();
                    }
                    t3Var.n();
                    u4();
                }
            } else if (C3()) {
                int i31 = j3Var.f25412p0;
                g1 y22 = y2(i31);
                if (y22 != null && (x10 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length2 = y22.length()), 0)) < (e10 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length2, 0))) {
                    if ((y22.getCurrentStyle(x10, e10) & i10) == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        i17 = C2(i10);
                    } else {
                        i17 = 0;
                    }
                    f2 f2Var6 = this.R3;
                    if (f2Var6 != null) {
                        f2Var6.d();
                    }
                    this.Q3 = true;
                    if (z12) {
                        if (i17 != 0) {
                            y22.removeStyle(i17, x10, e10);
                        }
                        y22.addStyle(i10, x10, e10);
                    } else {
                        y22.removeStyle(i10, x10, e10);
                    }
                    y22.invalidateEffects();
                    y22.requestLayout();
                    j4(i31);
                    this.Q3 = false;
                    f2 f2Var7 = this.R3;
                    if (f2Var7 != null) {
                        f2Var7.h();
                    }
                    t3Var.n();
                    u4();
                }
            } else if (M3()) {
                int i32 = j3Var.f25412p0;
                g1 p42 = p4(i32);
                if (p42 != null && (x9 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length = p42.length()), 0)) < (e = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length, 0))) {
                    if ((p42.getCurrentStyle(x9, e) & i10) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i16 = C2(i10);
                    } else {
                        i16 = 0;
                    }
                    f2 f2Var8 = this.R3;
                    if (f2Var8 != null) {
                        f2Var8.d();
                    }
                    this.Q3 = true;
                    if (z11) {
                        if (i16 != 0) {
                            p42.removeStyle(i16, x9, e);
                        }
                        p42.addStyle(i10, x9, e);
                    } else {
                        p42.removeStyle(i10, x9, e);
                    }
                    p42.invalidateEffects();
                    p42.requestLayout();
                    l4(i32);
                    this.Q3 = false;
                    f2 f2Var9 = this.R3;
                    if (f2Var9 != null) {
                        f2Var9.h();
                    }
                    t3Var.n();
                    u4();
                }
            } else {
                int i33 = j3Var.f25412p0;
                int i34 = j3Var.f25415s0;
                int i35 = j3Var.f25414r0;
                int i36 = j3Var.f25417u0;
                if (i33 >= 0 && i34 >= 0 && i34 >= i33 && i34 < this.f17573x4.size()) {
                    int i37 = i10;
                    boolean P3 = P3(i37, i33, i35, i34, i36);
                    boolean z15 = !P3;
                    if (!P3) {
                        i11 = C2(i37);
                    } else {
                        i11 = 0;
                    }
                    f2 f2Var10 = this.R3;
                    if (f2Var10 != null) {
                        f2Var10.d();
                    }
                    this.Q3 = true;
                    int i38 = i33;
                    boolean z16 = false;
                    while (i38 <= i34) {
                        a E4 = E4(i38);
                        if (E4 != null) {
                            TL_iv.PageBlock pageBlock = E4.f17053b;
                            if (G3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted)) {
                                int o22 = o2(i38);
                                if (i38 == i33) {
                                    i13 = i35;
                                } else {
                                    i13 = i22;
                                }
                                z10 = z16;
                                if (i38 == i34) {
                                    i14 = i36;
                                } else {
                                    i14 = o22;
                                }
                                int max3 = Math.max(i22, Math.min(i13, o22));
                                int max4 = Math.max(i22, Math.min(i14, o22));
                                if (max3 >= max4) {
                                    i12 = i11;
                                    z16 = z10;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                } else {
                                    d6 A2 = A2(i38);
                                    if (A2 != null) {
                                        org.telegram.ui.ActionBar.b5 styleDelegate = A2.getStyleDelegate();
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
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(d6.z(E4.f17053b));
                                        if (!P3 && i11 != 0) {
                                            i12 = i11;
                                            i15 = max3;
                                            f6.o(spannableStringBuilder2, i15, max4, i12, false, null);
                                            spannableStringBuilder = spannableStringBuilder2;
                                        } else {
                                            i12 = i11;
                                            spannableStringBuilder = spannableStringBuilder2;
                                            i15 = max3;
                                        }
                                        f6.o(spannableStringBuilder, i15, max4, i37, z15, null);
                                        d6.d(E4.f17053b, spannableStringBuilder);
                                    }
                                    z16 = true;
                                    i38++;
                                    i37 = i10;
                                    i11 = i12;
                                    i22 = 0;
                                }
                            }
                        }
                        i12 = i11;
                        z10 = z16;
                        z16 = z10;
                        i38++;
                        i37 = i10;
                        i11 = i12;
                        i22 = 0;
                    }
                    boolean z17 = z16;
                    this.Q3 = i22;
                    if (z17 && (f2Var = this.R3) != null) {
                        f2Var.h();
                    }
                    t3Var.n();
                    if (z17) {
                        u4();
                    }
                }
            }
        }
    }

    public final void e5(float f7, float f10) {
        TL_iv.pageTableCell l4;
        p5 p5Var = this.f17559q4;
        if (this.J3 && p5Var != null && this.F3 == p5Var && (l4 = p5Var.l((int) ((f7 - p5Var.getLeft()) - getLeft()), (int) ((f10 - p5Var.getTop()) - getTop()))) != null && l4 != this.M3) {
            this.M3 = l4;
            p5Var.v(this.L3, l4);
        }
    }

    public final ArrayList f3() {
        return e3(0, this.f17564t3.size(), 0, false);
    }

    public final void f4(android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.f4(android.view.View):void");
    }

    public final void f5(String str, a aVar) {
        a aVar2;
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f17053b;
            if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
                TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) pageBlock;
                if (!TextUtils.equals(pageblockpreformatted.language, str)) {
                    f2 f2Var = this.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    pageblockpreformatted.language = str;
                    d6 A2 = A2(this.f17564t3.indexOf(aVar));
                    if (A2 != null && (aVar2 = A2.f17201x) != null) {
                        A2.I(aVar2.f17053b, true);
                        A2.H = null;
                        A2.B();
                    }
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
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
            ArrayList arrayList6 = this.f17564t3;
            if (i18 < arrayList6.size()) {
                a aVar = (a) arrayList6.get(i18);
                ArrayList arrayList7 = aVar.f17058j;
                ArrayList arrayList8 = aVar.f17059k;
                arrayList7.clear();
                int i19 = 1;
                if (aVar.f17057i) {
                    if (!arrayList.isEmpty()) {
                        a1.g.A(1, arrayList);
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
                        arrayList7.add((o0) arrayList.get(i21));
                    }
                    int max = Math.max(i17, aVar.f17054c);
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
                                arrayList2.add(Long.valueOf(o0.a()));
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
                                if (((Long) arrayList5.get(i23)).longValue() != 0 && K3(aVar.f17053b)) {
                                    i15 = i12;
                                } else {
                                    i15 = i14;
                                }
                                if (i15 != 0) {
                                    arrayList4.set(i23, Integer.valueOf(((Integer) arrayList4.get(i23)).intValue() + 1));
                                    arrayList5.set(i23, Long.valueOf(aVar.f17052a));
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
                        boolean z11 = ((TL_iv.pageBlockDetails) aVar.f17053b).open;
                        o0.a();
                        arrayList.add(new Object());
                        arrayList2.clear();
                        arrayList3.clear();
                        arrayList4.clear();
                        arrayList5.clear();
                    }
                    if (d6.o(aVar.f17053b)) {
                        o0.a();
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
        ArrayList arrayList = this.f17564t3;
        if (arrayList.isEmpty()) {
            aVar = null;
        } else {
            aVar = (a) ic.a.g(1, arrayList);
        }
        if (aVar != null && !K3(aVar.f17053b) && !aVar.f17057i && !D3(aVar) && !Q2(aVar.f17053b)) {
            if (!(F1(aVar) instanceof d6)) {
                return false;
            }
            k3(aVar);
            return true;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
        arrayList.add(aVar2);
        this.f32504g3.O(false);
        f2 f2Var2 = this.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        post(new m2(this, aVar2, 21));
        return true;
    }

    public final void g4() {
        int length;
        int x9;
        int e;
        int length2;
        int x10;
        int e10;
        int length3;
        int x11;
        int e11;
        int length4;
        int x12;
        int e12;
        g1 T4;
        int length5;
        int x13;
        int e13;
        boolean R3 = R3();
        t3 t3Var = this.f17556p3;
        j3 j3Var = this.f17568v3;
        if (R3) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25413q0;
            if (i11 == j3Var.f25416t0 && (T4 = T4(i10, i11)) != null && (x13 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length5 = T4.length()), 0)) < (e13 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length5, 0))) {
                if (f6.h(T4.getText(), x13, e13)) {
                    f2 f2Var = this.R3;
                    if (f2Var != null) {
                        f2Var.d();
                    }
                    f6.n(T4.getText(), x13, e13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var3 = this.R3;
                if (f2Var3 != null) {
                    f2Var3.d();
                }
                if (f6.g(T4.getText(), x13, e13)) {
                    f6.m(T4.getText(), x13, e13);
                    T4.invalidateEffects();
                    m4(i10, i11);
                    f2 f2Var4 = this.R3;
                    if (f2Var4 != null) {
                        f2Var4.h();
                    }
                    u4();
                }
                T4.setSelectionOverride(x13, e13);
                u3(false);
                K4(T4);
            }
        } else if (E3()) {
            int i12 = j3Var.f25412p0;
            g1 O2 = O2(i12);
            if (O2 != null && (x12 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length4 = O2.length()), 0)) < (e12 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length4, 0))) {
                if (f6.h(O2.getText(), x12, e12)) {
                    f2 f2Var5 = this.R3;
                    if (f2Var5 != null) {
                        f2Var5.d();
                    }
                    f6.n(O2.getText(), x12, e12);
                    O2.invalidateEffects();
                    k4(i12);
                    f2 f2Var6 = this.R3;
                    if (f2Var6 != null) {
                        f2Var6.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var7 = this.R3;
                if (f2Var7 != null) {
                    f2Var7.d();
                }
                if (f6.g(O2.getText(), x12, e12)) {
                    f6.m(O2.getText(), x12, e12);
                    O2.invalidateEffects();
                    k4(i12);
                    f2 f2Var8 = this.R3;
                    if (f2Var8 != null) {
                        f2Var8.h();
                    }
                    u4();
                }
                O2.setSelectionOverride(x12, e12);
                u3(false);
                K4(O2);
            }
        } else if (C3()) {
            int i13 = j3Var.f25412p0;
            g1 y22 = y2(i13);
            if (y22 != null && (x11 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length3 = y22.length()), 0)) < (e11 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length3, 0))) {
                if (f6.h(y22.getText(), x11, e11)) {
                    f2 f2Var9 = this.R3;
                    if (f2Var9 != null) {
                        f2Var9.d();
                    }
                    f6.n(y22.getText(), x11, e11);
                    y22.invalidateEffects();
                    j4(i13);
                    f2 f2Var10 = this.R3;
                    if (f2Var10 != null) {
                        f2Var10.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var11 = this.R3;
                if (f2Var11 != null) {
                    f2Var11.d();
                }
                if (f6.g(y22.getText(), x11, e11)) {
                    f6.m(y22.getText(), x11, e11);
                    y22.invalidateEffects();
                    j4(i13);
                    f2 f2Var12 = this.R3;
                    if (f2Var12 != null) {
                        f2Var12.h();
                    }
                    u4();
                }
                y22.setSelectionOverride(x11, e11);
                u3(false);
                K4(y22);
            }
        } else if (M3()) {
            int i14 = j3Var.f25412p0;
            g1 p42 = p4(i14);
            if (p42 != null && (x10 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length2 = p42.length()), 0)) < (e10 = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length2, 0))) {
                if (f6.h(p42.getText(), x10, e10)) {
                    f2 f2Var13 = this.R3;
                    if (f2Var13 != null) {
                        f2Var13.d();
                    }
                    f6.n(p42.getText(), x10, e10);
                    p42.invalidateEffects();
                    l4(i14);
                    f2 f2Var14 = this.R3;
                    if (f2Var14 != null) {
                        f2Var14.h();
                    }
                    t3Var.n();
                    u4();
                    return;
                }
                f2 f2Var15 = this.R3;
                if (f2Var15 != null) {
                    f2Var15.d();
                }
                if (f6.g(p42.getText(), x10, e10)) {
                    f6.m(p42.getText(), x10, e10);
                    p42.invalidateEffects();
                    l4(i14);
                    f2 f2Var16 = this.R3;
                    if (f2Var16 != null) {
                        f2Var16.h();
                    }
                    u4();
                }
                p42.setSelectionOverride(x10, e10);
                u3(false);
                K4(p42);
            }
        } else {
            d6 M4 = M4();
            if (M4 == null || (x9 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length = M4.getEditText().length()), 0)) >= (e = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length, 0))) {
                return;
            }
            if (f6.h(M4.getEditText().getText(), x9, e)) {
                f2 f2Var17 = this.R3;
                if (f2Var17 != null) {
                    f2Var17.d();
                }
                f6.n(M4.getEditText().getText(), x9, e);
                M4.getEditText().invalidateEffects();
                M4.w();
                f2 f2Var18 = this.R3;
                if (f2Var18 != null) {
                    f2Var18.h();
                }
                t3Var.n();
                u4();
                return;
            }
            f2 f2Var19 = this.R3;
            if (f2Var19 != null) {
                f2Var19.d();
            }
            if (f6.g(M4.getEditText().getText(), x9, e)) {
                f6.m(M4.getEditText().getText(), x9, e);
                M4.getEditText().invalidateEffects();
                M4.w();
                f2 f2Var20 = this.R3;
                if (f2Var20 != null) {
                    f2Var20.h();
                }
                u4();
            }
            M4.getEditText().setSelectionOverride(x9, e);
            u3(false);
            K4(M4.getEditText());
        }
    }

    public g1 getFocusedEditTextOrNull() {
        View findFocus = findFocus();
        if (findFocus instanceof g1) {
            return (g1) findFocus;
        }
        return null;
    }

    public m4 getMapDelegate() {
        return this.l4;
    }

    public View getOverlayView() {
        return this.f17570w3;
    }

    public s9 getTextSelectionHelper() {
        return this.f17568v3;
    }

    public final void h2(MessageObject messageObject) {
        TLRPC.Document document;
        String str;
        if (messageObject != null && (document = messageObject.getDocument()) != null) {
            f2 f2Var = this.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_iv.pageBlockAudio pageblockaudio = new TL_iv.pageBlockAudio();
            boolean z10 = false;
            a aVar = new a(pageblockaudio, 0, 0);
            t tVar = new t();
            aVar.f17056g = tVar;
            tVar.f17478c = true;
            long j10 = document.f22034id;
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
                t tVar2 = aVar.f17056g;
                tVar2.f17481i = document;
                tVar2.e = str;
                tVar2.f17476a = 1;
                tVar2.f17479f = 0.0f;
            } else {
                tVar.h = document;
                tVar.f17481i = document;
                tVar.f17476a = 2;
                pageblockaudio.audio_id = j10;
            }
            A3(aVar);
            if (z10) {
                t tVar3 = aVar.f17056g;
                String str2 = tVar3.e;
                IdentityHashMap identityHashMap = this.f17547h4;
                a5 a5Var = (a5) identityHashMap.remove(tVar3);
                if (a5Var != null) {
                    a5Var.b();
                }
                a5 a5Var2 = new a5(this.f17552n3, str2, document, new g3(aVar, tVar3, this));
                identityHashMap.put(tVar3, a5Var2);
                a5Var2.d();
            }
            f2 f2Var2 = this.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            this.f17556p3.onContentChanged();
        }
    }

    public final void h3(a aVar, boolean z10) {
        int i10;
        View F1 = F1(aVar);
        if (F1 instanceof g5) {
            g1 g1Var = ((g5) F1).f17264r;
            g1Var.r();
            if (z10) {
                i10 = g1Var.length();
            } else {
                i10 = 0;
            }
            g1Var.setSelection(i10);
            return;
        }
        i3(aVar, z10);
    }

    public final void h4() {
        g1 editText;
        Runnable i2Var;
        int length;
        final int x9;
        final int e;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            if (R3()) {
                int i10 = j3Var.f25412p0;
                int i11 = j3Var.f25413q0;
                if (i11 == j3Var.f25416t0) {
                    editText = T4(i10, i11);
                    i2Var = new n2(this, i10, i11, 1);
                } else {
                    return;
                }
            } else if (E3()) {
                int i12 = j3Var.f25412p0;
                editText = O2(i12);
                i2Var = new h2(this, i12, 3);
            } else if (C3()) {
                int i13 = j3Var.f25412p0;
                editText = y2(i13);
                i2Var = new h2(this, i13, 0);
            } else if (M3()) {
                int i14 = j3Var.f25412p0;
                editText = p4(i14);
                i2Var = new h2(this, i14, 1);
            } else {
                d6 M4 = M4();
                if (M4 != null) {
                    editText = M4.getEditText();
                    i2Var = new i2(M4, 0);
                } else {
                    return;
                }
            }
            final g1 g1Var = editText;
            final Runnable runnable = i2Var;
            if (g1Var != null && (x9 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length = g1Var.length()), 0)) <= (e = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length, 0))) {
                Editable text = g1Var.getText();
                int i15 = s.h;
                String str = null;
                if (text != null) {
                    s[] sVarArr = (s[]) text.getSpans(x9, e, s.class);
                    if (sVarArr.length > 0) {
                        str = sVarArr[0].f17455a;
                    }
                }
                if (str == null) {
                    str = g1Var.getText().subSequence(x9, e).toString();
                }
                final float dp = AndroidUtilities.dp(SharedConfig.fontSize + 4);
                int i16 = y6.G6;
                u6 u6Var = this.f17554o3;
                final int w02 = y6.w0(i16, u6Var);
                q.X(getContext(), str, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        s a2;
                        String str2 = (String) obj;
                        v3 v3Var = v3.this;
                        v3Var.getClass();
                        if (TextUtils.isEmpty(str2) || (a2 = s.a(str2, w02, dp)) == null) {
                            return;
                        }
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        j3 j3Var2 = v3Var.f17568v3;
                        if (j3Var2 != null) {
                            j3Var2.f(false);
                        }
                        g1 g1Var2 = g1Var;
                        g1Var2.setLocked(false);
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        Editable text2 = g1Var2.getText();
                        int max = Math.max(0, Math.min(x9, text2.length()));
                        text2.replace(max, Math.max(max, Math.min(e, text2.length())), spannableString);
                        runnable.run();
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        v3Var.f17556p3.onContentChanged();
                        int min = Math.min(max + 1, g1Var2.length());
                        g1Var2.r();
                        v3Var.post(new u2(g1Var2, min, 3));
                    }
                }, u6Var);
            }
        }
    }

    public final void h5(java.lang.CharSequence r18) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.h5(java.lang.CharSequence):void");
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
            tL_document.f22034id = 0L;
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
        if (F1 instanceof p5) {
            p5 p5Var = (p5) F1;
            g1 g1Var = p5Var.f17411r;
            h6 h6Var = p5Var.F;
            if (h6Var != null) {
                if (!z10) {
                    g1Var.r();
                    g1Var.setSelection(0);
                    return;
                } else if (!h6Var.f17289g.isEmpty()) {
                    s5 m10 = p5Var.v.m((TL_iv.pageTableCell) ic.a.g(1, p5Var.F.f17289g));
                    if (m10 != null) {
                        g1 g1Var2 = m10.f17474a;
                        g1Var2.r();
                        g1Var2.setSelection(g1Var2.length());
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        if (z10 && (F1 instanceof d6)) {
            d6 d6Var = (d6) F1;
            if (d6Var.m()) {
                d6Var.h();
                return;
            }
        }
        g1 X3 = X3(F1);
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
        throw new UnsupportedOperationException("Method not decompiled: li.v3.i4():void");
    }

    public final void j2(TLRPC.Document document, String str) {
        if (document != null) {
            f2 f2Var = this.R3;
            if (f2Var != null) {
                f2Var.d();
            }
            TL_iv.pageBlockDocument pageblockdocument = new TL_iv.pageBlockDocument();
            boolean z10 = false;
            a aVar = new a(pageblockdocument, 0, 0);
            t tVar = new t();
            aVar.f17056g = tVar;
            tVar.d = true;
            long j10 = document.f22034id;
            if (j10 == 0 || document.dc_id == 0 || document.access_hash == 0) {
                z10 = true;
            }
            if (z10) {
                if (!TextUtils.isEmpty(str) && b10.t(str)) {
                    t tVar2 = aVar.f17056g;
                    tVar2.h = document;
                    tVar2.e = str;
                    tVar2.f17476a = 1;
                    tVar2.f17479f = 0.0f;
                } else {
                    return;
                }
            } else {
                tVar.h = document;
                tVar.f17476a = 2;
                pageblockdocument.document_id = j10;
            }
            A3(aVar);
            if (z10) {
                t tVar3 = aVar.f17056g;
                IdentityHashMap identityHashMap = this.f17547h4;
                a5 a5Var = (a5) identityHashMap.remove(tVar3);
                if (a5Var != null) {
                    a5Var.b();
                }
                a5 a5Var2 = new a5(this.f17552n3, str, document, new f3(this, tVar3, aVar, str));
                identityHashMap.put(tVar3, a5Var2);
                a5Var2.d();
            }
            f2 f2Var2 = this.R3;
            if (f2Var2 != null) {
                f2Var2.h();
            }
            this.f17556p3.onContentChanged();
        }
    }

    public final void j3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            ((d6) F1).A();
        } else if (F1 instanceof s0) {
            ((s0) F1).d.r();
        }
    }

    public final void j4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof k0) {
            ((k0) G4).b();
        }
    }

    public final void k2(Uri uri) {
        boolean contains;
        if (uri != null) {
            a aVar = this.f17549j4;
            String str = null;
            this.f17549j4 = null;
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
            int i10 = this.f17576z4;
            this.f17576z4 = i10 - 1;
            Utilities.globalQueue.postRunnable(new p2(this, uri, z10, str2, i10, aVar));
        }
    }

    public final void k3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            d6 d6Var = (d6) F1;
            d6Var.A();
            g1 editText = d6Var.getEditText();
            editText.setSelection(editText.length());
        } else if (F1 instanceof s0) {
            s0 s0Var = (s0) F1;
            s0Var.d.r();
            g1 editText2 = s0Var.getEditText();
            editText2.setSelection(editText2.length());
        }
    }

    public final void k4(int i10) {
        a E4 = E4(i10);
        g1 O2 = O2(i10);
        if (D3(E4) && O2 != null) {
            ((TL_iv.pageBlockDetails) E4.f17053b).title = f6.f(O2.getText());
        }
    }

    public final void l2(MediaController.PhotoEntry photoEntry) {
        TL_iv.PageBlock pageblockvideo;
        v3 v3Var;
        String str = photoEntry.imagePath;
        if (str == null) {
            str = photoEntry.path;
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f2 f2Var = this.R3;
        if (f2Var != null) {
            f2Var.d();
        }
        boolean c10 = w4.c(photoEntry);
        if (!photoEntry.isVideo && !c10) {
            pageblockvideo = new TL_iv.pageBlockPhoto();
        } else {
            pageblockvideo = new TL_iv.pageBlockVideo();
        }
        a aVar = new a(pageblockvideo, 0, 0);
        aVar.f17056g = Z3(photoEntry, str2);
        A3(aVar);
        if (c10) {
            Q4(aVar, aVar.f17056g, photoEntry);
            v3Var = this;
        } else {
            v3Var = this;
            v3Var.R4(aVar, aVar.f17056g, str2, photoEntry.isVideo, photoEntry.width, photoEntry.height, photoEntry.duration);
        }
        f2 f2Var2 = v3Var.R3;
        if (f2Var2 != null) {
            f2Var2.h();
        }
        v3Var.f17556p3.onContentChanged();
    }

    public final void l3(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof d6) {
            d6 d6Var = (d6) F1;
            d6Var.A();
            d6Var.getEditText().setSelection(0);
        } else if (F1 instanceof s0) {
            s0 s0Var = (s0) F1;
            s0Var.d.r();
            s0Var.getEditText().setSelection(0);
        }
    }

    public final void l4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof d6) {
            ((d6) G4).v();
        }
    }

    public final void m2(p5 p5Var) {
        p5 p5Var2 = this.f17559q4;
        if (p5Var2 != null && p5Var2 != p5Var) {
            LinkedHashSet linkedHashSet = p5Var2.H;
            if (!linkedHashSet.isEmpty()) {
                linkedHashSet.clear();
                p5Var2.v.invalidate();
                p5Var2.s();
            }
        }
        this.f17559q4 = p5Var;
        this.K3 = false;
        this.f17565t4 = -1;
        this.f17563s4 = -1;
        p5Var.setCellSelectionListener(this.f17567u4);
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x()) {
            j3Var.f(false);
        }
        setEditTextsLocked(true);
    }

    public final void m4(int i10, int i11) {
        s5 m10;
        View G4 = G4(i10);
        if (G4 instanceof p5) {
            p5 p5Var = (p5) G4;
            if (i11 == 0) {
                p5Var.t();
                return;
            }
            TL_iv.pageTableCell g7 = p5Var.g(i11);
            if (g7 != null && (m10 = p5Var.getGrid().m(g7)) != null) {
                h6.d(g7, m10.f17474a.getText());
            }
        }
    }

    public final m3 n2() {
        int i10;
        int i11;
        j3 j3Var = this.f17568v3;
        if (j3Var != null && j3Var.x() && !M3()) {
            a E4 = E4(j3Var.f25412p0);
            ArrayList arrayList = this.f17564t3;
            int indexOf = arrayList.indexOf(E4);
            int indexOf2 = arrayList.indexOf(E4(j3Var.f25415s0));
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
                    if (aVar.f17057i || D3(aVar)) {
                        return null;
                    }
                }
                return new m3(this, i10, i11, j3Var.f25414r0, j3Var.f25417u0);
            }
            return null;
        }
        return null;
    }

    public final boolean n3(android.view.KeyEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.n3(android.view.KeyEvent):boolean");
    }

    public final int o2(int i10) {
        g1 O2 = O2(i10);
        if (O2 != null) {
            return O2.length();
        }
        d6 A2 = A2(i10);
        if (A2 != null) {
            return A2.getEditText().length();
        }
        a E4 = E4(i10);
        if (E4 == null) {
            return 0;
        }
        return d6.y(E4.f17053b).length();
    }

    public final boolean o3(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.o3(android.view.MotionEvent):boolean");
    }

    public final int o4(int i10) {
        Layout layout;
        View G4 = G4(i10);
        if (!(G4 instanceof d6) || (layout = ((d6) G4).getEditText().getLayout()) == null) {
            return 0;
        }
        return layout.getText().length();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.U3);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.U3);
        this.f32506i3 = false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        View F;
        int i14 = i13 - i11;
        int i15 = this.S3;
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
                    post(new h2(this, dp, 2));
                }
            }
        }
        this.S3 = i14;
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

    public final boolean p3(li.p5 r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.p3(li.p5, int, int):boolean");
    }

    public final g1 p4(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof d6) {
            return ((d6) G4).getAuthorEditText();
        }
        return null;
    }

    public final org.telegram.tgnet.tl.TL_iv.PageBlock q2(int r21, int r22, int r23, int r24, boolean r25, int[] r26) {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.q2(int, int, int, int, boolean, int[]):org.telegram.tgnet.tl.TL_iv$PageBlock");
    }

    public final boolean q3() {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.q3():boolean");
    }

    public final boolean r2() {
        g1 editText;
        int length;
        int x9;
        int e;
        k4[] k4VarArr;
        j3 j3Var = this.f17568v3;
        if (j3Var == null || !j3Var.x() || j3Var.f25412p0 != j3Var.f25415s0) {
            return false;
        }
        if (R3()) {
            int i10 = j3Var.f25412p0;
            int i11 = j3Var.f25413q0;
            if (i11 != j3Var.f25416t0) {
                return false;
            }
            editText = T4(i10, i11);
        } else if (E3()) {
            editText = O2(j3Var.f25412p0);
        } else if (C3()) {
            editText = y2(j3Var.f25412p0);
        } else if (M3()) {
            editText = p4(j3Var.f25412p0);
        } else {
            d6 M4 = M4();
            if (M4 == null) {
                return false;
            }
            editText = M4.getEditText();
        }
        if (editText == null || (x9 = ic.a.x(j3Var.f25414r0, j3Var.f25417u0, (length = editText.length()), 0)) >= (e = ic.a.e(j3Var.f25414r0, j3Var.f25417u0, length, 0))) {
            return false;
        }
        Editable text = editText.getText();
        if (text != null && x9 < e) {
            for (k4 k4Var : (k4[]) text.getSpans(x9, e, k4.class)) {
                if (text.getSpanStart(k4Var) < e && text.getSpanEnd(k4Var) > x9) {
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
            if (t2((a) this.f17564t3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean s3() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17564t3;
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
            ArrayList arrayList = this.f17564t3;
            if (i11 < arrayList.size()) {
                f2 f2Var = this.R3;
                if (f2Var != null) {
                    f2Var.d();
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
                    if (aVar.f17054c >= 1 && (i10 == 0 || ((a) arrayList.get(i10 - 1)).f17054c < aVar.f17054c)) {
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
                    if (findFocus() instanceof g1) {
                        d2();
                    } else {
                        this.f32504g3.O(false);
                    }
                    f2 f2Var2 = this.R3;
                    if (f2Var2 != null) {
                        f2Var2.h();
                    }
                }
                return z11;
            }
        }
        return false;
    }

    public void setAdaptiveLinkDialogs(boolean z10) {
        this.f17560r3 = z10;
    }

    public void setAllowTapAboveContent(boolean z10) {
        this.Z3 = z10;
    }

    public void setFileRefParentObject(MessageObject messageObject) {
        this.f17558q3 = messageObject;
    }

    public void setInitialText(CharSequence charSequence) {
        if (charSequence == null) {
            return;
        }
        this.V3 = new ArrayList();
        ArrayList arrayList = this.f17564t3;
        c3(arrayList, c5.b(charSequence), this.f17566u3);
        for (int size = arrayList.size(); size < arrayList.size(); size++) {
            this.V3.add((a) arrayList.get(size));
        }
        this.f32504g3.O(false);
    }

    public final boolean t2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar != null && (indexOf = (arrayList = this.f17564t3).indexOf(aVar)) >= 0 && indexOf >= 0 && indexOf < arrayList.size()) {
            a aVar2 = (a) arrayList.get(indexOf);
            if (aVar2.f17054c == 0) {
                TL_iv.PageBlock pageBlock = aVar2.f17053b;
                if (!(pageBlock instanceof TL_iv.pageBlockParagraph) && !I3(pageBlock) && !(pageBlock instanceof TL_iv.pageBlockPreformatted) && !(pageBlock instanceof TL_iv.pageBlockFooter) && !u2(indexOf)) {
                    return false;
                }
            } else if (indexOf <= 0 || ((a) arrayList.get(indexOf - 1)).f17054c < aVar2.f17054c) {
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
            if (childAt instanceof d6) {
                d6 d6Var = (d6) childAt;
                d6Var.f17196f.hideActionMode();
                d6Var.h.hideActionMode();
            } else if (childAt instanceof p5) {
                p5 p5Var = (p5) childAt;
                r5 r5Var = p5Var.v;
                p5Var.f17411r.hideActionMode();
                for (int i11 = 0; i11 < r5Var.getChildCount(); i11++) {
                    View childAt2 = r5Var.getChildAt(i11);
                    if (childAt2 instanceof s5) {
                        ((s5) childAt2).f17474a.hideActionMode();
                    }
                }
            } else if (childAt instanceof k0) {
                ((k0) childAt).getCaptionEditText().hideActionMode();
            } else if (childAt instanceof s0) {
                ((s0) childAt).getEditText().hideActionMode();
            }
        }
    }

    public final void t4(a aVar) {
        View F1 = F1(aVar);
        if (F1 instanceof u4) {
            u4 u4Var = (u4) F1;
            ArrayList arrayList = u4Var.f17532y;
            if (u4Var.f17652a != null) {
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
            ArrayList arrayList = this.f17564t3;
            if (i10 < arrayList.size() && K3(((a) arrayList.get(i10)).f17053b) && ((a) arrayList.get(i10 - 1)).f17054c >= 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void u3(boolean z10) {
        j3 j3Var = this.f17568v3;
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
            if (w2((a) this.f17564t3.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public final boolean v3(int i10) {
        if (((a) this.f17564t3.get(i10)).f17054c + 1 <= MessagesController.getInstance(this.f17552n3).config.richMessageMaxDepth.get() - 6) {
            return true;
        }
        return false;
    }

    public final void v4(int i10) {
        ArrayList arrayList = this.f17564t3;
        int min = Math.min(arrayList.size() - 1, i10 + 1);
        for (int max = Math.max(0, i10 - 1); max <= min; max++) {
            a aVar = (a) arrayList.get(max);
            if (aVar.f17054c > 0) {
                View F1 = F1(aVar);
                if (F1 instanceof d6) {
                    ((d6) F1).E();
                }
            }
        }
    }

    public final boolean w2(a aVar) {
        ArrayList arrayList;
        int indexOf;
        if (aVar == null || (indexOf = (arrayList = this.f17564t3).indexOf(aVar)) < 0 || aVar.f17054c <= 0 || indexOf < 0 || indexOf >= arrayList.size() || ((a) arrayList.get(indexOf)).f17054c <= 0) {
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
            ArrayList arrayList = this.f17564t3;
            if (i10 < arrayList.size()) {
                a aVar2 = (a) arrayList.get(i10);
                if (z10) {
                    if (aVar2.f17054c > 0) {
                        z2(i10);
                        return true;
                    }
                } else if (aVar2.f17054c == 0) {
                    TL_iv.PageBlock pageBlock = aVar2.f17053b;
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
                            aVar2.f17054c = 1;
                            if (aVar != null && aVar.d > 0) {
                                i12 = 1;
                            }
                            aVar2.d = i12;
                            return true;
                        }
                        aVar2.f17054c = aVar.f17054c;
                        if (aVar.d > 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        aVar2.d = i11;
                        aVar2.e = false;
                        aVar2.f17055f = false;
                        return true;
                    }
                } else if ((z11 || (i10 != 0 && ((a) arrayList.get(i10 - 1)).f17054c >= aVar2.f17054c)) && v3(i10)) {
                    aVar2.f17054c++;
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
        if (H3(aVar.f17053b)) {
            ArrayList m32 = m3(aVar.f17053b);
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
            k71 k71Var = this.f32504g3;
            if (size == 1) {
                TL_iv.PageCaption pageCaption = aVar.f17053b.caption;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) m32.get(0);
                aVar.f17053b = pageBlock;
                pageBlock.caption = pageCaption;
                aVar.f17056g = (t) aVar.h.get(0);
                aVar.h = null;
                k71Var.O(true);
                t4(aVar);
                return;
            }
            k71Var.O(true);
            t4(aVar);
            return;
        }
        x4(aVar);
    }

    public final boolean x2() {
        f2 f2Var = this.R3;
        if (f2Var != null) {
            if (f2Var.e || !f2Var.f17226b.isEmpty()) {
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
            aVar = (a) this.f17564t3.get(J4[0]);
        }
        if (aVar != null) {
            c4(aVar, z10);
        }
    }

    public final void x4(a aVar) {
        ArrayList arrayList = this.f17564t3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
            this.f32504g3.O(true);
        }
    }

    public final g1 y2(int i10) {
        View G4 = G4(i10);
        if (G4 instanceof k0) {
            return ((k0) G4).getCaptionEditText();
        }
        return null;
    }

    public final void y3(a aVar, ArrayList arrayList, HashMap hashMap, ArrayList arrayList2) {
        ArrayList arrayList3 = aVar.f17059k;
        int size = arrayList3.size();
        int i10 = 0;
        while (i10 < size && i10 < arrayList.size() && ((Long) arrayList3.get(i10)).equals(arrayList.get(i10))) {
            i10++;
        }
        for (int i11 = size - 1; i11 >= i10; i11--) {
            Long l4 = (Long) arrayList3.get(i11);
            long longValue = l4.longValue();
            Integer num = (Integer) hashMap.get(l4);
            if (num != null && (num.intValue() >= 2 || i11 != 0 || this.f17566u3.containsKey(l4))) {
                a aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
                aVar2.f17068t = longValue;
                for (int i12 = 0; i12 <= i11; i12++) {
                    aVar2.f17059k.add((Long) arrayList3.get(i12));
                }
                int i13 = f5.f17236a;
                u61 K = u61.K(f5.class);
                K.G = aVar2;
                K.H = this.f17553n4;
                arrayList2.add(K);
                this.f17573x4.add(aVar2);
            }
        }
    }

    public final void y4() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f17564t3;
            if (i10 < arrayList.size()) {
                a aVar = (a) arrayList.get(i10);
                if (aVar.f17054c > 0 && aVar.d > 0 && !K3(aVar.f17053b)) {
                    int i11 = aVar.f17054c;
                    int i12 = 1;
                    for (int i13 = i10 - 1; i13 >= 0; i13--) {
                        a aVar2 = (a) arrayList.get(i13);
                        int i14 = aVar2.f17054c;
                        if (i14 < i11) {
                            break;
                        }
                        if (i14 == i11 && !K3(aVar2.f17053b)) {
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
        ArrayList arrayList = this.f17564t3;
        a aVar2 = (a) arrayList.get(i10);
        int i12 = aVar2.f17054c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            aVar2.f17054c = i13;
            if (i13 == 0) {
                aVar2.d = 0;
                aVar2.e = false;
                aVar2.f17055f = false;
            }
            while (true) {
                i10++;
                if (i10 < arrayList.size() && (i11 = (aVar = (a) arrayList.get(i10)).f17054c) > i12) {
                    aVar.f17054c = i11 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final void z3() {
        throw new UnsupportedOperationException("Method not decompiled: li.v3.z3():void");
    }

    public final void z4(String str) {
        j3 j3Var = this.f17568v3;
        c2(j3Var.f25412p0, j3Var.f25414r0, j3Var.f25415s0, j3Var.f25417u0, str.split("\n", -1));
    }
}
