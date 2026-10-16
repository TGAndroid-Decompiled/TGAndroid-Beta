package di;

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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.ui;
public final class c8 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, ne.d {
    public String A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TLRPC.User E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public String I0;
    public int J0;
    public final u7 K0;
    public boolean L0;
    public final ArrayList M0;
    public final RectF N0;
    public final ArrayList O0;
    public final ne.b X;
    public final int Y;
    public boolean Z;
    public final c8 f6714a0;
    public final ArrayList f6715b0;
    public final ArrayList f6716c0;
    public final ArrayList f6717d0;
    public final MessagesController.SavedMusicList f6718e0;
    public final Utilities.Callback f6719f0;
    public MessageObject f6720g0;
    public boolean f6721h0;
    public boolean f6722i0;
    public final FrameLayout f6723j0;
    public final ui f6724k0;
    public final bh.f f6725l0;
    public final gh.d m0;
    public final gh.d f6726n0;
    public final bh.b f6727o0;
    public final v7 f6728p0;
    public a71 f6729q0;
    public MessageObject f6730r0;
    public String f6731s0;
    public int f6732t0;
    public boolean f6733u0;
    public boolean f6734v0;
    public boolean f6735w0;
    public String f6736x0;
    public int f6737y0;
    public final u7 f6738z0;

