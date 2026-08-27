package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.bm0;
import org.telegram.ui.dl;
import org.telegram.ui.ff0;
import org.telegram.ui.ol0;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.xm0;

public final class j0 implements Runnable {

    public final int f21922a;

    public final int f21923b;

    public final boolean f21924c;
    public final Object d;

    public final Object f21925e;

    public j0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f21922a = i11;
        this.d = obj;
        this.f21925e = obj2;
        this.f21923b = i10;
        this.f21924c = z10;
    }

    @Override
    public final void run() throws FileNotFoundException {
        TLRPC.PhotoSize photoSizeScaleAndSaveImage;
        int i10;
        RandomAccessFile randomAccessFile;
        switch (this.f21922a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.f21925e, this.f21923b, this.f21924c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.f21925e, this.f21923b, this.f21924c);
                break;
            case 2:
                dl dlVar = (dl) this.d;
                boolean z10 = this.f21924c;
                ArrayList arrayList = (ArrayList) this.f21925e;
                int i11 = this.f21923b;
                rn rnVar = dlVar.f37436b;
                if (!z10) {
                    if (rnVar.f42017d4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            rnVar.getMessagesController().pinMessage(rnVar.f42026e, rnVar.f42039f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        rnVar.getMessagesController().unpinAllMessages(rnVar.f42026e, rnVar.f42039f);
                    }
                }
                if (i11 == rnVar.f42280y3) {
                    rnVar.f42255w3 = null;
                }
                break;
            case 3:
                fs fsVar = (fs) this.d;
                int i13 = this.f21923b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.f21925e;
                boolean z11 = this.f21924c;
                if (i13 == fsVar.Z && TextUtils.equals(tL_messages_searchGlobal.f22491q, fsVar.f28441a0)) {
                    ConnectionsManager.getInstance(fsVar.J).sendRequest(tL_messages_searchGlobal, new i0(fsVar, i13, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                hs hsVar = (hs) this.d;
                int i14 = this.f21923b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.f21925e;
                boolean z12 = this.f21924c;
                if (i14 == hsVar.W && TextUtils.equals(tL_messages_searchGlobal2.f22491q, hsVar.X)) {
                    ConnectionsManager.getInstance(hsVar.J).sendRequest(tL_messages_searchGlobal2, new i0(hsVar, i14, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                hv0 hv0Var = (hv0) this.d;
                boolean z13 = this.f21924c;
                int i15 = this.f21923b;
                s1 s1Var = (s1) this.f21925e;
                if (z13 && hv0Var.O == null && hv0Var.N == null && hv0Var.M == null) {
                    hv0Var.G = 2;
                    hv0Var.T0 = true;
                }
                hv0Var.R0 = false;
                if (hv0Var.U0 || !hv0Var.S0) {
                    hv0Var.Q0 = hv0Var.f29170e1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(s1Var);
                    hv0Var.G();
                    hv0Var.v();
                } else {
                    hv0Var.A(true);
                }
                break;
            case 6:
                s50 s50Var = (s50) this.d;
                TLObject tLObject = (TLObject) this.f21925e;
                int i16 = this.f21923b;
                boolean z14 = this.f21924c;
                String[] strArr = s50Var.P2;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    strArr[i16] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i16] = "";
                }
                for (int i17 = 0; i17 < 2; i17++) {
                    String str = strArr[i17];
                    if (str != null) {
                        if (str.length() == 0) {
                            strArr[i17] = null;
                        }
                    }
                    break;
                }
                if (!z14 && s50Var.Q0() && !s50Var.W0.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] == null && strArr[1] == null && ChatObject.isPublic(s50Var.V0)) {
                    s50Var.u1(null, s50Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(s50Var.V0), true, z14);
                } else {
                    s50Var.u1(strArr[0], strArr[1], false, z14);
                }
                break;
            default:
                xm0 xm0Var = (xm0) this.d;
                ArrayList arrayList2 = (ArrayList) this.f21925e;
                int i18 = this.f21923b;
                boolean z15 = this.f21924c;
                int i19 = xm0Var.O0;
                int iMin = Math.min((i19 == 0 || i19 == 4) ? 20 : 1, arrayList2.size());
                boolean z16 = false;
                int i20 = 0;
                boolean z17 = false;
                while (i20 < iMin) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i20);
                    Bitmap bitmapLoadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, z16);
                    if (bitmapLoadBitmap == null || (photoSizeScaleAndSaveImage = ImageLoader.scaleAndSaveImage(bitmapLoadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) == null) {
                        i10 = i20;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        TLRPC.FileLocation fileLocation = photoSizeScaleAndSaveImage.location;
                        tL_secureFile.dc_id = (int) fileLocation.volume_id;
                        tL_secureFile.f22515id = fileLocation.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        bm0 bm0Var = (bm0) xm0Var.f44534x1;
                        bm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i10 = i20;
                        String strO = a9.p.o(sb2, tL_secureFile.f22515id, ".jpg");
                        xm0 xm0Var2 = bm0Var.d;
                        byte[] bArr = new byte[(int) new File(strO).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(strO, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                                randomAccessFile2 = randomAccessFile;
                                randomAccessFile = randomAccessFile2;
                            }
                            break;
                        } catch (Exception unused2) {
                        }
                        af.h hVarK1 = xm0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) hVarK1.f276c);
                            randomAccessFile.close();
                            break;
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) hVarK1.f277e, tL_secureFile, strO, (byte[]) hVarK1.d, (byte[]) hVarK1.f274a);
                        secureDocument.type = i18;
                        AndroidUtilities.runOnUIThread(new ol0(xm0Var, secureDocument, i18, 0));
                        if (z15 && !z17) {
                            try {
                                MrzRecognizer.Result resultRecognize = MrzRecognizer.recognize(bitmapLoadBitmap, xm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                if (resultRecognize != null) {
                                    try {
                                        AndroidUtilities.runOnUIThread(new ff0(14, xm0Var, resultRecognize));
                                        z17 = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z17 = true;
                                        FileLog.e(th);
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    i20 = i10 + 1;
                    z16 = false;
                }
                SharedConfig.saveConfig();
                break;
        }
    }

    public j0(dl dlVar, boolean z10, ArrayList arrayList, int i10) {
        this.f21922a = 2;
        this.d = dlVar;
        this.f21924c = z10;
        this.f21925e = arrayList;
        this.f21923b = i10;
    }

    public j0(hv0 hv0Var, boolean z10, int i10, s1 s1Var) {
        this.f21922a = 5;
        this.d = hv0Var;
        this.f21924c = z10;
        this.f21923b = i10;
        this.f21925e = s1Var;
    }

    public j0(b51 b51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.f21922a = i11;
        this.d = b51Var;
        this.f21923b = i10;
        this.f21925e = tL_messages_searchGlobal;
        this.f21924c = z10;
    }
}
