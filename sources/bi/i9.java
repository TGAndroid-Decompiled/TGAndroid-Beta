package bi;

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
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xi;
public final class i9 extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, le.d {
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
    public final z8 K0;
    public boolean L0;
    public final ArrayList M0;
    public final RectF N0;
    public final ArrayList O0;
    public final le.b X;
    public final int Y;
    public boolean Z;
    public final i9 f2862a0;
    public final ArrayList f2863b0;
    public final ArrayList f2864c0;
    public final ArrayList f2865d0;
    public final MessagesController.SavedMusicList f2866e0;
    public final Utilities.Callback f2867f0;
    public MessageObject f2868g0;
    public boolean f2869h0;
    public boolean f2870i0;
    public final FrameLayout f2871j0;
    public final xi f2872k0;
    public final zg.e f2873l0;
    public final eh.d m0;
    public final eh.d f2874n0;
    public final zg.a f2875o0;
    public final a9 f2876p0;
    public j61 f2877q0;
    public MessageObject f2878r0;
    public String f2879s0;
    public int f2880t0;
    public boolean f2881u0;
    public boolean f2882v0;
    public boolean f2883w0;
    public String f2884x0;
    public int f2885y0;
    public final z8 f2886z0;

    public i9(Context context, boolean z10, i9 i9Var, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        super(2, context, f6Var, true);
        wr wrVar = wr.h;
        this.X = new le.b(0, this, wrVar, 380L, false);
        this.f2863b0 = new ArrayList();
        this.f2864c0 = new ArrayList();
        this.f2865d0 = new ArrayList();
        this.f2885y0 = -1;
        this.f2886z0 = new Runnable(this) {
            public final i9 f4012b;

            {
                this.f4012b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f4012b.b0();
                        return;
                    case 1:
                        this.f4012b.a0();
                        return;
                    default:
                        i9.T(this.f4012b);
                        return;
                }
            }
        };
        this.H0 = -1;
        this.J0 = -2000000000;
        this.K0 = new Runnable(this) {
            public final i9 f4012b;

            {
                this.f4012b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f4012b.b0();
                        return;
                    case 1:
                        this.f4012b.a0();
                        return;
                    default:
                        i9.T(this.f4012b);
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
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-20.0f);
        this.Z = z10;
        this.Y = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.f2862a0 = i9Var;
        this.f2867f0 = callback;
        eh.c cVar = new eh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f2873l0 = new zg.e(false);
            eh.d dVar = new eh.d(null);
            this.f2874n0 = dVar;
            dVar.j(new d9(this));
            eh.d dVar2 = new eh.d(null);
            this.m0 = dVar2;
            dVar2.j(new e9(this));
            zg.a aVar = new zg.a(dVar);
            this.f2875o0 = aVar;
            aVar.f48083f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f2873l0 = null;
            this.m0 = null;
            this.f2874n0 = null;
            this.f2875o0 = new zg.a(cVar);
        }
        this.f2876p0 = new a9(this, 0);
        int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        xi xiVar = new xi(context, i10, f6Var);
        this.f2872k0 = xiVar;
        xiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2871j0 = frameLayout;
        k20 k20Var = new k20(context, f6Var);
        k20Var.f24572r.setOnFocusChangeListener(new f9(this));
        k20Var.f24574w = true;
        k20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        k20Var.e();
        k20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        k20Var.f24572r.addTextChangedListener(new g9(this));
        k20Var.f24572r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(xiVar, w7.a6.g());
        frameLayout.addView(k20Var, w7.a6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        k20Var.setupBlurredBackground(this.f2875o0.c(k20Var, dh.c.n(f6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.a6.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i10));
        vl0 vl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i11, 0, i11, 0);
        this.d.o1();
        s4.j jVar = new s4.j();
        jVar.f41645m = false;
        jVar.C = false;
        jVar.o(wrVar);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        if (!z10) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f2866e0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        } else {
            this.f2866e0 = null;
            if (this.Z && !this.L0) {
                this.L0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final i9 f4012b;

                    {
                        this.f4012b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f4012b.b0();
                                return;
                            case 1:
                                this.f4012b.a0();
                                return;
                            default:
                                i9.T(this.f4012b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new h9(this));
        this.d.setOnItemClickListener(new b9(this, callback, f6Var, 0));
    }

    public static void P(i9 i9Var, Long l4) {
        TLRPC.User user;
        boolean z10 = false;
        i9Var.F0 = false;
        if (l4 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(i9Var.currentAccount).getUser(l4);
        }
        i9Var.E0 = user;
        if (user == null) {
            z10 = true;
        }
        i9Var.G0 = z10;
        if (user != null) {
            i9Var.a0();
        }
    }

    public static void Q(i9 i9Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = i9Var.f2865d0;
        boolean z10 = false;
        i9Var.C0 = false;
        i9Var.D0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(i9Var.currentAccount).putUsers(messages_botresults.users, false);
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
                        int i11 = i9Var.J0;
                        i9Var.J0 = i11 - 1;
                        tL_message.f17216id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(i9Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(i9Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            i9Var.A0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(i9Var.A0)) {
                z10 = true;
            }
            i9Var.B0 = z10;
            i9Var.f2877q0.N(true);
            return;
        }
        i9Var.f2877q0.N(true);
    }

    public static void R(i9 i9Var, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.k7) {
            MessageObject message = ((org.telegram.ui.Cells.k7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(i9Var.currentAccount).removeLoadingFileObserver(i9Var);
                if (i9Var.f2868g0 != null) {
                    FileLoader.getInstance(i9Var.currentAccount).cancelLoadFile(i9Var.f2868g0.getDocument());
                    i9Var.f2868g0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        i9Var.f2868g0 = message;
                        DownloadController.getInstance(i9Var.currentAccount).addLoadingFileObserver(fileName, message, i9Var);
                        FileLoader.getInstance(i9Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                i9Var.f2867f0.run(message);
                i9 i9Var2 = i9Var.f2862a0;
                if (i9Var2 != null) {
                    i9Var2.dismiss();
                }
                i9Var.dismiss();
                return;
            }
            return;
        }
        v51 G = i9Var.f2877q0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new i9(i9Var.getContext(), true, i9Var, callback, f6Var).show();
        } else if (G != null && G.d == 2) {
            i9Var.f2866e0.load();
        } else if (G != null && G.d == 3) {
            i9Var.b0();
        } else if (G != null && G.d == 4) {
            i9Var.a0();
        }
    }

    public static void S(i9 i9Var, TLObject tLObject) {
        ArrayList arrayList = i9Var.f2864c0;
        boolean z10 = false;
        i9Var.f2883w0 = false;
        i9Var.f2882v0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(i9Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(i9Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(i9Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            i9Var.f2881u0 = z10;
            i9Var.f2880t0 = messages_messages.next_rate;
        } else {
            i9Var.f2881u0 = false;
            i9Var.f2880t0 = 0;
        }
        i9Var.f2877q0.N(true);
    }

    public static void T(i9 i9Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f14638id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f17216id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(i9Var.currentAccount).getClientUserId();
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
                document.f17201id = 0L;
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
                MessageObject messageObject = new MessageObject(i9Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new a1.e(21, i9Var, arrayList));
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !org.telegram.messenger.a2.w(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !org.telegram.messenger.a2.w(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            xi xiVar = this.f2872k0;
            xiVar.setAlpha(f7);
            if (f7 > 0.0f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            xiVar.setVisibility(i11);
        }
    }

    @Override
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f2873l0 != null) {
            X();
            eh.d dVar = this.m0;
            if (dVar != null) {
                dVar.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            eh.d dVar2 = this.f2874n0;
            if (dVar2 != null) {
                dVar2.i(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.l();
            }
        }
        d0();
        super.I(canvas, view);
    }

    public final int W(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        String lowerCase;
        int i11;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f2879s0;
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
                    messageObject.setQuery(this.f2879s0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.f2864c0) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f2879s0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(v51.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                } else {
                    i11 = 0;
                }
                this.f2877q0.U();
                arrayList.add(v51.t(str));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    c9 c9Var = new c9(this, 0);
                    int i14 = org.telegram.ui.Cells.j7.f19389a;
                    v51 J = v51.J(org.telegram.ui.Cells.j7.class);
                    J.G = (MessageObject) obj2;
                    J.H = c9Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(v51.n(4));
                    arrayList.add(v51.n(4));
                    arrayList.add(v51.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    v51 c10 = v51.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.f27834q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f2877q0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        zg.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f2873l0) != null) {
            this.N0.set(0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.M0;
            ArrayList arrayList2 = this.O0;
            eVar.g(xf.f0.a(1, arrayList, arrayList2), arrayList2);
            eVar.e(this.f2876p0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void Y() {
        if (this.H0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.H0, true);
        }
        this.H0 = -1;
        this.A0 = "";
        this.B0 = false;
        this.f2865d0.clear();
        this.C0 = false;
        this.D0 = false;
    }

    public final void Z() {
        if (this.f2885y0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f2885y0, true);
        }
        this.f2885y0 = -1;
        this.f2880t0 = 0;
        this.f2864c0.clear();
        this.f2882v0 = false;
        this.f2883w0 = false;
    }

    public final void a0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.I0;
            String str3 = this.f2879s0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Y();
            }
            if (!this.C0 && !TextUtils.isEmpty(this.f2879s0) && this.f2879s0.length() >= 3) {
                ArrayList arrayList = this.f2865d0;
                if (arrayList.isEmpty() || this.B0) {
                    if (this.E0 == null) {
                        this.E0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.E0 == null) {
                        if (!this.F0 && !this.G0) {
                            this.F0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new i5(this, 2));
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
                    String str5 = this.f2879s0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.I0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.H0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new y8(this, 1));
                    this.f2877q0.N(true);
                }
            }
        }
    }

    public final void b0() {
        if (!this.Z) {
            String str = this.f2884x0;
            String str2 = this.f2879s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Z();
            }
            if (!this.f2882v0) {
                ArrayList arrayList = this.f2864c0;
                if (!arrayList.isEmpty() && !this.f2881u0) {
                    return;
                }
                this.f2882v0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f2879s0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f2884x0 = str3;
                tL_messages_searchGlobal.f17306q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) hc.b.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f2880t0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f2885y0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new c2(this, 1));
                this.f2877q0.N(true);
            }
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            vl0 vl0Var = this.d;
            if (i10 >= vl0Var.getChildCount()) {
                break;
            }
            View childAt = vl0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.f2871j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        if (f7 <= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.X.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f2877q0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f2878r0 != null && MediaController.getInstance().isPlayingMessage(this.f2878r0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f2878r0 = null;
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
        MessageObject messageObject = this.f2868g0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f2867f0.run(this.f2868g0);
            i9 i9Var = this.f2862a0;
            if (i9Var != null) {
                i9Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, false, new y8(this, 0), this.resourcesProvider);
        this.f2877q0 = j61Var;
        j61Var.f24250r = false;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void B(float f7, int i10) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