    public c8(Context context, boolean z10, c8 c8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        super(2, context, c6Var, true);
        es esVar = es.h;
        this.X = new ne.b(0, this, esVar, 380L, false);
        this.f6715b0 = new ArrayList();
        this.f6716c0 = new ArrayList();
        this.f6717d0 = new ArrayList();
        this.f6737y0 = -1;
        this.f6738z0 = new Runnable(this) {
            public final c8 f7902b;

            {
                this.f7902b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f7902b.c0();
                        return;
                    case 1:
                        this.f7902b.b0();
                        return;
                    default:
                        c8.U(this.f7902b);
                        return;
                }
            }
        };
        this.H0 = -1;
        this.J0 = -2000000000;
        this.K0 = new Runnable(this) {
            public final c8 f7902b;

            {
                this.f7902b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f7902b.c0();
                        return;
                    case 1:
                        this.f7902b.b0();
                        return;
                    default:
                        c8.U(this.f7902b);
                        return;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.M0 = arrayList;
        RectF rectF = new RectF();
        this.N0 = rectF;
        arrayList.add(rectF);
        this.O0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        L();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.f6714a0 = c8Var;
        this.f6719f0 = callback;
        gh.c cVar = new gh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.g6.f19601d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f6725l0 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f6726n0 = dVar;
            dVar.k(new x7(this));
            gh.d dVar2 = new gh.d(null);
            this.m0 = dVar2;
            dVar2.k(new y7(this));
            bh.b bVar = new bh.b(dVar);
            this.f6727o0 = bVar;
            bVar.f2751i = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f6725l0 = null;
            this.m0 = null;
            this.f6726n0 = null;
            this.f6727o0 = new bh.b(cVar);
        }
        this.f6728p0 = new v7(this, 0);
        int i10 = org.telegram.ui.ActionBar.g6.f19543a7;
        ui uiVar = new ui(context, i10, c6Var);
        this.f6724k0 = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6723j0 = frameLayout;
        o20 o20Var = new o20(context, c6Var);
        o20Var.f27510r.setOnFocusChangeListener(new z7(this));
        o20Var.f27512w = true;
        o20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        o20Var.d();
        o20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        o20Var.f27510r.addTextChangedListener(new a8(this));
        o20Var.f27510r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(uiVar, w7.z5.g());
        frameLayout.addView(o20Var, w7.z5.a(48.0f, 0.0f, 8.0f, 0.0f, 4.0f, -1, 51));
        o20Var.setupBlurredBackground(this.f6727o0.c(o20Var, fh.b.n(c6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i10));
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.p1();
        s4.k kVar = new s4.k();
        kVar.f44872m = false;
        kVar.C = false;
        kVar.o(esVar);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        if (!z10) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f6718e0 = savedMusicList;
            savedMusicList.load();
            c0();
            b0();
        } else {
            this.f6718e0 = null;
            if (this.Z && !this.L0) {
                this.L0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final c8 f7902b;

                    {
                        this.f7902b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f7902b.c0();
                                return;
                            case 1:
                                this.f7902b.b0();
                                return;
                            default:
                                c8.U(this.f7902b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new b8(this));
        this.d.setOnItemClickListener(new bi.n0(this, callback, c6Var, 1));
    }

    public static void Q(c8 c8Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = c8Var.f6717d0;
        boolean z10 = false;
        c8Var.C0 = false;
        c8Var.D0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(c8Var.currentAccount).putUsers(messages_botresults.users, false);
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
                        int i11 = c8Var.J0;
                        c8Var.J0 = i11 - 1;
                        tL_message.f18937id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(c8Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            c8Var.A0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(c8Var.A0)) {
                z10 = true;
            }
            c8Var.B0 = z10;
            c8Var.f6729q0.N(true);
            return;
        }
        c8Var.f6729q0.N(true);
    }

    public static void R(c8 c8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.i7) {
            MessageObject message = ((org.telegram.ui.Cells.i7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(c8Var.currentAccount).removeLoadingFileObserver(c8Var);
                if (c8Var.f6720g0 != null) {
                    FileLoader.getInstance(c8Var.currentAccount).cancelLoadFile(c8Var.f6720g0.getDocument());
                    c8Var.f6720g0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        c8Var.f6720g0 = message;
                        DownloadController.getInstance(c8Var.currentAccount).addLoadingFileObserver(fileName, message, c8Var);
                        FileLoader.getInstance(c8Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                c8Var.f6719f0.run(message);
                c8 c8Var2 = c8Var.f6714a0;
                if (c8Var2 != null) {
                    c8Var2.dismiss();
                }
                c8Var.dismiss();
                return;
            }
            return;
        }
        m61 G = c8Var.f6729q0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new c8(c8Var.getContext(), true, c8Var, callback, c6Var).show();
        } else if (G != null && G.d == 2) {
            c8Var.f6718e0.load();
        } else if (G != null && G.d == 3) {
            c8Var.c0();
        } else if (G != null && G.d == 4) {
            c8Var.b0();
        }
    }

    public static void S(c8 c8Var, TLObject tLObject) {
        ArrayList arrayList = c8Var.f6716c0;
        boolean z10 = false;
        c8Var.f6735w0 = false;
        c8Var.f6734v0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(c8Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(c8Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(c8Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            c8Var.f6733u0 = z10;
            c8Var.f6732t0 = messages_messages.next_rate;
        } else {
            c8Var.f6733u0 = false;
            c8Var.f6732t0 = 0;
        }
        c8Var.f6729q0.N(true);
    }

    public static void T(c8 c8Var, Long l4) {
        TLRPC.User user;
        boolean z10 = false;
        c8Var.F0 = false;
        if (l4 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(c8Var.currentAccount).getUser(l4);
        }
        c8Var.E0 = user;
        if (user == null) {
            z10 = true;
        }
        c8Var.G0 = z10;
        if (user != null) {
            c8Var.b0();
        }
    }

    public static void U(c8 c8Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f16393id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f18937id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(c8Var.currentAccount).getClientUserId();
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
                document.f18922id = 0L;
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
                MessageObject messageObject = new MessageObject(c8Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new y6(6, c8Var, arrayList));
    }

    public static boolean d0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !org.telegram.messenger.g0.w(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !org.telegram.messenger.g0.w(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void J(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f6725l0 != null) {
            Y();
            gh.d dVar = this.m0;
            if (dVar != null) {
                dVar.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            gh.d dVar2 = this.f6726n0;
            if (dVar2 != null) {
                dVar2.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        e0();
        super.J(canvas, view);
    }

    public final int X(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        String lowerCase;
        int i11;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f6731s0;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.f6731s0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.f6716c0) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (d0(lowerCase, translitSafe, musicTitle) || d0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f6731s0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(m61.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                } else {
                    i11 = 0;
                }
                this.f6729q0.U();
                arrayList.add(m61.t(str));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    w7 w7Var = new w7(this, 0);
                    int i14 = org.telegram.ui.Cells.h7.f20983a;
                    m61 J = m61.J(org.telegram.ui.Cells.h7.class);
                    J.G = (MessageObject) obj2;
                    J.H = w7Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(m61.n(4));
                    arrayList.add(m61.n(4));
                    arrayList.add(m61.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    m61 c10 = m61.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.f26951q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f6729q0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void Y() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f6725l0) != null) {
            this.N0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.M0;
            ArrayList arrayList2 = this.O0;
            fVar.g(zf.f0.a(arrayList, 1, arrayList2), arrayList2);
            fVar.e(this.f6728p0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void Z() {
        if (this.H0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.H0, true);
        }
        this.H0 = -1;
        this.A0 = "";
        this.B0 = false;
        this.f6717d0.clear();
        this.C0 = false;
        this.D0 = false;
    }

    public final void a0() {
        if (this.f6737y0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f6737y0, true);
        }
        this.f6737y0 = -1;
        this.f6732t0 = 0;
        this.f6716c0.clear();
        this.f6734v0 = false;
        this.f6735w0 = false;
    }

    public final void b0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.I0;
            String str3 = this.f6731s0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Z();
            }
            if (!this.C0 && !TextUtils.isEmpty(this.f6731s0) && this.f6731s0.length() >= 3) {
                ArrayList arrayList = this.f6717d0;
                if (arrayList.isEmpty() || this.B0) {
                    if (this.E0 == null) {
                        this.E0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.E0 == null) {
                        if (!this.F0 && !this.G0) {
                            this.F0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new bi.o1(this, 14));
                            return;
                        }
                        return;
                    }
                    this.C0 = true;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.E0);
                    tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.A0) == null) ? "" : "";
                    String str5 = this.f6731s0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.I0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.H0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new t7(this, 1));
                    this.f6729q0.N(true);
                }
            }
        }
    }

    public final void c0() {
        if (!this.Z) {
            String str = this.f6736x0;
            String str2 = this.f6731s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                a0();
            }
            if (!this.f6734v0) {
                ArrayList arrayList = this.f6716c0;
                if (!arrayList.isEmpty() && !this.f6733u0) {
                    return;
                }
                this.f6734v0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f6731s0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f6736x0 = str3;
                tL_messages_searchGlobal.f19027q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) i2.d.h(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f6732t0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f6737y0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new bi.z7(this, 4));
                this.f6729q0.N(true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f6729q0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f6730r0 != null && MediaController.getInstance().isPlayingMessage(this.f6730r0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f6730r0 = null;
    }

    public final void e0() {
        float f7 = AndroidUtilities.displaySize.y;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            mm0 mm0Var = this.d;
            if (i10 >= mm0Var.getChildCount()) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.f6723j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        if (f7 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.X.a(z10, true);
    }

    @Override
    public final int getObserverTag() {
        return this.Y;
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
        MessageObject messageObject = this.f6720g0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f6719f0.run(this.f6720g0);
            c8 c8Var = this.f6714a0;
            if (c8Var != null) {
                c8Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        if (i10 == 0) {
            ui uiVar = this.f6724k0;
            uiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            uiVar.setVisibility(i11);
        }
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, false, new t7(this, 0), this.resourcesProvider);
        this.f6729q0 = a71Var;
        a71Var.f23145r = false;
        return a71Var;
    }

    @Override
    public final void A(float f7, int i10) {
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
