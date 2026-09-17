package f6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import c6.p;
import n6.l;
public final class h extends s {
    public final i f9420a;

    public h(i iVar) {
        this.f9420a = iVar;
    }

    @Override
    public final void onCustomAction(String str, Bundle bundle) {
        i.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        i iVar = this.f9420a;
        switch (hashCode) {
            case -1699820260:
                if (str.equals("com.google.android.gms.cast.framework.action.REWIND")) {
                    long j3 = -iVar.f9424e.f8894c;
                    e6.h hVar = iVar.f9432n;
                    if (hVar != null) {
                        long min = Math.min(hVar.g(), Math.max(0L, hVar.a() + j3));
                        e6.h hVar2 = iVar.f9432n;
                        if (hVar2 == null) {
                            return;
                        }
                        hVar2.q(new p(min));
                        return;
                    }
                    return;
                }
                break;
            case -668151673:
                if (str.equals("com.google.android.gms.cast.framework.action.STOP_CASTING")) {
                    d6.g gVar = iVar.d;
                    if (gVar != null) {
                        gVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals("com.google.android.gms.cast.framework.action.DISCONNECT")) {
                    d6.g gVar2 = iVar.d;
                    if (gVar2 != null) {
                        gVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals("com.google.android.gms.cast.framework.action.FORWARD")) {
                    long j10 = iVar.f9424e.f8894c;
                    e6.h hVar3 = iVar.f9432n;
                    if (hVar3 != null) {
                        long min2 = Math.min(hVar3.g(), Math.max(0L, hVar3.a() + j10));
                        e6.h hVar4 = iVar.f9432n;
                        if (hVar4 != null) {
                            hVar4.q(new p(min2));
                            return;
                        }
                        return;
                    }
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(iVar.f9426g);
        iVar.f9421a.sendBroadcast(intent);
    }

    @Override
    public final boolean onMediaButtonEvent(Intent intent) {
        e6.h hVar;
        i.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = this.f9420a.f9432n) != null) {
                hVar.r();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void onPause() {
        i.v.b("onPause", new Object[0]);
        e6.h hVar = this.f9420a.f9432n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onPlay() {
        i.v.b("onPlay", new Object[0]);
        e6.h hVar = this.f9420a.f9432n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override
    public final void onSeekTo(long j3) {
        i.v.b("onSeekTo %d", Long.valueOf(j3));
        e6.h hVar = this.f9420a.f9432n;
        if (hVar == null) {
            return;
        }
        hVar.q(new p(j3));
    }

    @Override
    public final void onSkipToNext() {
        i.v.b("onSkipToNext", new Object[0]);
        e6.h hVar = this.f9420a.f9432n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                e6.h.t();
            } else {
                e6.h.x(new e6.j(hVar, 2));
            }
        }
    }

    @Override
    public final void onSkipToPrevious() {
        i.v.b("onSkipToPrevious", new Object[0]);
        e6.h hVar = this.f9420a.f9432n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (!hVar.w()) {
                e6.h.t();
            } else {
                e6.h.x(new e6.j(hVar, 1));
            }
        }
    }
}
