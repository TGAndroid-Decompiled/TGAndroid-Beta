package lh;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p10;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class r7 extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, ud.b {
    public TLRPC.User A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public String E0;
    public int F0;
    public final l7 G0;
    public boolean H0;
    public final ArrayList I0;
    public final RectF J0;
    public final ArrayList K0;
    public final ud.a T;
    public final int U;
    public boolean V;
    public final r7 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;

    public final MessagesController.SavedMusicList f16651a0;

    public final Utilities.Callback f16652b0;

    public MessageObject f16653c0;

    public boolean f16654d0;

    public boolean f16655e0;

    public final FrameLayout f16656f0;

    public final fi f16657g0;

    public final jg.e f16658h0;

    public final og.d f16659i0;

    public final og.d f16660j0;

    public final jg.a f16661k0;

    public final gh.s2 f16662l0;
    public b51 m0;

    public MessageObject f16663n0;

    public String f16664o0;

    public int f16665p0;

    public boolean f16666q0;

    public boolean f16667r0;

    public boolean f16668s0;

    public String f16669t0;

    public int f16670u0;

    public final l7 f16671v0;

    public String f16672w0;

    public boolean f16673x0;

    public boolean f16674y0;

    public boolean f16675z0;

    public r7(Context context, boolean z10, r7 r7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, true, false, false, 2, c6Var);
        er erVar = er.h;
        this.T = new ud.a(0, this, erVar, 380L, false);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.f16670u0 = -1;
        final int i10 = 0;
        this.f16671v0 = new Runnable(this) {

            public final r7 f16319b;

            {
                this.f16319b = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f16319b.b0();
                        break;
                    case 1:
                        this.f16319b.a0();
                        break;
                    default:
                        r7.S(this.f16319b);
                        break;
                }
            }
        };
        this.D0 = -1;
        this.F0 = -2000000000;
        final int i11 = 1;
        this.G0 = new Runnable(this) {

            public final r7 f16319b;

            {
                this.f16319b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        this.f16319b.b0();
                        break;
                    case 1:
                        this.f16319b.a0();
                        break;
                    default:
                        r7.S(this.f16319b);
                        break;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.I0 = arrayList;
        RectF rectF = new RectF();
        this.J0 = rectF;
        arrayList.add(rectF);
        this.K0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        K();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.V = z10;
        this.U = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.W = r7Var;
        this.f16652b0 = callback;
        og.c cVar = new og.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f16658h0 = new jg.e(false);
            og.d dVar = new og.d(null);
            this.f16660j0 = dVar;
            dVar.i(new m7(this));
            og.d dVar2 = new og.d(null);
            this.f16659i0 = dVar2;
            dVar2.i(new n7(this));
            jg.a aVar = new jg.a(dVar);
            this.f16661k0 = aVar;
            aVar.f12944f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f16658h0 = null;
            this.f16659i0 = null;
            this.f16660j0 = null;
            this.f16661k0 = new jg.a(cVar);
        }
        this.f16662l0 = new gh.s2(this, 1);
        int i12 = org.telegram.ui.ActionBar.g6.f22999a7;
        fi fiVar = new fi(context, i12, c6Var);
        this.f16657g0 = fiVar;
        fiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16656f0 = frameLayout;
        p10 p10Var = new p10(context, c6Var);
        p10Var.f31468r.setOnFocusChangeListener(new o7(this));
        p10Var.f31470w = true;
        p10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        p10Var.d();
        p10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        p10Var.f31468r.addTextChangedListener(new p7(this));
        p10Var.f31468r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(fiVar, h7.z5.g());
        frameLayout.addView(p10Var, h7.z5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        p10Var.setupBlurredBackground(this.f16661k0.c(p10Var, ng.c.m(c6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, h7.z5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i12));
        zk0 zk0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i13, 0, i13, 0);
        this.d.p1();
        f2.l lVar = new f2.l();
        lVar.f5819m = false;
        lVar.C = false;
        lVar.o(erVar);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        if (z10) {
            this.f16651a0 = null;
            if (this.V && !this.H0) {
                this.H0 = true;
                final int i14 = 2;
                Utilities.globalQueue.postRunnable(new Runnable(this) {

                    public final r7 f16319b;

                    {
                        this.f16319b = this;
                    }

                    @Override
                    public final void run() {
                        switch (i14) {
                            case 0:
                                this.f16319b.b0();
                                break;
                            case 1:
                                this.f16319b.a0();
                                break;
                            default:
                                r7.S(this.f16319b);
                                break;
                        }
                    }
                });
            }
        } else {
            int i15 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i15, UserConfig.getInstance(i15).getClientUserId());
            this.f16651a0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        }
        this.d.setOnScrollListener(new q7(this));
        this.d.setOnItemClickListener(new jh.d0(this, callback, c6Var, 1));
    }

    public static void P(r7 r7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = r7Var.Z;
        boolean z10 = false;
        r7Var.f16674y0 = false;
        r7Var.f16675z0 = false;
        if (messages_botresults == null) {
            r7Var.m0.N(true);
            return;
        }
        MessagesController.getInstance(r7Var.currentAccount).putUsers(messages_botresults.users, false);
        ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.BotInlineResult botInlineResult = arrayList2.get(i10);
            i10++;
            TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
            if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                if (tL_botInlineMediaResult.document != null) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    int i11 = r7Var.F0;
                    r7Var.F0 = i11 - 1;
                    tL_message.f22401id = i11;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(r7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                    tL_message.flags |= 768;
                    arrayList.add(new MessageObject(r7Var.currentAccount, tL_message, false, true));
                }
            }
        }
        r7Var.f16672w0 = messages_botresults.next_offset;
        if (!arrayList.isEmpty() && !TextUtils.isEmpty(r7Var.f16672w0)) {
            z10 = true;
        }
        r7Var.f16673x0 = z10;
        r7Var.m0.N(true);
    }

    public static void Q(r7 r7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        if (!(view instanceof org.telegram.ui.Cells.e7)) {
            n41 n41VarG = r7Var.m0.G(i10 - 1);
            if (n41VarG != null && n41VarG.d == 1) {
                new r7(r7Var.getContext(), true, r7Var, callback, c6Var).show();
                return;
            }
            if (n41VarG != null && n41VarG.d == 2) {
                r7Var.f16651a0.load();
                return;
            }
            if (n41VarG != null && n41VarG.d == 3) {
                r7Var.b0();
                return;
            } else {
                if (n41VarG == null || n41VarG.d != 4) {
                    return;
                }
                r7Var.a0();
                return;
            }
        }
        MessageObject message = ((org.telegram.ui.Cells.e7) view).getMessage();
        if (message == null) {
            return;
        }
        DownloadController.getInstance(r7Var.currentAccount).removeLoadingFileObserver(r7Var);
        if (r7Var.f16653c0 != null) {
            FileLoader.getInstance(r7Var.currentAccount).cancelLoadFile(r7Var.f16653c0.getDocument());
            r7Var.f16653c0 = null;
        }
        if (message.attachPathExists || message.mediaExists) {
            r7Var.f16652b0.run(message);
            r7 r7Var2 = r7Var.W;
            if (r7Var2 != null) {
                r7Var2.dismiss();
            }
            r7Var.dismiss();
            return;
        }
        String fileName = message.getFileName();
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        r7Var.f16653c0 = message;
        DownloadController.getInstance(r7Var.currentAccount).addLoadingFileObserver(fileName, message, r7Var);
        FileLoader.getInstance(r7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
    }

    public static void R(r7 r7Var, TLObject tLObject) {
        ArrayList arrayList = r7Var.Y;
        boolean z10 = false;
        r7Var.f16668s0 = false;
        r7Var.f16667r0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(r7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(r7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(r7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            r7Var.f16666q0 = z10;
            r7Var.f16665p0 = messages_messages.next_rate;
        } else {
            r7Var.f16666q0 = false;
            r7Var.f16665p0 = 0;
        }
        r7Var.m0.N(true);
    }

    public static void S(r7 r7Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (cursorQuery.moveToNext()) {
                try {
                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                    audioEntry.f19615id = cursorQuery.getInt(0);
                    audioEntry.author = cursorQuery.getString(1);
                    audioEntry.title = cursorQuery.getString(2);
                    audioEntry.path = cursorQuery.getString(3);
                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                    audioEntry.genre = cursorQuery.getString(5);
                    File file = new File(audioEntry.path);
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.out = true;
                    tL_message.f22401id = i10;
                    tL_message.peer_id = new TLRPC.TL_peerUser();
                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                    tL_message.from_id = tL_peerUser;
                    TLRPC.Peer peer = tL_message.peer_id;
                    long clientUserId = UserConfig.getInstance(r7Var.currentAccount).getClientUserId();
                    tL_peerUser.user_id = clientUserId;
                    peer.user_id = clientUserId;
                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                    tL_message.message = "";
                    tL_message.attachPath = audioEntry.path;
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.flags |= 3;
                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                    tL_message.flags |= 768;
                    String fileExtension = FileLoader.getFileExtension(file);
                    TLRPC.Document document = tL_message.media.document;
                    document.f22386id = 0L;
                    document.access_hash = 0L;
                    document.file_reference = new byte[0];
                    document.date = tL_message.date;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("audio/");
                    if (fileExtension.length() <= 0) {
                        fileExtension = "mp3";
                    }
                    sb2.append(fileExtension);
                    document.mime_type = sb2.toString();
                    tL_message.media.document.size = (int) file.length();
                    tL_message.media.document.dc_id = 0;
                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                    tL_documentAttributeAudio.duration = audioEntry.duration;
                    tL_documentAttributeAudio.title = audioEntry.title;
                    tL_documentAttributeAudio.performer = audioEntry.author;
                    tL_documentAttributeAudio.flags = 3 | tL_documentAttributeAudio.flags;
                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_documentAttributeFilename.file_name = file.getName();
                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                    MessageObject messageObject = new MessageObject(r7Var.currentAccount, tL_message, false, true);
                    audioEntry.messageObject = messageObject;
                    arrayList.add(messageObject);
                    i10--;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            cursorQuery.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AndroidUtilities.runOnUIThread(new jh.p6(29, r7Var, arrayList));
    }

    public static void T(r7 r7Var, Long l10) {
        r7Var.B0 = false;
        TLRPC.User user = l10 == null ? null : MessagesController.getInstance(r7Var.currentAccount).getUser(l10);
        r7Var.A0 = user;
        r7Var.C0 = user == null;
        if (user != null) {
            r7Var.a0();
        }
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || org.telegram.messenger.y1.x(" ", str, lowerCase)) {
            return true;
        }
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        return strTranslitSafe.startsWith(str2) || org.telegram.messenger.y1.x(" ", str2, strTranslitSafe);
    }

    @Override
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f16658h0 != null) {
            X();
            og.d dVar = this.f16659i0;
            if (dVar != null) {
                dVar.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.j();
            }
            og.d dVar2 = this.f16660j0;
            if (dVar2 != null) {
                dVar2.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.j();
            }
        }
        d0();
        super.I(canvas, view);
    }

    public final int W(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        int iDp;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f16664o0;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.f16664o0);
                    arrayList3.add(messageObject);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.Y) {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                } else {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, strTranslitSafe, musicTitle) || c0(lowerCase, strTranslitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f16664o0);
                        arrayList3.add(messageObject);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    iDp = 0;
                } else {
                    arrayList.add(n41.B(null));
                    iDp = AndroidUtilities.dp(12.0f);
                }
                this.m0.U();
                arrayList.add(n41.t(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    eg.o oVar = new eg.o(this, 2);
                    int i13 = org.telegram.ui.Cells.d7.f24226a;
                    n41 n41VarJ = n41.J(org.telegram.ui.Cells.d7.class);
                    n41VarJ.G = (MessageObject) obj2;
                    n41VarJ.H = oVar;
                    arrayList.add(n41VarJ);
                    iDp += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(n41.n(4));
                    arrayList.add(n41.n(4));
                    arrayList.add(n41.n(4));
                    iDp += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    n41 n41VarC = n41.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    n41VarC.f30849q = true;
                    arrayList.add(n41VarC);
                    iDp += AndroidUtilities.dp(50.0f);
                }
                this.m0.T();
                return iDp;
            }
        }
        return 0;
    }

    public final void X() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.f16658h0) == null) {
            return;
        }
        this.J0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
        ArrayList arrayList = this.I0;
        ArrayList arrayList2 = this.K0;
        eVar.g(gf.m0.a(arrayList, 1, arrayList2), arrayList2);
        eVar.e(this.f16662l0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
    }

    public final void Y() {
        if (this.D0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.D0, true);
        }
        this.D0 = -1;
        this.f16672w0 = "";
        this.f16673x0 = false;
        this.Z.clear();
        this.f16674y0 = false;
        this.f16675z0 = false;
    }

    public final void Z() {
        if (this.f16670u0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f16670u0, true);
        }
        this.f16670u0 = -1;
        this.f16665p0 = 0;
        this.Y.clear();
        this.f16667r0 = false;
        this.f16668s0 = false;
    }

    public final void a0() {
        String str;
        String str2 = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.E0;
        String str4 = this.f16664o0;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            Y();
        }
        if (this.f16674y0 || TextUtils.isEmpty(this.f16664o0) || this.f16664o0.length() < 3) {
            return;
        }
        ArrayList arrayList = this.Z;
        if (arrayList.isEmpty() || this.f16673x0) {
            if (this.A0 == null) {
                this.A0 = MessagesController.getInstance(this.currentAccount).getUser(str2);
            }
            if (this.A0 == null) {
                if (this.B0 || this.C0) {
                    return;
                }
                this.B0 = true;
                MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new ig.i(this, 6));
                return;
            }
            this.f16674y0 = true;
            TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.A0);
            tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
            if (arrayList.isEmpty() || (str = this.f16672w0) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.f16664o0;
            String str6 = str5 != null ? str5 : "";
            this.E0 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.D0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new org.telegram.messenger.a(), new j7(this, 1));
            this.m0.N(true);
        }
    }

    public final void b0() {
        if (this.V) {
            return;
        }
        String str = this.f16669t0;
        String str2 = this.f16664o0;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            Z();
        }
        if (this.f16667r0) {
            return;
        }
        ArrayList arrayList = this.Y;
        if (arrayList.isEmpty() || this.f16666q0) {
            this.f16667r0 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.f16664o0;
            String str4 = str3 != null ? str3 : "";
            this.f16669t0 = str4;
            tL_messages_searchGlobal.f22491q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                MessageObject messageObject = (MessageObject) i0.a.i(1, arrayList);
                tL_messages_searchGlobal.offset_id = messageObject.getId();
                tL_messages_searchGlobal.offset_rate = this.f16665p0;
                tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.f16670u0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new cf.a(this, 15));
            this.m0.N(true);
        }
    }

    public final void d0() {
        float y10 = AndroidUtilities.displaySize.y;
        int i10 = 0;
        while (true) {
            zk0 zk0Var = this.d;
            if (i10 >= zk0Var.getChildCount()) {
                break;
            }
            View childAt = zk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < y10) {
                y10 = childAt.getY();
            }
            i10++;
        }
        this.f16656f0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, y10));
        this.T.a(y10 <= ((float) (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)), true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.m0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f16663n0 != null && MediaController.getInstance().isPlayingMessage(this.f16663n0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f16663n0 = null;
    }

    @Override
    public final int getObserverTag() {
        return this.U;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            fi fiVar = this.f16657g0;
            fiVar.setAlpha(f10);
            fiVar.setVisibility(f10 > 0.0f ? 0 : 4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final void onSuccessDownload(String str) {
        MessageObject messageObject = this.f16653c0;
        if (messageObject == null || !TextUtils.equals(messageObject.getFileName(), str)) {
            return;
        }
        this.f16652b0.run(this.f16653c0);
        r7 r7Var = this.W;
        if (r7Var != null) {
            r7Var.dismiss();
        }
        dismiss();
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(zk0Var, getContext(), this.currentAccount, 0, false, new j7(this, 0), this.resourcesProvider);
        this.m0 = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void A(float f10, int i10) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
