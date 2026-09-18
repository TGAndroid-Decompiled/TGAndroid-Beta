package ci;

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
import org.telegram.messenger.wh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class g8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate, DownloadController.FileDownloadProgressListener, le.d {
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
    public final y7 K0;
    public boolean L0;
    public final ArrayList M0;
    public final RectF N0;
    public final ArrayList O0;
    public final le.b X;
    public final int Y;
    public boolean Z;
    public final g8 f4699a0;
    public final ArrayList f4700b0;
    public final ArrayList f4701c0;
    public final ArrayList f4702d0;
    public final MessagesController.SavedMusicList f4703e0;
    public final Utilities.Callback f4704f0;
    public MessageObject f4705g0;
    public boolean f4706h0;
    public boolean f4707i0;
    public final FrameLayout f4708j0;
    public final ui f4709k0;
    public final ah.i f4710l0;
    public final fh.d m0;
    public final fh.d f4711n0;
    public final ah.c f4712o0;
    public final z7 f4713p0;
    public l61 f4714q0;
    public MessageObject f4715r0;
    public String f4716s0;
    public int f4717t0;
    public boolean f4718u0;
    public boolean f4719v0;
    public boolean f4720w0;
    public String f4721x0;
    public int f4722y0;
    public final y7 f4723z0;

    public g8(Context context, boolean z10, g8 g8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2, context, e6Var, true);
        qr qrVar = qr.h;
        this.X = new le.b(0, this, qrVar, 380L, false);
        this.f4700b0 = new ArrayList();
        this.f4701c0 = new ArrayList();
        this.f4702d0 = new ArrayList();
        this.f4722y0 = -1;
        this.f4723z0 = new Runnable(this) {
            public final g8 f5836b;

            {
                this.f5836b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5836b.b0();
                        return;
                    case 1:
                        this.f5836b.a0();
                        return;
                    default:
                        g8.T(this.f5836b);
                        return;
                }
            }
        };
        this.H0 = -1;
        this.J0 = -2000000000;
        this.K0 = new Runnable(this) {
            public final g8 f5836b;

            {
                this.f5836b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        this.f5836b.b0();
                        return;
                    case 1:
                        this.f5836b.a0();
                        return;
                    default:
                        g8.T(this.f5836b);
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
        this.f4699a0 = g8Var;
        this.f4704f0 = callback;
        fh.c cVar = new fh.c();
        cVar.a(getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
        if (Build.VERSION.SDK_INT >= 31) {
            this.f4710l0 = new ah.i(false);
            fh.d dVar = new fh.d(null);
            this.f4711n0 = dVar;
            dVar.k(new b8(this));
            fh.d dVar2 = new fh.d(null);
            this.m0 = dVar2;
            dVar2.k(new c8(this));
            ah.c cVar2 = new ah.c(dVar);
            this.f4712o0 = cVar2;
            cVar2.f427i = LiteMode.isEnabled(262144);
            LiteMode.isEnabled(262144);
        } else {
            this.f4710l0 = null;
            this.m0 = null;
            this.f4711n0 = null;
            this.f4712o0 = new ah.c(cVar);
        }
        this.f4713p0 = new z7(this, 0);
        int i10 = org.telegram.ui.ActionBar.j6.f19006a7;
        ui uiVar = new ui(context, i10, e6Var);
        this.f4709k0 = uiVar;
        uiVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4708j0 = frameLayout;
        b20 b20Var = new b20(context, e6Var);
        b20Var.f22787r.setOnFocusChangeListener(new d8(this));
        b20Var.f22789w = true;
        b20Var.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        b20Var.e();
        b20Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        b20Var.f22787r.addTextChangedListener(new e8(this));
        b20Var.f22787r.setHint(LocaleController.getString(R.string.Search));
        frameLayout.addView(uiVar, w7.y5.g());
        frameLayout.addView(b20Var, w7.y5.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        b20Var.setupBlurredBackground(this.f4712o0.c(b20Var, eh.b.o(e6Var), false));
        frameLayout.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
        this.containerView.addView(frameLayout, w7.y5.e(-1, -2, 55));
        setBackgroundColor(getThemedColor(i10));
        wl0 wl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i11, 0, i11, 0);
        this.d.q1();
        s4.j jVar = new s4.j();
        jVar.f42964m = false;
        jVar.C = false;
        jVar.o(qrVar);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        if (!z10) {
            int i12 = this.currentAccount;
            MessagesController.SavedMusicList savedMusicList = new MessagesController.SavedMusicList(i12, UserConfig.getInstance(i12).getClientUserId());
            this.f4703e0 = savedMusicList;
            savedMusicList.load();
            b0();
            a0();
        } else {
            this.f4703e0 = null;
            if (this.Z && !this.L0) {
                this.L0 = true;
                Utilities.globalQueue.postRunnable(new Runnable(this) {
                    public final g8 f5836b;

                    {
                        this.f5836b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                this.f5836b.b0();
                                return;
                            case 1:
                                this.f5836b.a0();
                                return;
                            default:
                                g8.T(this.f5836b);
                                return;
                        }
                    }
                });
            }
        }
        this.d.setOnScrollListener(new f8(this));
        this.d.setOnItemClickListener(new ai.u0(this, callback, e6Var, 1));
    }

    public static void P(g8 g8Var, Long l4) {
        TLRPC.User user;
        boolean z10 = false;
        g8Var.F0 = false;
        if (l4 == null) {
            user = null;
        } else {
            user = MessagesController.getInstance(g8Var.currentAccount).getUser(l4);
        }
        g8Var.E0 = user;
        if (user == null) {
            z10 = true;
        }
        g8Var.G0 = z10;
        if (user != null) {
            g8Var.a0();
        }
    }

    public static void Q(g8 g8Var, TLRPC.messages_BotResults messages_botresults) {
        ArrayList arrayList = g8Var.f4702d0;
        boolean z10 = false;
        g8Var.C0 = false;
        g8Var.D0 = false;
        if (messages_botresults != null) {
            MessagesController.getInstance(g8Var.currentAccount).putUsers(messages_botresults.users, false);
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
                        int i11 = g8Var.J0;
                        g8Var.J0 = i11 - 1;
                        tL_message.f18317id = i11;
                        tL_message.peer_id = new TLRPC.TL_peerUser();
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        tL_message.from_id = tL_peerUser;
                        TLRPC.Peer peer = tL_message.peer_id;
                        long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
                        tL_peerUser.user_id = clientUserId;
                        peer.user_id = clientUserId;
                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                        tL_message.message = "";
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = tL_botInlineMediaResult.document;
                        tL_message.flags |= 768;
                        arrayList.add(new MessageObject(g8Var.currentAccount, tL_message, false, true));
                    }
                }
            }
            g8Var.A0 = messages_botresults.next_offset;
            if (!arrayList.isEmpty() && !TextUtils.isEmpty(g8Var.A0)) {
                z10 = true;
            }
            g8Var.B0 = z10;
            g8Var.f4714q0.N(true);
            return;
        }
        g8Var.f4714q0.N(true);
    }

    public static void R(g8 g8Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e6 e6Var, View view, int i10) {
        if (view instanceof org.telegram.ui.Cells.j7) {
            MessageObject message = ((org.telegram.ui.Cells.j7) view).getMessage();
            if (message != null) {
                DownloadController.getInstance(g8Var.currentAccount).removeLoadingFileObserver(g8Var);
                if (g8Var.f4705g0 != null) {
                    FileLoader.getInstance(g8Var.currentAccount).cancelLoadFile(g8Var.f4705g0.getDocument());
                    g8Var.f4705g0 = null;
                }
                if (!message.attachPathExists && !message.mediaExists) {
                    String fileName = message.getFileName();
                    if (!TextUtils.isEmpty(fileName)) {
                        g8Var.f4705g0 = message;
                        DownloadController.getInstance(g8Var.currentAccount).addLoadingFileObserver(fileName, message, g8Var);
                        FileLoader.getInstance(g8Var.currentAccount).loadFile(message.getDocument(), message, 1, 0);
                        return;
                    }
                    return;
                }
                g8Var.f4704f0.run(message);
                g8 g8Var2 = g8Var.f4699a0;
                if (g8Var2 != null) {
                    g8Var2.dismiss();
                }
                g8Var.dismiss();
                return;
            }
            return;
        }
        x51 G = g8Var.f4714q0.G(i10 - 1);
        if (G != null && G.d == 1) {
            new g8(g8Var.getContext(), true, g8Var, callback, e6Var).show();
        } else if (G != null && G.d == 2) {
            g8Var.f4703e0.load();
        } else if (G != null && G.d == 3) {
            g8Var.b0();
        } else if (G != null && G.d == 4) {
            g8Var.a0();
        }
    }

    public static void S(g8 g8Var, TLObject tLObject) {
        ArrayList arrayList = g8Var.f4701c0;
        boolean z10 = false;
        g8Var.f4720w0 = false;
        g8Var.f4719v0 = false;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(g8Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(g8Var.currentAccount).putChats(messages_messages.chats, false);
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Message message = arrayList2.get(i10);
                i10++;
                arrayList.add(new MessageObject(g8Var.currentAccount, message, false, true));
            }
            if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList.size() < messages_messages.count) {
                z10 = true;
            }
            g8Var.f4718u0 = z10;
            g8Var.f4717t0 = messages_messages.next_rate;
        } else {
            g8Var.f4718u0 = false;
            g8Var.f4717t0 = 0;
        }
        g8Var.f4714q0.N(true);
    }

    public static void T(g8 g8Var) {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i10 = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.f15783id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.out = true;
                tL_message.f18317id = i10;
                tL_message.peer_id = new TLRPC.TL_peerUser();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message.from_id = tL_peerUser;
                TLRPC.Peer peer = tL_message.peer_id;
                long clientUserId = UserConfig.getInstance(g8Var.currentAccount).getClientUserId();
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
                document.f18302id = 0L;
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
                MessageObject messageObject = new MessageObject(g8Var.currentAccount, tL_message, false, true);
                audioEntry.messageObject = messageObject;
                arrayList.add(messageObject);
                i10--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new ai.ba(25, g8Var, arrayList));
    }

    public static boolean c0(String str, String str2, String str3) {
        if (str3 != null) {
            String lowerCase = str3.toLowerCase();
            if (!lowerCase.startsWith(str) && !wh.u(" ", str, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                if (!translitSafe.startsWith(str2) && !wh.u(" ", str2, translitSafe)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        int i11;
        if (i10 == 0) {
            ui uiVar = this.f4709k0;
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
    public final void I(Canvas canvas, View view) {
        if (Build.VERSION.SDK_INT >= 31 && this.f4710l0 != null) {
            X();
            fh.d dVar = this.m0;
            if (dVar != null) {
                dVar.j(this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
                dVar.l();
            }
            fh.d dVar2 = this.f4711n0;
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
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.f4716s0;
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
                    messageObject.setQuery(this.f4716s0);
                    arrayList3.add(messageObject);
                } else if (!TextUtils.isEmpty(lowerCase) && arrayList2 != this.f4701c0) {
                    String musicTitle = messageObject.getMusicTitle();
                    String musicAuthor = messageObject.getMusicAuthor();
                    if (c0(lowerCase, translitSafe, musicTitle) || c0(lowerCase, translitSafe, musicAuthor)) {
                        messageObject.setQuery(this.f4716s0);
                        arrayList3.add(messageObject);
                    }
                } else {
                    messageObject.setQuery(null);
                    arrayList3.add(messageObject);
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (!arrayList.isEmpty() && arrayList.size() > 1) {
                    arrayList.add(x51.B(null));
                    i11 = AndroidUtilities.dp(12.0f);
                } else {
                    i11 = 0;
                }
                this.f4714q0.U();
                arrayList.add(x51.t(str));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList3.get(i13);
                    i13++;
                    a8 a8Var = new a8(this, 0);
                    int i14 = org.telegram.ui.Cells.i7.f20426a;
                    x51 J = x51.J(org.telegram.ui.Cells.i7.class);
                    J.G = (MessageObject) obj2;
                    J.H = a8Var;
                    arrayList.add(J);
                    i11 += AndroidUtilities.dp(56.0f);
                }
                if (z11) {
                    arrayList.add(x51.n(4));
                    arrayList.add(x51.n(4));
                    arrayList.add(x51.n(4));
                    i11 += AndroidUtilities.dp(56.0f) * 3;
                }
                if (z12 && !z11) {
                    x51 c10 = x51.c(i10, R.drawable.arrow_more, LocaleController.getString(R.string.ShowMore));
                    c10.f30253q = true;
                    arrayList.add(c10);
                    i11 += AndroidUtilities.dp(50.0f);
                }
                this.f4714q0.T();
                return i11;
            }
        }
        return 0;
    }

    public final void X() {
        ah.i iVar;
        if (Build.VERSION.SDK_INT >= 31 && (iVar = this.f4710l0) != null) {
            this.N0.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, this.containerView.getMeasuredWidth(), AndroidUtilities.dp(64.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight);
            ArrayList arrayList = this.M0;
            ArrayList arrayList2 = this.O0;
            iVar.g(yf.f0.a(arrayList, 1, arrayList2), arrayList2);
            iVar.e(this.f4713p0, this.containerView.getMeasuredWidth(), this.containerView.getMeasuredHeight());
        }
    }

    public final void Y() {
        if (this.H0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.H0, true);
        }
        this.H0 = -1;
        this.A0 = "";
        this.B0 = false;
        this.f4702d0.clear();
        this.C0 = false;
        this.D0 = false;
    }

    public final void Z() {
        if (this.f4722y0 >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f4722y0, true);
        }
        this.f4722y0 = -1;
        this.f4717t0 = 0;
        this.f4701c0.clear();
        this.f4719v0 = false;
        this.f4720w0 = false;
    }

    public final void a0() {
        String str = MessagesController.getInstance(this.currentAccount).config.musicSearchUsername.get();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.I0;
            String str3 = this.f4716s0;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            if (!TextUtils.equals(str2, str3)) {
                Y();
            }
            if (!this.C0 && !TextUtils.isEmpty(this.f4716s0) && this.f4716s0.length() >= 3) {
                ArrayList arrayList = this.f4702d0;
                if (arrayList.isEmpty() || this.B0) {
                    if (this.E0 == null) {
                        this.E0 = MessagesController.getInstance(this.currentAccount).getUser(str);
                    }
                    if (this.E0 == null) {
                        if (!this.F0 && !this.G0) {
                            this.F0 = true;
                            MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str, new ai.f3(this, 5));
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
                    String str5 = this.f4716s0;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    this.I0 = str4;
                    tL_messages_getInlineBotResults.query = str4;
                    this.H0 = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_getInlineBotResults, new Object(), new x7(this, 1));
                    this.f4714q0.N(true);
                }
            }
        }
    }

    public final void b0() {
        if (!this.Z) {
            String str = this.f4721x0;
            String str2 = this.f4716s0;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            if (!TextUtils.equals(str, str2)) {
                Z();
            }
            if (!this.f4719v0) {
                ArrayList arrayList = this.f4701c0;
                if (!arrayList.isEmpty() && !this.f4718u0) {
                    return;
                }
                this.f4719v0 = true;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
                String str4 = this.f4716s0;
                if (str4 != null) {
                    str3 = str4;
                }
                this.f4721x0 = str3;
                tL_messages_searchGlobal.f18407q = str3;
                tL_messages_searchGlobal.limit = 20;
                if (arrayList.size() > 0) {
                    MessageObject messageObject = (MessageObject) hg.k0.g(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.f4717t0;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.f4722y0 = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_searchGlobal, new ai.m8(this, 4));
                this.f4714q0.N(true);
            }
        }
    }

    public final void d0() {
        float f7 = AndroidUtilities.displaySize.y;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            wl0 wl0Var = this.d;
            if (i10 >= wl0Var.getChildCount()) {
                break;
            }
            View childAt = wl0Var.getChildAt(i10);
            if (RecyclerView.S(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.f4708j0.setTranslationY(Math.max(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, f7));
        if (f7 <= org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) {
            z10 = true;
        }
        this.X.a(z10, true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.musicListLoaded) {
            this.f4714q0.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.f4715r0 != null && MediaController.getInstance().isPlayingMessage(this.f4715r0)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.f4715r0 = null;
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
        MessageObject messageObject = this.f4705g0;
        if (messageObject != null && TextUtils.equals(messageObject.getFileName(), str)) {
            this.f4704f0.run(this.f4705g0);
            g8 g8Var = this.f4699a0;
            if (g8Var != null) {
                g8Var.dismiss();
            }
            dismiss();
        }
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        l61 l61Var = new l61(wl0Var, getContext(), this.currentAccount, 0, false, new x7(this, 0), this.resourcesProvider);
        this.f4714q0 = l61Var;
        l61Var.f26042r = false;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryMusicTitle2);
    }

    @Override
    public final void C(float f7, int i10) {
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
