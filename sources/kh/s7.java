package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class s7 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, td.b {
    public TLRPC.User A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public String E0;
    public int F0;
    public final m7 G0;
    public boolean H0;
    public final ArrayList I0;
    public final RectF J0;
    public final ArrayList K0;
    public final td.a T;
    public final int U;
    public boolean V;
    public final s7 W;
    public final ArrayList X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final MessagesController.SavedMusicList f16033a0;
    public final Utilities.Callback f16034b0;
    public MessageObject f16035c0;
    public boolean f16036d0;
    public boolean f16037e0;
    public final FrameLayout f16038f0;
    public final ji f16039g0;
    public final ig.e f16040h0;
    public final ng.d f16041i0;
    public final ng.d f16042j0;
    public final ig.a f16043k0;
    public final fh.x2 f16044l0;
    public z41 m0;
    public MessageObject f16045n0;
    public String f16046o0;
    public int f16047p0;
    public boolean f16048q0;
    public boolean f16049r0;
    public boolean f16050s0;
    public String f16051t0;
    public int f16052u0;
    public final m7 f16053v0;
    public String f16054w0;
    public boolean f16055x0;
    public boolean f16056y0;
    public boolean f16057z0;

    public s7(Context context, boolean z10, s7 s7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, true, false, false, 2, b6Var);
        gr grVar = gr.h;
        this.T = new td.a(0, this, grVar, 380L, false);
        this.X = new ArrayList();
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.f16052u0 = -1;
        this.f16053v0 = new Runnable(this) {
            public final s7 f15706b;

            {
                this.f15706b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15706b.a0();
                        return;
                    case 1:
                        this.f15706b.Z();
                        return;
                    default:
                        s7.R(this.f15706b);
                        return;
                }
            }
        };
        this.D0 = -1;
        this.F0 = -2000000000;
        this.G0 = new Runnable(this) {
            public final s7 f15706b;

            {
                this.f15706b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f15706b.a0();
                        return;
                    case 1:
                        this.f15706b.Z();
                        return;
                    default:
                        s7.R(this.f15706b);
                        return;
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
        J();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-20.0f);
        this.V = z10;
        this.U = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        this.W = s7Var;
        this.f16034b0 = callback;
        ng.c cVar = new ng.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f16040h0 = new ig.e(false);
            ng.d dVar = new ng.d(null);
            this.f16042j0 = dVar;
            dVar.i(new n7(this));
            ng.d dVar2 = new ng.d(null);
            this.f16041i0 = dVar2;
            dVar2.i(new o7(this));
            ig.a aVar = new ig.a(dVar);
            this.f16043k0 = aVar;
            aVar.f11132f = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f16040h0 = null;
            this.f16041i0 = null;
            this.f16042j0 = null;
            this.f16043k0 = new ig.a(cVar);
        }
        this.f16044l0 = new fh.x2(this, 1);
        int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
        ji jiVar = new ji(context, i9, b6Var);
        this.f16039g0 = jiVar;
        jiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f16038f0 = frameLayout;
        m10 m10Var = new m10(context, b6Var);
        m10Var.f30664r.setOnFocusChangeListener(new p7(this));
        m10Var.f30666w = true;
        m10Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        m10Var.d();
        m10Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        m10Var.f30664r.addTextChangedListener(new q7(this));
        m10Var.f30664r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(jiVar, g7.e6.g());
        frameLayout.addView(m10Var, g7.e6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        m10Var.setupBlurredBackground(this.f16043k0.c(m10Var, mg.c.m(b6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, g7.e6.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i9));
        wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, 0);
        this.d.p1();
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(grVar);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        if (!z10) {
            int i11 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i11, UserConfig.getInstance(i11).getClientUserId());
            this.f16033a0 = savedMusicList;
            savedMusicList.load();
            a0();
            Z();
        } else {
            this.f16033a0 = null;
            if (this.V && !this.H0) {
                this.H0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final s7 f15706b;

                    {
                        this.f15706b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f15706b.a0();
                                return;
                            case 1:
                                this.f15706b.Z();
                                return;
                            default:
                                s7.R(this.f15706b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new r7(this));
        this.d.setOnItemClickListener(new ih.f0(this, callback, b6Var, 1));
    }

    public static void O(s7 s7Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = s7Var.Z;
        boolean z10 = false;
        s7Var.f16056y0 = false;
        s7Var.f16057z0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(s7Var.currentAccount).putUsers(messages_botresults.users, false);
            ArrayList<TLRPC.BotInlineResult> arrayList2 = messages_botresults.results;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                TLRPC.BotInlineResult botInlineResult = arrayList2.get(i9);
                i9++;
                TLRPC.BotInlineResult botInlineResult2 = botInlineResult;
                if (botInlineResult2 instanceof TLRPC.TL_botInlineMediaResult) {
                    TLRPC.TL_botInlineMediaResult tL_botInlineMediaResult = (TLRPC.TL_botInlineMediaResult) botInlineResult2;
                    if (tL_botInlineMediaResult.document != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.out = true;
                        int i10 = s7Var.F0;
                        s7Var.F0 = i10 - 1;
                        tL_message.f22401id = i10;
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
            s7Var.f16054w0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(s7Var.f16054w0)) {
                z10 = true;
            }
            s7Var.f16055x0 = z10;
            s7Var.m0.N(true);
            return;
        }
        s7Var.m0.N(true);
    }

    public static void P(s7 s7Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var, View view, int i9) {
        if (view instanceof org.telegram.ui.Cells.h7) {
            MessageObject message = ((org.telegram.ui.Cells.h7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(s7Var.currentAccount).removeLoadingFileObserver(s7Var);
                if (s7Var.f16035c0 != null) {
                    FileLoader.getInstance(s7Var.currentAccount).cancelLoadFile(s7Var.f16035c0.getDocument());
                    s7Var.f16035c0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        s7Var.f16035c0 = message;
                        DownloadController.getInstance(s7Var.currentAccount).addLoadingFileObserver(fileName, message, s7Var);
                        FileLoader.getInstance(s7Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                s7Var.f16034b0.run(message);
                s7 s7Var2 = s7Var.W;
                if (s7Var2 != null) {
                    s7Var2.dismiss();
                }
                s7Var.dismiss();
                return;
            }
            return;
        }
        l41 G = s7Var.m0.G(i9 - 1);
        if (G != null && G.d == 1) {
            new s7(s7Var.getContext(), true, s7Var, callback, b6Var).show();
        } else if (G != null && G.d == 2) {
            s7Var.f16033a0.load();
        } else if (G != null && G.d == 3) {
            s7Var.a0();
        } else if (G != null && G.d == 4) {
            s7Var.Z();
        }
    }

    public static void Q(s7 s7Var, TLObject tLObject) {
        ArrayList arrayList = s7Var.Y;
        boolean z10 = false;
        s7Var.f16050s0 = false;
        s7Var.f16049r0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(s7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(s7Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                TLRPC.Message message = arrayList2.get(i9);
                i9++;
                arrayList.add(new MessageObject(s7Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            s7Var.f16048q0 = z10;
            s7Var.f16047p0 = messages_messages.next_rate;
        } else {
            s7Var.f16048q0 = false;
            s7Var.f16047p0 = 0;
        }
        s7Var.m0.N(true);
    }

    public static void R(s7 s7Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i9 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f19642id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f22401id = i9;
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
                MessageObject messageObject = new MessageObject(s7Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i9--;
            }
            query.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AndroidUtilities.runOnUIThread(new ih.j7(23, s7Var, arrayList));
    }

    public static void S(s7 s7Var, Long l10) {
        TLRPC.User user;
        boolean z10 = false;
        s7Var.B0 = false;
        if (l10 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(s7Var.currentAccount).getUser(l10);
        }
        s7Var.A0 = user;
        if (user == null) {
            z10 = true;
        }
        s7Var.C0 = z10;
        if (user != null) {
            s7Var.Z();
        }
    }

    public static boolean b0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !org.telegram.messenger.l0.w(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !org.telegram.messenger.l0.w(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void H(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f16040h0 != null) {
            W();
            ng.d dVar = this.f16041i0;
            if (dVar != null) {
                dVar.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.j();
            }
            ng.d dVar2 = this.f16042j0;
            if (dVar2 != null) {
                dVar2.h(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar2.j();
            }
        }
        c0();
        super.H(canvas, view);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        int i10;
        if (i9 == 0) {
            ji jiVar = this.f16039g0;
            jiVar.setAlpha(f10);
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jiVar.setVisibility(i10);
        }
    }

    public final int V(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i9) {
        String lowerCase;
        int i10;
        int i11 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f16046o0;
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
                    messageObject.setQuery(this.f16046o0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.Y) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (b0(lowerCase, translitSafe, musicTitle) || b0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f16046o0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(l41.B(null));
                    i10 = AndroidUtilities.dp(12.0f);
                } else {
                    i10 = 0;
                }
                this.m0.U();
                arrayList.add(l41.t(str));
                int size2 = arrayList3.size();
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    dg.o oVar = new dg.o(this, 2);
                    int i13 = org.telegram.ui.Cells.g7.f24403a;
                    l41 J = l41.J(org.telegram.ui.Cells.g7.class);
                    J.G = (MessageObject) obj2;
                    J.H = oVar;
                    arrayList.add(J);
                    i10 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(l41.n(4));
                    arrayList.add(l41.n(4));
                    arrayList.add(l41.n(4));
                    i10 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    l41 c10 = l41.c(i9, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.f30344q = true;
                    arrayList.add(c10);
                    i10 += AndroidUtilities.dp(50.0f);
                }
                this.m0.T();
                return i10;
            }
        }
        return 0;
    }

    public final void W() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.f16040h0) != null) {
            this.J0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.I0;
            ArrayList arrayList2 = this.K0;
            eVar.g(ff.m0.a(arrayList, 1, arrayList2), arrayList2);
            eVar.e(this.f16044l0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void X() {
        if (this.D0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.D0, true);
        }
        this.D0 = -1;
        this.f16054w0 = "";
        this.f16055x0 = false;
        this.Z.clear();
        this.f16056y0 = false;
        this.f16057z0 = false;
    }

    public final void Y() {
        if (this.f16052u0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f16052u0, true);
        }
        this.f16052u0 = -1;
        this.f16047p0 = 0;
        this.Y.clear();
        this.f16049r0 = false;
        this.f16050s0 = false;
    }

    public final void Z() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.E0;
            String str3 = this.f16046o0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                X();
            }
            if (!this.f16056y0 && !TextUtils.isEmpty(this.f16046o0) && this.f16046o0.length() >= 3) {
                ArrayList arrayList = this.Z;
                if (arrayList.isEmpty() || this.f16055x0) {
                    if (this.A0 == null) {
                        this.A0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.A0 == null) {
                        if (!this.B0 && !this.C0) {
                            this.B0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new hg.i(this, 6));
                            return;
                        }
                        return;
                    }
                    this.f16056y0 = true;
                    TLRPC.User currentUser = UserConfig.getInstance(this.currentAccount).getCurrentUser();
                    TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                    tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.A0);
                    tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
                    tL_messages_getInlineBotResults.offset = (arrayList.isEmpty() || (r0 = this.f16054w0) == null) ? "" : "";
                    String str5 = this.f16046o0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.E0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.D0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new l7(this, 1));
                    this.m0.N(true);
                }
            }
        }
    }

    public final void a0() {
        if (!this.V) {
            String str = this.f16051t0;
            String str2 = this.f16046o0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Y();
            }
            if (!this.f16049r0) {
                ArrayList arrayList = this.Y;
                if (!arrayList.isEmpty() && !this.f16048q0) {
                    return;
                }
                this.f16049r0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f16046o0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f16051t0 = str3;
                tL_messages_searchGlobal.f22491q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f16047p0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f16052u0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new bf.a(this, 15));
                this.m0.N(true);
            }
        }
    }

    public final void c0() {
        float f10 = AndroidUtilities.displaySize.y;
        boolean z10 = false;
        int i9 = 0;
        while (true) {
            wk0 wk0Var = this.d;
            if (i9 >= wk0Var.getChildCount()) {
                break;
            }
            View childAt = wk0Var.getChildAt(i9);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f10) {
                f10 = childAt.getY();
            }
            i9++;
        }
        this.f16038f0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f10));
        if (f10 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.T.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.musicListLoaded) {
            this.m0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f16045n0 != null && MediaController.getInstance().isPlayingMessage(this.f16045n0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f16045n0 = null;
    }

    @Override
    public final int getObserverTag() {
        return this.U;
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
        MessageObject messageObject = this.f16035c0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f16034b0.run(this.f16035c0);
            s7 s7Var = this.W;
            if (s7Var != null) {
                s7Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, false, new l7(this, 0), this.resourcesProvider);
        this.m0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void B(float f10, int i9) {
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
