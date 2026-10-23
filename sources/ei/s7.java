package ei;

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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.si;
public final class s7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, ne.d {
    public final l7 A0;
    public String B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public TLRPC.User F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public String J0;
    public int K0;
    public final l7 L0;
    public boolean M0;
    public final ArrayList N0;
    public final RectF O0;
    public final ArrayList P0;
    public final ne.b X;
    public final int Y;
    public boolean Z;
    public final s7 f9807a0;
    public final ArrayList f9808b0;
    public final ArrayList f9809c0;
    public final ArrayList f9810d0;
    public final MessagesController.SavedMusicList f9811e0;
    public final Utilities.Callback f9812f0;
    public MessageObject f9813g0;
    public boolean f9814h0;
    public boolean f9815i0;
    public final FrameLayout f9816j0;
    public final si f9817k0;
    public final bh.f f9818l0;
    public final gh.d m0;
    public final gh.d f9819n0;
    public final gh.c f9820o0;
    public final bh.b f9821p0;
    public final m7 f9822q0;
    public b71 f9823r0;
    public MessageObject f9824s0;
    public String f9825t0;
    public int f9826u0;
    public boolean f9827v0;
    public boolean f9828w0;
    public boolean f9829x0;
    public String f9830y0;
    public int f9831z0;

    public s7(Context context, boolean z10, s7 s7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var) {
        super(2, context, g6Var, true);
        bs bsVar = bs.h;
        this.X = new ne.b(0, this, bsVar, 380L, false);
        this.f9808b0 = new ArrayList();
        this.f9809c0 = new ArrayList();
        this.f9810d0 = new ArrayList();
        this.f9831z0 = -1;
        this.A0 = new Runnable(this) {
            public final s7 f9392b;

            {
                this.f9392b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9392b.b0();
                        return;
                    case 1:
                        this.f9392b.a0();
                        return;
                    default:
                        s7.T(this.f9392b);
                        return;
                }
            }
        };
        this.I0 = -1;
        this.K0 = -2000000000;
        this.L0 = new Runnable(this) {
            public final s7 f9392b;

            {
                this.f9392b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f9392b.b0();
                        return;
                    case 1:
                        this.f9392b.a0();
                        return;
                    default:
                        s7.T(this.f9392b);
                        return;
                }
            }
        };
        ArrayList arrayList = new ArrayList();
        this.N0 = arrayList;
        RectF rectF = new RectF();
        this.O0 = rectF;
        arrayList.add(rectF);
        this.P0 = new ArrayList();
        this.v = 0.35f;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.f9807a0 = s7Var;
        this.f9812f0 = callback;
        gh.c cVar = new gh.c();
        this.f9820o0 = cVar;
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f9818l0 = new bh.f(false);
            gh.d dVar = new gh.d(null);
            this.f9819n0 = dVar;
            dVar.k(new n7(this));
            gh.d dVar2 = new gh.d(null);
            this.m0 = dVar2;
            dVar2.k(new o7(this));
            bh.b bVar = new bh.b(dVar);
            this.f9821p0 = bVar;
            bVar.f4367i = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f9818l0 = null;
            this.m0 = null;
            this.f9819n0 = null;
            this.f9821p0 = new bh.b(cVar);
        }
        this.f9822q0 = new m7(this, 0);
        int i10 = org.telegram.ui.ActionBar.k6.f21125a7;
        si siVar = new si(context, i10, g6Var);
        this.f9817k0 = siVar;
        siVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9816j0 = frameLayout;
        k20 k20Var = new k20(context, g6Var);
        k20Var.f27836r.setOnFocusChangeListener(new p7(this));
        k20Var.f27838w = true;
        k20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        k20Var.updateColors();
        k20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k20Var.f27836r.addTextChangedListener(new q7(this));
        k20Var.f27836r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(siVar, w7.z5.g());
        frameLayout.addView(k20Var, w7.z5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        k20Var.setupBlurredBackground(this.f9821p0.c(k20Var, fh.c.n(g6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.z5.e(-1, -2, 55));
        setBackgroundColorKey(i10);
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.t1();
        s4.k kVar = new s4.k();
        kVar.f46377m = false;
        kVar.C = false;
        kVar.o(bsVar);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        if (!z10) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f9811e0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        } else {
            this.f9811e0 = null;
            if (this.Z && !this.M0) {
                this.M0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final s7 f9392b;

                    {
                        this.f9392b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f9392b.b0();
                                return;
                            case 1:
                                this.f9392b.a0();
                                return;
                            default:
                                s7.T(this.f9392b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new r7(this));
        this.d.setOnItemClickListener(new ci.g0(this, callback, g6Var, 1));
    }

    public static void P(s7 s7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = s7Var.f9810d0;
        boolean z10 = false;
        s7Var.D0 = false;
        s7Var.E0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(s7Var.currentAccount).putUsers(messages_botresults.users, false);
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
                        int i11 = s7Var.K0;
                        s7Var.K0 = i11 - 1;
                        tL_message.f20364id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(s7Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(s7Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            s7Var.B0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(s7Var.B0)) {
                z10 = true;
            }
            s7Var.C0 = z10;
            s7Var.f9823r0.N(true);
            return;
        }
        s7Var.f9823r0.N(true);
    }

    public static void Q(s7 s7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.g6 g6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.j7) {
            MessageObject message = ((org.telegram.ui.Cells.j7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(s7Var.currentAccount).removeLoadingFileObserver(s7Var);
                if (s7Var.f9813g0 != null) {
                    FileLoader.getInstance(s7Var.currentAccount).cancelLoadFile(s7Var.f9813g0.getDocument());
                    s7Var.f9813g0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        s7Var.f9813g0 = message;
                        DownloadController.getInstance(s7Var.currentAccount).addLoadingFileObserver(fileName, message, s7Var);
                        FileLoader.getInstance(s7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                s7Var.f9812f0.run(message);
                s7 s7Var2 = s7Var.f9807a0;
                if (s7Var2 != null) {
                    s7Var2.dismiss();
                }
                s7Var.dismiss();
                return;
            }
            return;
        }
        m61 G = s7Var.f9823r0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new s7(s7Var.getContext(), true, s7Var, callback, g6Var).show();
        } else if (G != null && G.d == 2) {
            s7Var.f9811e0.load();
        } else if (G != null && G.d == 3) {
            s7Var.b0();
        } else if (G != null && G.d == 4) {
            s7Var.a0();
        }
    }

    public static void R(s7 s7Var, TLObject tLObject) {
        ArrayList arrayList = s7Var.f9809c0;
        boolean z10 = false;
        s7Var.f9829x0 = false;
        s7Var.f9828w0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(s7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(s7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(s7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            s7Var.f9827v0 = z10;
            s7Var.f9826u0 = messages_messages.next_rate;
        } else {
            s7Var.f9827v0 = false;
            s7Var.f9826u0 = 0;
        }
        s7Var.f9823r0.N(true);
    }

    public static void S(s7 s7Var, Long l4) {
        TLRPC.User user;
        boolean z10 = false;
        s7Var.G0 = false;
        if (l4 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(s7Var.currentAccount).getUser(l4);
        }
        s7Var.F0 = user;
        if (user == null) {
            z10 = true;
        }
        s7Var.H0 = z10;
        if (user != null) {
            s7Var.a0();
        }
    }

    public static void T(s7 s7Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f17855id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f20364id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(s7Var.currentAccount).getClientUserId();
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
                document.f20349id = 0L;
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
                MessageObject messageObject = new MessageObject(s7Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new p6(4, s7Var, arrayList));
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !org.telegram.messenger.v0.w(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !org.telegram.messenger.v0.w(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f9818l0 != null) {
            X();
            gh.d dVar = this.m0;
            if (dVar != null) {
                dVar.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            gh.d dVar2 = this.f9819n0;
            if (dVar2 != null) {
                dVar2.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        d0();
        super.I(canvas, view);
    }

    public final int W(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        String lowerCase;
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f9825t0;
            if (str2 == null) {
                lowerCase = null;
            } else {
                lowerCase = str2.toLowerCase();
            }
            String translitSafe = AndroidUtilities.translitSafe(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                if (!z10) {
                    messageObject.setQuery(this.f9825t0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.f9809c0) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f9825t0);
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
                this.f9823r0.U();
                arrayList.add(m61.t(str));
                int size2 = arrayList3.size();
                while (i12 < size2) {
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    ai.kc kcVar = new ai.kc(this, 1);
                    int i14 = org.telegram.ui.Cells.i7.f22539a;
                    m61 J = m61.J(org.telegram.ui.Cells.i7.class);
                    J.G = (MessageObject) obj2;
                    J.H = kcVar;
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
                    c10.f28564q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f9823r0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.f9818l0) != null) {
            this.O0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.N0;
            ArrayList arrayList2 = this.P0;
            fVar.g(zf.f0.a(arrayList, 1, arrayList2), arrayList2);
            fVar.e(this.f9822q0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void Y() {
        if (this.I0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.I0, true);
        }
        this.I0 = -1;
        this.B0 = "";
        this.C0 = false;
        this.f9810d0.clear();
        this.D0 = false;
        this.E0 = false;
    }

    public final void Z() {
        if (this.f9831z0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f9831z0, true);
        }
        this.f9831z0 = -1;
        this.f9826u0 = 0;
        this.f9809c0.clear();
        this.f9828w0 = false;
        this.f9829x0 = false;
    }

    public final void a0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.J0;
            String str3 = this.f9825t0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Y();
            }
            if (!this.D0 && !TextUtils.isEmpty(this.f9825t0) && this.f9825t0.length() >= 3) {
                ArrayList arrayList = this.f9810d0;
                if (arrayList.isEmpty() || this.C0) {
                    if (this.F0 == null) {
                        this.F0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.F0 == null) {
                        if (!this.G0 && !this.H0) {
                            this.G0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new ai.r0(this, 20));
                            return;
                        }
                        return;
                    }
                    this.D0 = true;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.F0);
                    tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.B0) == null) ? "" : "";
                    String str5 = this.f9825t0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.J0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.I0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new k7(this, 1));
                    this.f9823r0.N(true);
                }
            }
        }
    }

    public final void b0() {
        if (!this.Z) {
            String str = this.f9830y0;
            String str2 = this.f9825t0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Z();
            }
            if (!this.f9828w0) {
                ArrayList arrayList = this.f9809c0;
                if (!arrayList.isEmpty() && !this.f9827v0) {
                    return;
                }
                this.f9828w0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f9825t0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f9830y0 = str3;
                tL_messages_searchGlobal.f20454q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f9826u0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f9831z0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new ai.h(this, 10));
                this.f9823r0.N(true);
            }
        }
    }

    public final void d0() {
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
        this.f9816j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        if (f7 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.X.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f9823r0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f9824s0 != null && MediaController.getInstance().isPlayingMessage(this.f9824s0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f9824s0 = null;
    }

    @Override
    public final int getObserverTag() {
        return this.Y;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        int i11;
        if (i10 == 0) {
            si siVar = this.f9817k0;
            siVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            siVar.setVisibility(i11);
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
        MessageObject messageObject = this.f9813g0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f9812f0.run(this.f9813g0);
            s7 s7Var = this.f9807a0;
            if (s7Var != null) {
                s7Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            gh.c cVar = this.f9820o0;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        b71 b71Var = new b71(mm0Var, getContext(), this.currentAccount, 0, false, new k7(this, 0), this.resourcesProvider);
        this.f9823r0 = b71Var;
        b71Var.f24972r = false;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void H(float f7, int i10) {
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
